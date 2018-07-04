package com.example.emery.thesliceisright.sizes;

public class MediumPizza extends Pizza {

    public MediumPizza() {
        description = "Medium 14-inch Pizza";
    }

    @Override
    public double cost() {
        return 10.50;
    }
}
