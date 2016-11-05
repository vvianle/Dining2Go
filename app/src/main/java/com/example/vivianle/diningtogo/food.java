
package com.example.vivianle.diningtogo;
/**
 * Created by candy hu on 2016/11/4.
 */

public class food {
    //INSTANCE VARIABLES
    String name;
    double price;
    int category;
    String restriction;

    //CONSTRUCTOR
    public food(String name, float price)
    {
        this.name = name;
        this.price = price;
        restriction = null;
    }

    public void setCategory(int number)
    {
        this.category = number;
    }


    //getter methods
    public String getFoodName()
    {
        return this.name;
    }


    public double getPrice()
    {
        return this.price;
    }

    public String toString()
    {
        return name + " + "  + " + " + price;
    }

    public int getCategroy()
    {
        return this.category;
    }

    public void setRestriction(String s){
        restriction = s;
    }

    public String getRestriction(String s){
        return restriction;
    }

}
