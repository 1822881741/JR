package com.jr.erp.sheet.purchase.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.alibaba.fastjson.JSON;
import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.service.impl.IFileUploadService;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.Ret;
import com.jr.erp.sys.entity.SysAreaInfoExample;
import com.jr.erp.sys.entity.SysPurchaseSechemeExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.service.ISysAreaInfoService;
import com.jr.erp.sys.service.ISysCategorySetService;
import com.jr.erp.sys.service.ISysPurchaseSechemeService;
import com.jr.erp.sys.vo.PurchaseColumnVo;

@Controller
@RequestMapping("/purchase")
public class PurchaseController {    
    
    @Autowired
    private ISysPurchaseSechemeService sysPurchaseSechemeService;
    
    @Autowired
    private ISysCategorySetService sysCategorySetService;
    
    @Autowired
    private ISysAreaInfoService sysAreaInfoService;
    
    @Autowired
    IFileUploadService fileUploadService;
    
    @RequestMapping(value = "/editBill.do")
    public String editBill(HttpServletRequest request, Model model)
    {
        SysUser user= ShiroUtils.getSysUser();
        String companyNo=user.getCompanyNo();
        //获取导入方案列表
        SysPurchaseSechemeExample example = new SysPurchaseSechemeExample();
        example.createCriteria().andCompanyNoEqualTo(companyNo);
        List<BaseEntity> sechemeList = sysPurchaseSechemeService.selectByExample(example);
        model.addAttribute("sechemeList",sechemeList);
        
        //供应商列表
        List<String> supplyList = sysCategorySetService.getNameList(companyNo, "supplier");
        model.addAttribute("supplierList",supplyList);
        
        //进货类型
        List<String> brandNameList = sysCategorySetService.getNameList(companyNo, "brandName");
        model.addAttribute("brandNameList",brandNameList);
        
        //进货类型
        List<String> purchaseTypeList = sysCategorySetService.getNameList(companyNo, "purchaseType");
        model.addAttribute("purchaseTypeList",purchaseTypeList);
        
        //进货门店
        SysAreaInfoExample areaExample = new SysAreaInfoExample();
        areaExample.createCriteria().andCompanyNoEqualTo(companyNo).andAreaCodeLike(user.getAreaCode()+"%").andStatusEqualTo(1).andAreaTypeIn(Arrays.asList(new Integer[]{0,1,2}));
        List<BaseEntity> areaList = sysAreaInfoService.selectByExample(areaExample);
        model.addAttribute("areaList",areaList);
        
        return "bill/purchase/editPurchaseBill";
    }
    
    /**    
     * viewImportBill(这里用一句话描述这个方法的作用)    
     * 跳转到导入界面       
     * @param @param request
     * @param @param model
     * @param @return     
     * @return String
     * @Exception 异常对象
    */
    @RequestMapping(value = "/viewImportBill.do")
    public String viewImportBill(Integer sechemeId,HttpServletRequest request, Model model)
    {
        SysUser user = ShiroUtils.getSysUser();
        String companyNo = user.getCompanyNo();
        model.addAttribute("sechemeId", sechemeId);

        PurchaseColumnVo list = sysPurchaseSechemeService.getPurchaseColumnConfig(sechemeId);
        model.addAttribute("columnConfig", JSON.toJSONString(list.getColumnConfig()));
        model.addAttribute("select2Option", JSON.toJSONString(list.getSelect2Option()));
        return "bill/purchase/viewImportBill";
    }
    
    /**    
     * uploadImportFile(这里用一句话描述这个方法的作用)    
     * 上传文件     
     * @param @param file
     * @param @param folder
     * @param @param request
     * @param @param response
     * @param @return     
     * @return Ret
     * @Exception 异常对象
    */
    @ResponseBody
    @RequestMapping(value ={ "/uploadImportFile.do" })
    public Ret uploadImportFile(@RequestParam MultipartFile file,Integer sechemeId, HttpServletRequest request, HttpServletResponse response)
    {
        SysUser user= ShiroUtils.getSysUser();
        String companyNo=user.getCompanyNo();
//        fileUploadService.excelFileUpload(file, companyNo);
        return Ret.ok("33");
    }
    
}    