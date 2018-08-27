package com.jr.erp.freemarker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller    
public class FreemarkerController {    
    @RequestMapping("/hijsp")    
    public String sayHello(ModelMap map){    
        System.out.println("say hi ……");    
    
        map.put("name", "kimi");    
   
        return "/hijsp";
    }    
    
    @RequestMapping("/hiftm")    
    public String hiftm(ModelMap map){    
        System.out.println("say hi ……");    
    
        map.put("name", "kimi");    
        map.put("CREATE_HTML", true);
        return "/hiftm";
    }   
}    