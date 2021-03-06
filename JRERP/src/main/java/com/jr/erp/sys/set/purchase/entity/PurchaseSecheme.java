package com.jr.erp.sys.set.purchase.entity;

import java.util.List;

import com.jr.erp.base.mybatis.BaseEntity;

public class PurchaseSecheme extends BaseEntity {
    /**
     * 策略名称
     */
    private String name;

    /**
     * 商品大类
     */
    private String firstType;

    /**
     * 商品小类
     */
    private String secondType;

    /**
     * 当前状态 0：不可用，1可用
     */
    private Integer status;

    /**
     * 创建用户
     */
    private String createUser;

    /**
     * 描述信息
     */
    private String remarks;

    /**
     * 是否是系统类型1：是 ，0不是
     */
    private Integer isSysDef;

    private List<PurchaseSechemeItem> itemList;
    /**
     * 策略名称
     * @return name 策略名称
     */
    public String getName() {
        return name;
    }

    /**
     * 策略名称
     * @param name 策略名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 商品大类
     * @return firstType 商品大类
     */
    public String getFirstType() {
        return firstType;
    }

    /**
     * 商品大类
     * @param firstType 商品大类
     */
    public void setFirstType(String firstType) {
        this.firstType = firstType == null ? null : firstType.trim();
    }

    /**
     * 商品小类
     * @return secondType 商品小类
     */
    public String getSecondType() {
        return secondType;
    }

    /**
     * 商品小类
     * @param secondType 商品小类
     */
    public void setSecondType(String secondType) {
        this.secondType = secondType == null ? null : secondType.trim();
    }

    /**
     * 当前状态 0：不可用，1可用
     * @return status 当前状态 0：不可用，1可用
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 当前状态 0：不可用，1可用
     * @param status 当前状态 0：不可用，1可用
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 创建用户
     * @return createUser 创建用户
     */
    public String getCreateUser() {
        return createUser;
    }

    /**
     * 创建用户
     * @param createUser 创建用户
     */
    public void setCreateUser(String createUser) {
        this.createUser = createUser == null ? null : createUser.trim();
    }

    /**
     * 描述信息
     * @return remarks 描述信息
     */
    public String getRemarks() {
        return remarks;
    }

    /**
     * 描述信息
     * @param remarks 描述信息
     */
    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    /**
     * 是否是系统类型1：是 ，0不是
     * @return isSysDef 是否是系统类型1：是 ，0不是
     */
    public Integer getIsSysDef() {
        return isSysDef;
    }

    /**
     * 是否是系统类型1：是 ，0不是
     * @param isSysDef 是否是系统类型1：是 ，0不是
     */
    public void setIsSysDef(Integer isSysDef) {
        this.isSysDef = isSysDef;
    }

    public List<PurchaseSechemeItem> getItemList()
    {
        return itemList;
    }

    public void setItemList(List<PurchaseSechemeItem> itemList)
    {
        this.itemList = itemList;
    }
}