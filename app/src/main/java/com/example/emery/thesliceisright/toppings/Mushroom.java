package com.example.emery.thesliceisright.toppings;

import com.example.emery.thesliceisright.Pizza;

public class Mushroom extends ToppingDecorator {
    private Pizza pizza;

    public Mushroom(Pizza pizza){
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Mushrooms";
    }

    @Override
    public double cost() {
        return pizza.cost() + .15;
    }
}
