package com.jr.erp.base.mybatis;

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
		return mapper.insert((T) record);
	}

	@Override
	public void merge(BaseEntity record) {
		if (record.getId() != null) {
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
	public List<BaseEntity> selectByExample(Object example) {
		return (List<BaseEntity>) mapper.selectByExample(example);
	}

	@Override
	public Integer deleteByPrimaryKey(Integer key) {
		return mapper.deleteByPrimaryKey(key);
	}

    @Override
    public RetPage selectPage(Object criteria)
    {
        List<BaseEntity> data = this.selectByExample(criteria);
        Long count =this.countByExample(criteria);
        return RetPage.ok(count, data);
    }

    @Override
    public Long countByExample(Object criteria)
    {
        return mapper.countByExample(criteria);
    }
}
