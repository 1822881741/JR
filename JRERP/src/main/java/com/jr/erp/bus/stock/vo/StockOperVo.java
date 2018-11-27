package com.jr.erp.bus.stock.vo;

public class StockOperVo
{
    private Integer oldStockId;

    private Integer newStockId;
    
    private Integer numAlt;
    
    private Double mJewelWeightAlt;
    
    private Double goldWeightAlt;

    private Double costPriceAlt;

    private Double labelPriceSumAlt;

    private String secondType;
    
    public StockOperVo(Integer oldStockId,Integer newStockId,String secondType, Integer numAlt, Double mJewelWeightAlt, Double goldWeightAlt,
            Double costPriceAlt, Double labelPriceSumAlt)
    {
        super();
        this.oldStockId=oldStockId;
        this.newStockId = newStockId;
        this.secondType = secondType;
        this.numAlt = numAlt;
        this.mJewelWeightAlt=mJewelWeightAlt;
        this.goldWeightAlt = goldWeightAlt;
        this.costPriceAlt = costPriceAlt;
        this.labelPriceSumAlt = labelPriceSumAlt;
    }

    public Integer getOldStockId()
    {
        return oldStockId;
    }

    public Integer getNewStockId()
    {
        return newStockId;
    }

    public Integer getNumAlt()
    {
        return numAlt;
    }

    public Double getmJewelWeightAlt()
    {
        return mJewelWeightAlt;
    }

    public Double getGoldWeightAlt()
    {
        return goldWeightAlt;
    }

    public Double getCostPriceAlt()
    {
        return costPriceAlt;
    }

    public Double getLabelPriceSumAlt()
    {
        return labelPriceSumAlt;
    }

    public String getSecondType()
    {
        return secondType;
    }

    public void setOldStockId(Integer oldStockId)
    {
        this.oldStockId = oldStockId;
    }

    public void setNewStockId(Integer newStockId)
    {
        this.newStockId = newStockId;
    }

    public void setNumAlt(Integer numAlt)
    {
        this.numAlt = numAlt;
    }

    public void setmJewelWeightAlt(Double mJewelWeightAlt)
    {
        this.mJewelWeightAlt = mJewelWeightAlt;
    }

    public void setGoldWeightAlt(Double goldWeightAlt)
    {
        this.goldWeightAlt = goldWeightAlt;
    }

    public void setCostPriceAlt(Double costPriceAlt)
    {
        this.costPriceAlt = costPriceAlt;
    }

    public void setLabelPriceSumAlt(Double labelPriceSumAlt)
    {
        this.labelPriceSumAlt = labelPriceSumAlt;
    }

    public void setSecondType(String secondType)
    {
        this.secondType = secondType;
    }
}
