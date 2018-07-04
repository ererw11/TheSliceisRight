package com.example.emery.thesliceisright.toppings;

import com.example.emery.thesliceisright.sizes.Pizza;

public class Alfredo extends ToppingDecorator {

    private Pizza pizza;

    public Alfredo(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Creamy Alfredo Sauce";
    }

    @Override
    public double cost() {
        return pizza.cost() + .00;
    }
}
