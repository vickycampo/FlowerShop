package com.flowershop.java.model;

public class Flower extends AbstractItem
{
    private String color;

    public Flower ( String color , double price ) throws Exception
    {
        setColor( color );
        setPrice ( price );
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color) throws Exception
    {
        if ((color != "") && (color != null))
            this.color = color;
        else
            throw (new Exception("The color cannot be empty or null."));
    }
    @Override
    public String toString()
    {
        return ("Color: " + color + " Precio: " + getPrice());
    }
}
