package com.jr.erp.bus.stock.vo;

public class StockOperVo
{

    /**
     * 正负号 1：加库存 -1 减库存
     */
    private Integer sign;

    private Integer stockId;

    private Integer numAlt;

    private Double costPriceAlt;

    private Double labelPriceSumAlt;

    private Double goldWeightAlt;

    public Integer getSign()
    {
        return sign;
    }

    public void setSign(Integer sign)
    {
        this.sign = sign;
    }

    public Integer getStockId()
    {
        return stockId;
    }

    public void setStockId(Integer stockId)
    {
        this.stockId = stockId;
    }

    public Integer getNumAlt()
    {
        return numAlt;
    }

    public void setNumAlt(Integer numAlt)
    {
        this.numAlt = numAlt;
    }

    public Double getCostPriceAlt()
    {
        return costPriceAlt;
    }

    public void setCostPriceAlt(Double costPriceAlt)
    {
        this.costPriceAlt = costPriceAlt;
    }

    public Double getLabelPriceSumAlt()
    {
        return labelPriceSumAlt;
    }

    public void setLabelPriceSumAlt(Double labelPriceSumAlt)
    {
        this.labelPriceSumAlt = labelPriceSumAlt;
    }

    public Double getGoldWeightAlt()
    {
        return goldWeightAlt;
    }

    public void setGoldWeightAlt(Double goldWeightAlt)
    {
        this.goldWeightAlt = goldWeightAlt;
    }

    public StockOperVo(Integer sign, Integer stockId, Integer numAlt, Double costPriceAlt, Double labelPriceSumAlt,
            Double goldWeightAlt)
    {
        super();
        this.sign = sign;
        this.stockId = stockId;
        this.numAlt = numAlt;
        this.costPriceAlt = costPriceAlt;
        this.labelPriceSumAlt = labelPriceSumAlt;
        this.goldWeightAlt = goldWeightAlt;
    }
    
}
