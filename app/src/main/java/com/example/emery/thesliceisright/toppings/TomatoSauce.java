package com.example.emery.thesliceisright.toppings;

import com.example.emery.thesliceisright.sizes.Pizza;

public class TomatoSauce extends ToppingDecorator {

    private Pizza pizza;

    public TomatoSauce(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + ", Robust Tomato Sauce";
    }

    @Override
    public double cost() {
        return pizza.cost() + .00;
    }
}
