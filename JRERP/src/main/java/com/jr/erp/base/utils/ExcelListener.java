package com.jr.erp.base.utils;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

public class ExcelListener extends AnalysisEventListener
{
    // 可以通过实例获取该值
    private List<List<String>> datas = new ArrayList<List<String>>();

    @Override
    public void invoke(Object object, AnalysisContext context)
    {
        List<String> list = (List<String>)object;
        if(isRowIsNull(list))
        {
            context.interrupt();
        }
        datas.add(list);
        doSomething(list);
    }

    private void doSomething(Object object)
    {
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context)
    {
        System.out.println("doAfterAllAnalysed");
    }

    public List<List<String>> getDatas()
    {
        return datas;
    }

    public void setDatas(List<List<String>> datas)
    {
        this.datas = datas;
    }
    
    public static boolean isRowIsNull(List<String> strings)
    {
        if(strings != null)
        {
            for(String s : strings)
            {
                if(StringUtils.isNotEmpty(s))
                {
                    return false;
                }
            }
        }
        return true;
    }
}
