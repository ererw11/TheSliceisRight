package com.example.emery.thesliceisright.toppings;

import com.example.emery.thesliceisright.Pizza;

public class Pepperoni extends ToppingDecorator {

    private Pizza pizza;

    public Pepperoni(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " , Pepperoni";
    }

    @Override
    public double cost() {
        return pizza.cost() + .50;
    }
}
