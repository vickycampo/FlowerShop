package com.flowershop.java.view;

import com.flowershop.java.controller.StockController;
import com.flowershop.java.model.FlowerShop;

public class Main
{
    public static void main (String[] args)
    {
        try {
            FlowerShop theShop = new FlowerShop("The Shop");
            StockController theShopController = new StockController( theShop );
            theShopController.addTree(53 , 20.00 );
            theShopController.addFlower("blue", 55.00 );
            theShopController.addDecoration("Wood", 11 );
            theShopController.addTree(48 , 20.00 );
            theShopController.addFlower("blue", 55.00 );
            theShopController.addDecoration("Wood", 11 );
            theShopController.addTree(32 , 20.00 );
            theShopController.addFlower("blue", 55.00 );
            theShopController.addDecoration("Wood", 11 );

            System.out.println(theShop.toString ());

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }


    }
}
