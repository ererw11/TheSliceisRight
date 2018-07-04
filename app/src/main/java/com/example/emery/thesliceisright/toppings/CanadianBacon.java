package com.example.emery.thesliceisright.toppings;

import com.example.emery.thesliceisright.sizes.Pizza;

public class CanadianBacon extends ToppingDecorator {
    private Pizza pizza;

    public CanadianBacon(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Canadian Bacon";
    }

    @Override
    public double cost() {
        return pizza.cost() + .50;
    }
}