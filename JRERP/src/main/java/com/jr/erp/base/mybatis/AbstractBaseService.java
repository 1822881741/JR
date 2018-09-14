package com.jr.erp.base.mybatis;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.jr.erp.base.utils.RetPage;

@Transactional(rollbackFor = Exception.class)
public class AbstractBaseService<T extends BaseEntity> implements IBaseService<BaseEntity> {

	@Autowired
	protected BaseMapper<T> mapper;

	@Override
	public Integer insert(BaseEntity record) {
	    record.setCreateTime(new Date());
		return mapper.insert((T) record);
	}

	@Override
	public void merge(BaseEntity record) {
		if (record.getId() != null) {
		    record.setUpdateTime(new Date());
			mapper.updateByPrimaryKey((T) record);
		} else {
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
        t.setUpdateTime(new Date());
        mapper.updateByPrimaryKey((T) t);
    }

    public void updateByPrimaryKeySelective(BaseEntity t)
    {
        t.setUpdateTime(new Date());
        mapper.updateByPrimaryKeySelective((T) t);
    }
}
