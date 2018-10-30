package com.jr.erp.sys.vo;

import java.util.List;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

public class PurchaseColumnVo
{

    private List<JSONObject> columnConfig;
    
    private JSONArray select2Option;

    public List<JSONObject> getColumnConfig()
    {
        return columnConfig;
    }

    public void setColumnConfig(List<JSONObject> columnConfig)
    {
        this.columnConfig = columnConfig;
    }

    public JSONArray getSelect2Option()
    {
        return select2Option;
    }

    public void setSelect2Option(JSONArray select2Option)
    {
        this.select2Option = select2Option;
    }
}
