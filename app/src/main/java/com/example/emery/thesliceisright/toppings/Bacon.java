package com.example.emery.thesliceisright.toppings;

import com.example.emery.thesliceisright.sizes.Pizza;

public class Bacon extends ToppingDecorator {
    private Pizza pizza;

    public Bacon(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Bacon";
    }

    @Override
    public double cost() {
        return pizza.cost() + .50;
    }
}
