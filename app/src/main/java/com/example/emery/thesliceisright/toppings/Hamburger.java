package com.example.emery.thesliceisright.toppings;

import com.example.emery.thesliceisright.Pizza;

public class Hamburger extends ToppingDecorator {

    private Pizza pizza;

    public Hamburger(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Hamburger";
    }

    @Override
    public double cost() {
        return pizza.cost() + .50;
    }
}
