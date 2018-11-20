package com.jr.erp.common.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

@Controller
@RequestMapping("/common")
public class CommonController
{
    
    @RequestMapping(value = "/queryBuilder.do")
    public String queryBuilder(String module,HttpServletRequest request, Model model)
    {
        JSONArray ja = new JSONArray();
        switch (module)
        {
        case "purchase":
            JSONObject a1 = new JSONObject();
            a1.put("id", "barcode");
            a1.put("value", "条码");
            a1.put("type", "string");
            ja.add(a1);

            JSONObject a2 = new JSONObject();
            a2.put("id", "goldWeight");
            a2.put("value", "金重");
            a2.put("type", "number");
            ja.add(a2);

            JSONObject a3 = new JSONObject();
            a3.put("id", "billDate");
            a3.put("value", "入库时间");
            a3.put("type", "date");
            ja.add(a3);

            JSONObject a4 = new JSONObject();
            a4.put("id", "certificateNo");
            a4.put("value", "证书号");
            a4.put("type", "string");
            ja.add(a4);

            JSONObject a5 = new JSONObject();
            a5.put("id", "brandName");
            a5.put("value", "品牌");
            a5.put("type", "string");
            ja.add(a5);

            JSONObject a6 = new JSONObject();
            a6.put("id", "productName");
            a6.put("value", "商品名称");
            a6.put("type", "string");
            ja.add(a6);

            JSONObject a7 = new JSONObject();
            a7.put("id", "num");
            a7.put("value", "数量");
            a7.put("type", "number");
            ja.add(a7);

            break;
        default:
            break;
        }
        model.addAttribute("fields", ja.toString());
        return "common/queryBuilder";
    }
}
