package com.jr.erp.sys.service.impl;

import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.druid.sql.visitor.functions.Char;
import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.TreeUtils;
import com.jr.erp.sys.dao.SysAreaInfoMapper;
import com.jr.erp.sys.entity.SysAreaInfo;
import com.jr.erp.sys.entity.SysAreaInfoExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysAreaInfoService;

/**
 * @author Administrator
 * 系统门店的service
 */
@Service(value="sysAreaService")
public class SysAreaInfoServiceImpl extends AbstractBaseService<SysAreaInfo> implements ISysAreaInfoService{

	@Autowired
	private SysAreaInfoMapper sysAreaInfoMapper;

    @Override
    public SysAreaInfo selectByAreaCode(String companyNo, String regionCode)
    {
        SysAreaInfoExample example = new SysAreaInfoExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo).andAreaCodeEqualTo(regionCode);
        List<SysAreaInfo> list = sysAreaInfoMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list))
        {
            return list.get(0);
        }
        return null;
    }

    @Override
    public List<SysAreaInfo> selectAllStoreArea(String companyNo, String parentAreaCode)
    {
        SysAreaInfoExample example = new SysAreaInfoExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo).andAreaCodeLike(parentAreaCode+"%").andAreaTypeEqualTo(2);
        List<SysAreaInfo> list = sysAreaInfoMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<SysAreaInfo> selectInUseStoreArea(String companyNo, String parentAreaCode)
    {
        SysAreaInfoExample example = new SysAreaInfoExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo).andAreaCodeLike(parentAreaCode+"%").andAreaTypeEqualTo(2).andStatusEqualTo(1);
        List<SysAreaInfo> list = sysAreaInfoMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<SysAreaInfo> selectAllCounterArea(String companyNo, String parentAreaCode)
    {
        SysAreaInfoExample example = new SysAreaInfoExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo).andAreaCodeLike(parentAreaCode+"%").andAreaTypeEqualTo(3);
        List<SysAreaInfo> list = sysAreaInfoMapper.selectByExample(example);
        return list;
    }

    @Override
    public List<SysAreaInfo> selectInUseCounterArea(String companyNo, String parentAreaCode)
    {
        SysAreaInfoExample example = new SysAreaInfoExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo).andAreaCodeLike(parentAreaCode+"%").andAreaTypeEqualTo(3).andStatusEqualTo(1);
        List<SysAreaInfo> list = sysAreaInfoMapper.selectByExample(example);
        return list;
    }

    @Override
    public SysAreaInfo selectMaxAreaInfo(String companyNo, String parentAreaCode, Integer areaType)
    {
        SysAreaInfoExample example = new SysAreaInfoExample();
        example.setOrderByClause("areaCode desc");
        example.setPage(1);
        example.setLimit(1);
        example.createCriteria().andCompanyNoEqualTo(companyNo).andAreaCodeLike(parentAreaCode + "%").andAreaTypeEqualTo(areaType);
        List<SysAreaInfo> list = sysAreaInfoMapper.selectByExample(example);
        if (CollectionUtils.isNotEmpty(list))
        {
            return list.get(0);
        }
        return null;
    }

    @Override
    public String getNextCode(String companyNo, String parentAreaCode, Integer areaType)
    {
        SysAreaInfo areaInfo = selectMaxAreaInfo(companyNo, parentAreaCode, areaType);
        if (areaInfo == null)
        {
            return parentAreaCode + "001";
        } else
        {
            String maxString = areaInfo.getAreaCode();
            char[] maxChar = maxString.toCharArray();
            String prefix = "";
            for (char c : maxChar)
            {
                if (c != '0')
                {
                    break;
                } else
                {
                    prefix += c;
                }
            }
            int nextCode = Integer.valueOf(maxString) + 1;
            return prefix + nextCode;
        }
    }
    public static void main(String[] args)
    {
        String maxString = "001899";
        char[] maxChar = maxString.toCharArray();
        String prefix = "";
        for (char c : maxChar)
        {
            if (c != '0')
            {
                break;
            } else
            {
                prefix += c;
            }
        }
        int nextCode = Integer.valueOf(maxString) + 1;
        System.out.println(prefix + nextCode);
    }

    @Override
    public SysAreaInfo getAreaTree(String companyNo)
    {
        SysUser user = ShiroUtils.getSysUser();
        SysAreaInfoExample exampale = new SysAreaInfoExample();
        exampale.createCriteria().andCompanyNoEqualTo(user.getCompanyNo());
        exampale.setOrderByClause(" id");
        List<BaseEntity> areaList = this.selectByExample(exampale);
        SysAreaInfo result = (SysAreaInfo) areaList.get(0);
        TreeUtils.createTree(areaList, result, "id", "parentId", "itemList");
        return result;
    }
}
