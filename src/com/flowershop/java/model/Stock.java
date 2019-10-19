package com.flowershop.java.model;

import java.util.HashMap;

public class Stock
{
    private HashMap<Integer , AbstractItem> itemsList;

    public Stock ()
    {
        itemsList = new HashMap<>();
    }

    public HashMap<Integer, AbstractItem> getItemsList() {
        return itemsList;
    }

    public int getnextAvailableId ()
    {
        int nextAvailableId = itemsList.size();
        return ( nextAvailableId );
    }
    @Override
    public String toString ()
    {
        StringBuilder treeSB = new StringBuilder();
        StringBuilder flowerSB = new StringBuilder();
        StringBuilder decorationSB = new StringBuilder();
        treeSB.append("ÁRBOLES:\n");
        flowerSB.append("FLORES:\n");
        decorationSB.append("DECORACIÓN:\n");

        for (int i = 0; i < itemsList.size(); i++)
        {
            if (itemsList.get(i) instanceof Tree)
            {
                treeSB.append(itemsList.get(i).toString()+ "\n");
            }
            else if (itemsList.get(i) instanceof Flower)
            {
                flowerSB.append(itemsList.get(i).toString() + "\n");
            }
            else if (itemsList.get(i) instanceof Decoration)
            {
                decorationSB.append(itemsList.get(i).toString() + "\n");
            }

        }
        return treeSB.toString() + flowerSB.toString() + decorationSB.toString();
    }

}
