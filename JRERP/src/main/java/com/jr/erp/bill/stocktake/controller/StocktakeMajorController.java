package com.jr.erp.bill.stocktake.controller;

import java.util.Arrays;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONArray;
import com.jr.erp.base.mybatis.BaseEntity;
import com.jr.erp.base.shiro.ShiroUtils;
import com.jr.erp.base.utils.JodaUtils;
import com.jr.erp.base.utils.NumberUtils;
import com.jr.erp.base.utils.Ret;
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
public class StocktakeMajorController
{

    @Autowired
    private IBillStocktakeService billStocktakeService;

    @Autowired
    private IBaseTypeService baseTypeService;

    @Autowired
    private ISysAreaInfoService sysAreaInfoService;

    @Autowired
    IBillNoGeneratorService billNoGeneratorService;

    @Autowired
    IProductCategoryService productCategoryService;
    
    @Autowired
    ISysUserService sysUserService;
    
    @RequestMapping(value = "/viewStocktakeMajor.do")
    public String viewStocktakeMajor(HttpServletRequest request, Model model)
    {
        List<BillStocktake> noFinishList = billStocktakeService.getBillStocktakeList(Constance.BILL_STATUS_NEW);
        JSONArray ja = new JSONArray((List)noFinishList);
        model.addAttribute("noFinishList",ja.toJSONString());
        
        List<BillStocktake> finishList = billStocktakeService.getBillStocktakeList(Constance.BILL_STATUS_FINISH);
        JSONArray jas = new JSONArray((List)finishList);
        model.addAttribute("finishList",jas.toJSONString());
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
    
    /**    
     * saveStocktakeMajor(这里用一句话描述这个方法的作用)    
     * 保存盘点主方案
     * @param @param billStocktake
     * @param @param request
     * @param @param model
     * @param @return     
     * @return Ret
     * @Exception 异常对象
    */
    @RequestMapping(value = "/saveStocktakeMajor.do")
    @ResponseBody
    public Ret saveStocktakeMajor(BillStocktake billStocktake, HttpServletRequest request, Model model)
    {
        billStocktakeService.saveStocktakeMajor(billStocktake);
        return Ret.ok("保存成功");
    }
    
    @RequestMapping(value = "/deleteStocktakeMajor.do")
    @ResponseBody
    public Ret deleteStocktakeMajor(Integer id, HttpServletRequest request, Model model)
    {
        billStocktakeService.deleteStocktakeMajor(id);
        return Ret.ok("保存成功");
    }
}