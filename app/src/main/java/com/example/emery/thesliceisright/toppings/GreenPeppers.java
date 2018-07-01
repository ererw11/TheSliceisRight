package com.example.emery.thesliceisright.toppings;

import com.example.emery.thesliceisright.Pizza;

public class GreenPeppers extends ToppingDecorator {
    private Pizza pizza;

    public GreenPeppers(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Green Peppers";
    }

    @Override
    public double cost() {
        return pizza.cost() + .10;
    }
}
