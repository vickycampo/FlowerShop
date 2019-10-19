package com.flowershop.java.model;

public abstract class AbstractItem
{
    private double price;

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price) throws Exception
    {
        if ( price > 0 )
            this.price = price;
        else
            throw (new Exception("The price must be greater than 0."));
    }
}
