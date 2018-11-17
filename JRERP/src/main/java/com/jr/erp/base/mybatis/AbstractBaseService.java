package com.jr.erp.base.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.jr.erp.base.utils.JodaUtils;
import com.jr.erp.base.utils.RetPage;
import com.jr.erp.bill.utils.Constance;

@Transactional(rollbackFor = Exception.class)
public class AbstractBaseService<T extends BaseEntity> implements IBaseService<BaseEntity> {

	@Autowired
	protected BaseMapper<T> mapper;

	@Override
	public Integer insert(BaseEntity record) {
	    record.setCreateTime(JodaUtils.getFullDate());
		return mapper.insert((T) record);
	}

	@Override
	public void merge(BaseEntity record) {
		if (record.getId() != null) {
		    record.setUpdateTime(JodaUtils.getFullDate());
			mapper.updateByPrimaryKey((T) record);
		} else {
		    record.setCreateTime(JodaUtils.getFullDate());
			mapper.insert((T) record);
		}
	}

	@Override
	public BaseEntity selectByPrimaryKey(Integer key) {
		return (T) mapper.selectByPrimaryKey(key);
	}

	@Override
	public List<BaseEntity> selectByExample(BaseExample example) {
		return (List<BaseEntity>) mapper.selectByExample(example);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer key) {
		return mapper.deleteByPrimaryKey(key);
	}

    @Override
    public RetPage selectPage(BaseExample criteria)
    {
        List<BaseEntity> data = this.selectByExample(criteria);
        Long count =this.countByExample(criteria);
        return RetPage.ok(count, data);
    }

    @Override
    public Long countByExample(BaseExample criteria)
    {
        return mapper.countByExample(criteria);
    }

    @Override
    public void updateByPrimaryKey(BaseEntity t)
    {
        t.setUpdateTime(JodaUtils.getFullDate());
        mapper.updateByPrimaryKey((T) t);
    }

    public void updateByPrimaryKeySelective(BaseEntity t)
    {
        t.setUpdateTime(JodaUtils.getFullDate());
        mapper.updateByPrimaryKeySelective((T) t);
    }

    @Override
    public void deleteByExample(Object example)
    {
        mapper.deleteByExample(example);
    }

    @Override
    public String selectMaxBillNo(String tableName, String companyNo, String prefix)
    {
        return mapper.selectMaxBillNo(tableName, companyNo, prefix);
    }
    
    public String getBillCanEdit(String tableName, String companyNo, Integer id)
    {
        Integer billStatus = mapper.selectBillStatus(tableName, companyNo, id);
        if(billStatus!=null)
        {
            switch (billStatus)
            {
            case Constance.BILL_STATUS_AUDIT_WAIT:
            case Constance.BILL_STATUS_ONWAY_WAIT:
            case Constance.BILL_STATUS_FINISH:
                return "改单状态为["+billStatus+"],不允许修改";
            case Constance.BILL_STATUS_AUDIT_REJECT:
            case Constance.BILL_STATUS_ONWAY_REJECT:
            case Constance.BILL_STATUS_NEW:
            default:
                break;
            }
        }
        return null;
    }
    
    public boolean getBillExist(String tableName, String companyNo, Integer id)
    {
        int count = mapper.getBillExist(tableName, companyNo, id);
        if(count == 1)
        {
            return true;
        }else
        {
            return false;
        }
    }
}
