package com.jr.erp.bus.stock.vo;

public class StockOperVo
{

    private Integer stockId;

    private Integer numAlt;
    
    private Double mJewelWeightAlt;
    
    private Double goldWeightAlt;

    private Double costPriceAlt;

    private Double labelPriceSumAlt;

    
    private String companyNo;

    private String areaCode;

    private String counterAreaCode;

    private String barcode;
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

    public Double getmJewelWeightAlt()
    {
        return mJewelWeightAlt;
    }

    public void setmJewelWeightAlt(Double mJewelWeightAlt)
    {
        this.mJewelWeightAlt = mJewelWeightAlt;
    }

    public StockOperVo(Integer stockId, Integer numAlt, Double mJewelWeightAlt, Double goldWeightAlt,
            Double costPriceAlt, Double labelPriceSumAlt)
    {
        super();
        this.stockId = stockId;
        this.numAlt = numAlt;
        this.setmJewelWeightAlt(mJewelWeightAlt);
        this.goldWeightAlt = goldWeightAlt;
        this.costPriceAlt = costPriceAlt;
        this.labelPriceSumAlt = labelPriceSumAlt;
    }
    
    public StockOperVo(String companyNo, String areaCode, String counterAreaCode,
            String barcode,Integer numAlt, Double mJewelWeightAlt, Double goldWeightAlt,
            Double costPriceAlt, Double labelPriceSumAlt)
    {
        super();
        this.companyNo = companyNo;
        this.areaCode = areaCode;
        this.counterAreaCode = counterAreaCode;
        this.barcode = barcode;
        this.numAlt = numAlt;
        this.mJewelWeightAlt = mJewelWeightAlt;
        this.goldWeightAlt = goldWeightAlt;
        this.costPriceAlt = costPriceAlt;
        this.labelPriceSumAlt = labelPriceSumAlt;
    }
    
}
