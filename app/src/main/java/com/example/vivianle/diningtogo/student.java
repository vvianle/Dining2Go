package com.example.vivianle.diningtogo;

public class student {

    Cart myCart;
    String username;
    String password;
    double diningDollars;
    String name;
    boolean swipeMeal;
    protected int userID;
    protected LinkedList<food> favorite;

    public student(String name, String username, String password, int userID, double diningDollars) {
        this.username = username;
        this.password = password;
        this.diningDollars = diningDollars;
        this.name = name;
        this.swipeMeal = false;
        this.userID = userID;
        myCart = new Cart();
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public double getDiningDollars() {
        return diningDollars;
    }

    public boolean getSwipeMeal() {
        return swipeMeal;
    }

    public int getUserID() {
        return userID;
    }

    public Cart getMyCart() {
        return myCart;
    }

    public void setSwipeMeal() {
        swipeMeal = !swipeMeal;
    }

    public void decreaseDiningDollar(double dollar) {
        diningDollars -= dollar;
    }

    public void resetCart() {
        myCart = new Cart();
    }
}
