package com.example.emery.thesliceisright.toppings;

import com.example.emery.thesliceisright.sizes.Pizza;

public class BlackOlives extends ToppingDecorator {

    private Pizza pizza;

    public BlackOlives(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Black Olives (you can pick them off Lisa)";
    }

    @Override
    public double cost() {
        return pizza.cost() + .25;
    }
}
