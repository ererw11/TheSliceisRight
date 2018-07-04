package com.example.emery.thesliceisright.toppings;

import com.example.emery.thesliceisright.sizes.Pizza;

public class Ham extends ToppingDecorator {
    private Pizza pizza;

    public Ham(Pizza pizza) {
        this.pizza =  pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Ham";
    }

    @Override
    public double cost() {
        return pizza.cost() + .40;
    }
}
