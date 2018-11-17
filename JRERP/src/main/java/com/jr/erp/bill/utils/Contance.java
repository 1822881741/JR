package com.jr.erp.bill.utils;

public class Contance
{

    //0：新建状态；10：待审核  15 ：审核驳回  20：待接受  25：接收驳回  100：全部完成
    public static final int BILL_STATUS_NEW = 0;
    public static final int BILL_STATUS_AUDIT_WAIT = 10;
    public static final int BILL_STATUS_AUDIT_REJECT = 15;
    public static final int BILL_STATUS_ONWAY_WAIT = 20;
    public static final int BILL_STATUS_ONWAY_REJECT = 25;
    public static final int BILL_STATUS_FINISH=100;

}
