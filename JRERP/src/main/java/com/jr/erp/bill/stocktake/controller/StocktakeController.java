package com.jr.erp.bill.stocktake.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.JodaUtils;
import com.jr.erp.bill.purchase.service.IBillPurchaseService;
import com.jr.erp.bill.stocktake.entity.BillStocktake;
import com.jr.erp.bill.stocktake.service.IBillStocktakeService;
import com.jr.erp.bill.utils.Constance;
import com.jr.erp.sys.entity.SysAreaInfoExample;
import com.jr.erp.sys.entity.SysUser;
import com.jr.erp.sys.entity.SysUserExample;
import com.jr.erp.sys.service.ISysAreaInfoService;
import com.jr.erp.sys.service.ISysUserService;
import com.jr.erp.sys.set.base.service.IBaseTypeService;
import com.jr.erp.sys.set.base.service.IProductCategoryService;
import com.jr.erp.sys.utils.service.IBillNoGeneratorService;

@Controller
@RequestMapping("/stocktake")
public class StocktakeController
{

    @Autowired
    private IBillStocktakeService billStocktakeService;

    @Autowired
    private IBaseTypeService baseTypeService;

    @Autowired
    private ISysAreaInfoService sysAreaInfoService;

    @Autowired
    IBillPurchaseService billPurchaseService;

    @Autowired
    IBillNoGeneratorService billNoGeneratorService;

    @Autowired
    IProductCategoryService productCategoryService;
    
    @Autowired
    ISysUserService sysUserService;
    
    @RequestMapping(value = "/viewStocktakeMajor.do")
    public String viewStocktakeMajorList(HttpServletRequest request, Model model)
    {
        SysUser user = ShiroUtils.getSysUser();
        return "bill/stocktake/viewStocktakeMajor";
    }

    /**    
     * addStocktakeMajor(这里用一句话描述这个方法的作用)    
     * 创建主单 
     * @param @param request
     * @param @param model
     * @param @return     
     * @return String
     * @Exception 异常对象
    */
    @RequestMapping(value = "/addStocktakeMajor.do")
    public String addStocktakeMajor(HttpServletRequest request, Model model)
    {
        SysUser user = ShiroUtils.getSysUser();
        String companyNo = user.getCompanyNo();

        // 进货门店
        SysAreaInfoExample areaExample = new SysAreaInfoExample();
        areaExample.createCriteria().andCompanyNoEqualTo(companyNo).andAreaCodeLike(user.getAreaCode() + "%").andStatusEqualTo(1).andAreaTypeIn(Arrays.asList(new Integer[]
        { 0, 1, 2 }));
        List<BaseEntity> areaList = sysAreaInfoService.selectByExample(areaExample);
        model.addAttribute("areaList", areaList);

        BillStocktake billStocktake = new BillStocktake();
        billStocktake.setBillDate(JodaUtils.getShortDate());
        billStocktake.setSysBillNo(billNoGeneratorService.getNextBillNo(ShiroUtils.getCompanyNo(),Constance.BILL_TYPE_STOCKTAKE,ShiroUtils.getSysUser().getUserSheetNoPrefix()));
        billStocktake.setBillNo(billStocktake.getSysBillNo());
        model.addAttribute("billStocktake", billStocktake);
        
        
        List<String> categoryNameList= baseTypeService.getNameList(user.getCompanyNo(),"categoryName");
        model.addAttribute("categoryNameList", categoryNameList);
        
        List<String> productNameList = productCategoryService.getProductName(ShiroUtils.getCompanyNo());
        model.addAttribute("productNameList", productNameList);
        
        SysUserExample userExample = new SysUserExample();
        userExample.createCriteria().andCompanyNoEqualTo(user.getCompanyNo()).andAreaCodeEqualTo(user.getAreaCode());
        List<SysUser> userList = (List)sysUserService.selectByExample(userExample);
        model.addAttribute("userList", userList);
        return "bill/stocktake/addStocktakeMajor";
    }
}