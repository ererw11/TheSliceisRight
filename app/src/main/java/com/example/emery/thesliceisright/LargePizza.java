package com.example.emery.thesliceisright;

public class LargePizza extends Pizza {

    public LargePizza() {
        description = "Large 18-inch Pizza";
    }

    @Override
    public double cost() {
        return 12.50;
    }
}
