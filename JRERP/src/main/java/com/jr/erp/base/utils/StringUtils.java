package com.jr.erp.base.utils;

import java.util.List;

import org.apache.commons.lang3.ArrayUtils;

public class StringUtils extends org.apache.commons.lang3.StringUtils
{
    public static String addQuoteToStr(final String inputStr, String token, String quote)
    {
        String result = inputStr;
        String[] splitStr = inputStr.split(token);
        for (int i = 0; i < splitStr.length; i++)
        {
            splitStr[i] = quote + splitStr[i] + quote;
        }
        result = arrToString(splitStr);
        return result;
    }

    public static String addQuoteToStr(String inputStr)
    {
        return addQuoteToStr(inputStr, ",", "'");
    }

    public static String addQuoteToStr(String[] str)
    {
        String inputStr = "";
        if (str != null && str.length > 0)
        {
            for (int i = 0; i < str.length; i++)
            {
                inputStr += str[i] + ",";
            }
            return addQuoteToStr(inputStr, ",", "'");
        } else
        {
            return "''";
        }
    }

    public static String addQuoteToStr(int[] str)
    {
        String inputStr = "";
        if (str != null && str.length > 0)
        {
            for (int i = 0; i < str.length; i++)
            {
                inputStr += str[i] + ",";
            }
            return addQuoteToStr(inputStr, ",", "");
        } else
        {
            return "";
        }
    }

    public static String addQuoteToStr(List<String> list)
    {
        String inputStr = "";
        if (!org.springframework.util.CollectionUtils.isEmpty(list))
        {
            for (int i = 0; i < list.size(); i++)
            {
                inputStr += list.get(i) + ",";
            }
            return addQuoteToStr(inputStr, ",", "'");
        } else
        {
            return "''";
        }
    }

    public static String addQuoteToStr(List<String> list, String quote)
    {
        String inputStr = "";
        if (!org.springframework.util.CollectionUtils.isEmpty(list))
        {
            for (int i = 0; i < list.size(); i++)
            {
                inputStr += list.get(i) + ",";
            }
            return addQuoteToStr(inputStr, ",", quote);
        } else
        {
            return "''";
        }
    }

    public static String arrToString(Object[] arr)
    {
        String result = ArrayUtils.toString(arr);
        result = result.substring(1, result.length() - 1);
        return result;
    }
}
