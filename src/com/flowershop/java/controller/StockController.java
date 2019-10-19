package com.flowershop.java.controller;

import com.flowershop.java.model.*;

import java.util.HashMap;

public class StockController
{
    HashMap itemsList;
    private Stock shopStock;

    public StockController ( FlowerShop flowerShop ) throws Exception
    {
        setShopStock( flowerShop.getShopStock() );
        itemsList = shopStock.getItemsList();
    }

    public Stock getShopStock()
    {
        return shopStock;
    }

    public void setShopStock(Stock shopStock) throws Exception
    {
        if ( shopStock != null )
            this.shopStock = shopStock;
        else
            throw (new Exception("The Shop Stock has to be created before creating the controller."));
    }

    public int addTree (double height , double price ) throws Exception
    {
        int nextAvailableId = shopStock.getnextAvailableId();
        AbstractItem tree = new Tree( height , price );
        itemsList.put( nextAvailableId , tree );
        return nextAvailableId;
    }
    public int addFlower ( String color , double price ) throws Exception
    {
        int nextAvailableId = shopStock.getnextAvailableId();
        AbstractItem flower = new Flower( color , price );
        itemsList.put( nextAvailableId , flower );
        return nextAvailableId;
    }
    public int addDecoration ( String material , double price ) throws Exception
    {
        int nextAvailableId = shopStock.getnextAvailableId();
        AbstractItem decoration = new Decoration( material , price );
        itemsList.put( nextAvailableId , decoration );
        return nextAvailableId;
    }
}
