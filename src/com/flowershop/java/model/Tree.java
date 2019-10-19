package com.flowershop.java.model;

public class Tree extends AbstractItem
{
    private double height;

    public Tree ( double height , double price ) throws Exception
    {
        setHeight( height );
        setPrice ( price );
    }

    public double getHeight()
    {
        return height;
    }

    public void setHeight(double height) throws Exception
    {
        if ( height > 0 )
            this.height = height;
        else
            throw (new Exception("Invalid tree height."));
    }
    @Override
    public String toString()
    {
        return ("Altura: " + height + " Precio: " + getPrice());
    }
}
