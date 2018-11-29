package com.jr.erp.bill.utils;

public class Constance
{
    // 单据类型 1：进货
    public static final int BILL_TYPE_PURCHASE=1;
    public static final int BILL_TYPE_PURCHAS_RETURN=1;
    
    //调拨单 20
    public static final int BILL_TYPE_TRANSFER=20;
    
    //盘点单
    public static final int BILL_TYPE_STOCKTAKE=30;
    
    //0：新建状态；10：待审核  15 ：审核驳回  20：待接受  25：接收驳回  100：全部完成
    public static final int BILL_STATUS_NEW = 0;
    public static final int BILL_STATUS_AUDIT_WAIT = 10;
    public static final int BILL_STATUS_AUDIT_REJECT = 15;
    public static final int BILL_STATUS_ONWAY_WAIT = 20;
    public static final int BILL_STATUS_ONWAY_REJECT = 25;
    public static final int BILL_STATUS_FINISH=100;

}
