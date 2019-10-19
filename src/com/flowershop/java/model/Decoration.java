package com.flowershop.java.model;

public class Decoration extends AbstractItem
{
    private String material;
    public  Decoration ( String material , double price ) throws Exception
    {
        setMaterial( material );
        setPrice ( price );
    }

    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material) throws Exception
    {
        if ((material != "") && (material != null))
            this.material = material;
        else
            throw (new Exception("The material cannot be empty or null."));
    }
    @Override
    public String toString()
    {
        return ("Material: " + material + " Precio: " + getPrice());
    }
}
