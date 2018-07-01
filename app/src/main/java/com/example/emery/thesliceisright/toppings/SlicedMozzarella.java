package com.example.emery.thesliceisright.toppings;

import com.example.emery.thesliceisright.Pizza;

public class SlicedMozzarella extends ToppingDecorator {
    private Pizza pizza;

    public SlicedMozzarella(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Sliced Mozzarella";
    }

    @Override
    public double cost() {
        return pizza.cost() + .50;
    }
}
