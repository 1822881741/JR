package com.jr.erp.base.utils;

public class NumberUtils extends org.apache.commons.lang3.math.NumberUtils
{
    /**
     * getDouble(这里用一句话描述这个方法的作用) 数据转型
     * 
     * @param @param value
     * @param @return
     * @return double
     * @Exception 异常对象
     */
    public static double toDouble(Double value)
    {
        if (value == null)
        {
            return 0.0;
        } else
        {
            return Double.valueOf(value);
        }
    }

    public static double toDouble(Double value, Double dftValue)
    {
        if (value == null)
        {
            return dftValue;
        } else
        {
            return Double.valueOf(value);
        }
    }

    /**
     * getInt(这里用一句话描述这个方法的作用) 数据转型
     * 
     * @param @param value
     * @param @return
     * @return double
     * @Exception 异常对象
     */
    public static int toInt(Integer value)
    {
        if (value == null)
        {
            return 0;
        } else
        {
            return Integer.valueOf(value);
        }
    }
}
