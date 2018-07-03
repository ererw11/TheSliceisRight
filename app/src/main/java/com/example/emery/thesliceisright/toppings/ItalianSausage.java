package com.example.emery.thesliceisright.toppings;

import com.example.emery.thesliceisright.Pizza;

public class ItalianSausage extends ToppingDecorator {
    private Pizza pizza;

    public ItalianSausage(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Spicy Italian Sausage";
    }

    @Override
    public double cost() {
        return pizza.cost() + .50;
    }
}