package com.example.emery.thesliceisright;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.emery.thesliceisright.toppings.*;

import java.text.NumberFormat;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class PizzaMenuFragment extends Fragment {

    private Button lisaButton;
    private Button margheritaButton;
    private TextView description;
    private TextView price;

    public static PizzaMenuFragment newPizzaMenuInstance() {
        return new PizzaMenuFragment();
    }

    public PizzaMenuFragment() {
        // Required Empty Constructor
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_pizza_menu, container, false);

        lisaButton = v.findViewById(R.id.lisa_button);
        margheritaButton = v.findViewById(R.id.margherita_button);
        Button supremeButton = v.findViewById(R.id.supreme_button);

        description = v.findViewById(R.id.description);
        price = v.findViewById(R.id.price);

        // Create the Lisa Pizza
        lisaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Pizza pizza = new LargePizza();
                pizza = new Pepperoni(pizza);
                pizza = new Hamburger(pizza);
                pizza = new CanadianBacon(pizza);
                pizza = new Bacon(pizza);

                displayDescriptionAndPrice(pizza);
            }
        });

        // Create the Margherita Pizza
        margheritaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Pizza pizza = new LargePizza();
                pizza = new Basil(pizza);
                pizza = new SlicedMozzarella(pizza);

                displayDescriptionAndPrice(pizza);
            }
        });

        // Create the Supreme Pizza
        supremeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Pizza pizza = new LargePizza();
                pizza = new Pepperoni(pizza);
                pizza = new Hamburger(pizza);
                pizza = new BlackOlives(pizza);
                pizza = new ItalianSausage(pizza);
                pizza = new GreenPeppers(pizza);
                pizza = new Ham(pizza);
                pizza = new Mushroom(pizza);
                pizza = new Onion(pizza);

                displayDescriptionAndPrice(pizza);
            }
        });
        return v;
    }

    private void displayDescriptionAndPrice(Pizza pizza) {
        clearDescriptionAndPrice();
        description.setText(pizza.getDescription());
        price.setText(turnStringToCash(Double.toString(pizza.cost())));
    }

    private void clearDescriptionAndPrice() {
        description.setText("");
        price.setText("");
    }

    // Creates a String in Currency format
    public static String turnStringToCash(String stringCost) {
        NumberFormat format = NumberFormat.getCurrencyInstance();
        if (stringCost == null) {
            stringCost = "0.0";
        }
        double stringDouble = Double.parseDouble(stringCost);
        return format.format(stringDouble);
    }
}
