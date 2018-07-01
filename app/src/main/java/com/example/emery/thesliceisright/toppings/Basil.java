package com.example.emery.thesliceisright.toppings;

import com.example.emery.thesliceisright.Pizza;

public class Basil extends ToppingDecorator {
    private Pizza pizza;

    public Basil(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Freshly Picked Basil";
    }

    @Override
    public double cost() {
        return pizza.cost() + .20;
    }
}
