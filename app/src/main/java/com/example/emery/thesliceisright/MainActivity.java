package com.example.emery.thesliceisright;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.emery.thesliceisright.toppings.*;


public class MainActivity extends AppCompatActivity {

    private Button lisaButton;
    private Button margheritaButton;
    private Button supremeButton;
    private TextView description;
    private TextView price;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lisaButton = findViewById(R.id.lisa_button);
        margheritaButton = findViewById(R.id.margherita_button);
        supremeButton = findViewById(R.id.supreme_button);

        description = findViewById(R.id.description);
        price = findViewById(R.id.price);

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

        margheritaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Pizza pizza = new LargePizza();
                pizza = new Basil(pizza);
                pizza = new SlicedMozzarella(pizza);

                displayDescriptionAndPrice(pizza);
            }
        });

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
    }

    private void displayDescriptionAndPrice(Pizza pizza) {
        clearDescriptionAndPrice();
        description.setText(pizza.getDescription());
        price.setText(String.format("$%s", Double.toString(pizza.cost())));
    }

    private void clearDescriptionAndPrice() {
        description.setText("");
        price.setText("");
    }
}
