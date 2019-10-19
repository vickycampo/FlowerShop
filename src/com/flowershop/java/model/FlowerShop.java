package com.flowershop.java.model;

import com.flowershop.java.controller.StockController;

public class FlowerShop
{
    private String shopName;
    private Stock shopStock;

    public FlowerShop ( String shopName ) throws Exception
    {
        setShopName( shopName );
        shopStock = new Stock();
    }
    public String getShopName()
    {
        return shopName;
    }

    public void setShopName(String shopName) throws Exception
    {
        if ((shopName != "") && (shopName != null))
            this.shopName = shopName;
        else
            throw (new Exception("The shopName cannot be empty or null."));
    }

    public Stock getShopStock()
    {
        return shopStock;
    }

    @Override
    public String toString ()
    {
        return shopName + ": \n" + shopStock.toString();
    }
}
