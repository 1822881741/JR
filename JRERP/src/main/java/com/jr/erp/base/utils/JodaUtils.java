package com.jr.erp.base.utils;

import org.joda.time.DateTime;

public class JodaUtils
{

    public static String getShortDate(String format)
    {
        return DateTime.now().toString(format);
    }
    
    public static String getShortDate()
    {
        return getShortDate("yyyy-MM-dd");
    }
    
    public static String getFullDate(String format)
    {
        return getShortDate(format);
    }
    
    public static String getFullDate()
    {
        return getShortDate("yyyy-MM-dd HH:mm:ss");
    }
}
