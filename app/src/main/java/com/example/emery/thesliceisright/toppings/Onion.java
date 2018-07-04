package com.example.emery.thesliceisright.toppings;

import com.example.emery.thesliceisright.sizes.Pizza;

public class Onion extends ToppingDecorator {
    private Pizza pizza;

    public Onion(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Fresh Sliced Onion";
    }

    @Override
    public double cost() {
        return pizza.cost() + .10;
    }
}
