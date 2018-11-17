package com.jr.erp.sys.set.base.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jr.erp.base.mybatis.AbstractBaseService;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.sys.service.ISysUserService;
import com.jr.erp.sys.set.base.entity.Barcode;
import com.jr.erp.sys.set.base.entity.BarcodeExample;
import com.jr.erp.sys.set.base.service.IBarcodeService;

/**     
 * 类名称：BarcodeServiceImpl    
 * 类描述：条码号service服务类    
 * 创建人：admin    
 * 创建时间：2018年11月17日 下午4:58:29    
 * 修改人：admin    
 * 修改时间：2018年11月17日 下午4:58:29    
 * 修改备注：    
 * @version  1.0    
 */
@Service(value="barcodeService")
public class BarcodeServiceImpl extends AbstractBaseService<Barcode> implements IBarcodeService
{
    private static final String BARCODE_START = "10000000";
    
    @Autowired
    ISysUserService sysUserService;
    @Override
    public String getBarcode()
    {
        String companyNo =ShiroUtils.getCompanyNo();
        String prefix = ShiroUtils.getPrefix();
        if (StringUtils.isEmpty(companyNo) || StringUtils.isEmpty(prefix))
        {
            return null;
        }
        List<String> result = new ArrayList<String>();

        BarcodeExample example = new BarcodeExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo).andPrefixEqualTo(prefix);
        List<Barcode> list = (List) this.selectByExample(example);
        Barcode barcode =null;
        if(CollectionUtils.isNotEmpty(list))
        {
            barcode=list.get(0);
        }
        Integer baseBarCode = 0;
        if (null == barcode)
        {
            barcode = new Barcode();
            barcode.setCompanyNo(companyNo);
            barcode.setUserId(ShiroUtils.getUserId());
            barcode.setPrefix(prefix);
            barcode.setBarcode("" + (Integer.parseInt(BARCODE_START) + 1));
            // 保存
            this.insert(barcode);
            baseBarCode = Integer.parseInt(BARCODE_START);
        } else
        {
            baseBarCode = Integer.parseInt(barcode.getBarcode());
            barcode.setBarcode(String.valueOf(baseBarCode+1));
            this.updateByPrimaryKey(barcode);
        }
        return prefix + (baseBarCode + 1);
    }

    @Override
    public List<String> getBarcode(int number)
    {
        String companyNo =ShiroUtils.getCompanyNo();
        String prefix = ShiroUtils.getPrefix();
        List<String> result = new ArrayList<String>();
        if (StringUtils.isEmpty(companyNo) || StringUtils.isEmpty(prefix))
        {
            return null;
        }
        BarcodeExample example = new BarcodeExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo).andPrefixEqualTo(prefix);
        List<Barcode> list = (List) this.selectByExample(example);
        Barcode barcode =null;
        if(CollectionUtils.isNotEmpty(list))
        {
            barcode=list.get(0);
        }
        Integer baseBarCode = 0;
        if (null == barcode)
        {
            barcode = new Barcode();
            barcode.setCompanyNo(companyNo);
            barcode.setUserId(ShiroUtils.getUserId());
            barcode.setPrefix(prefix);
            barcode.setBarcode("" + (Integer.parseInt(BARCODE_START) + number));
            // 保存
            this.insert(barcode);
            baseBarCode = Integer.parseInt(BARCODE_START);
        } else
        {
            baseBarCode = Integer.parseInt(barcode.getBarcode());
            barcode.setBarcode(String.valueOf(baseBarCode+number));
            this.updateByPrimaryKey(barcode);
        }
        for (int i = 1; i < number+1; i++)
        {
            result.add(prefix + (baseBarCode + i));
        }
        return result;
    }
}
