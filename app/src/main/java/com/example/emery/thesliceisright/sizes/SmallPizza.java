package com.example.emery.thesliceisright.sizes;

public class SmallPizza extends Pizza {

    public SmallPizza() {
        description = "Small 11-inch Pizza";
    }

    @Override
    public double cost() {
        return 8.50;
    }
}
