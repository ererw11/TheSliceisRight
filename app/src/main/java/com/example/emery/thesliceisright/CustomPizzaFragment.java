package com.example.emery.thesliceisright;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.example.emery.thesliceisright.sizes.LargePizza;
import com.example.emery.thesliceisright.sizes.MediumPizza;
import com.example.emery.thesliceisright.sizes.Pizza;
import com.example.emery.thesliceisright.sizes.SmallPizza;
import com.example.emery.thesliceisright.toppings.Alfredo;
import com.example.emery.thesliceisright.toppings.Bacon;
import com.example.emery.thesliceisright.toppings.Basil;
import com.example.emery.thesliceisright.toppings.BlackOlives;
import com.example.emery.thesliceisright.toppings.CanadianBacon;
import com.example.emery.thesliceisright.toppings.GreenPeppers;
import com.example.emery.thesliceisright.toppings.Ham;
import com.example.emery.thesliceisright.toppings.Hamburger;
import com.example.emery.thesliceisright.toppings.ItalianSausage;
import com.example.emery.thesliceisright.toppings.Mushroom;
import com.example.emery.thesliceisright.toppings.Onion;
import com.example.emery.thesliceisright.toppings.Pepperoni;
import com.example.emery.thesliceisright.toppings.SlicedMozzarella;
import com.example.emery.thesliceisright.toppings.TomatoSauce;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/*
 *  A fragment for the user to create a custom pizza
 * */
public class CustomPizzaFragment extends Fragment {

    CheckBox sizeSmall;
    CheckBox sizeMedium;
    CheckBox sizeLarge;
    CheckBox sauceTomato;
    CheckBox sauceAlfredo;
    CheckBox toppingBacon;
    CheckBox toppingBasil;
    CheckBox toppingBlackOlives;
    CheckBox toppingCanadianBacon;
    CheckBox toppingGreenPeppers;
    CheckBox toppingHam;
    CheckBox toppingHamburger;
    CheckBox toppingItalianSausage;
    CheckBox toppingMushroom;
    CheckBox toppingOnion;
    CheckBox toppingPepperoni;
    CheckBox toppingMozzarella;
    TextView description;
    TextView cost;

    Pizza customPizza;

    public CustomPizzaFragment() {
        // Required empty public constructor
    }

    public static CustomPizzaFragment newCustomPizzaInstance() {
        return new CustomPizzaFragment();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_custom_pizza, container, false);

        sizeSmall = v.findViewById(R.id.size_small);
        sizeMedium = v.findViewById(R.id.size_medium);
        sizeLarge = v.findViewById(R.id.size_large);
        sauceTomato = v.findViewById(R.id.sauce_tomato);
        sauceAlfredo = v.findViewById(R.id.sauce_alfredo);
        toppingBacon = v.findViewById(R.id.topping_bacon);
        toppingBasil = v.findViewById(R.id.topping_basil);
        toppingBlackOlives = v.findViewById(R.id.topping_black_olives);
        toppingCanadianBacon = v.findViewById(R.id.topping_canadian_bacon);
        toppingGreenPeppers = v.findViewById(R.id.topping_green_pepper);
        toppingHam = v.findViewById(R.id.topping_ham);
        toppingHamburger = v.findViewById(R.id.topping_hamburger);
        toppingItalianSausage = v.findViewById(R.id.topping_italian_sausage);
        toppingMushroom = v.findViewById(R.id.topping_mushroom);
        toppingOnion = v.findViewById(R.id.topping_onion);
        toppingPepperoni = v.findViewById(R.id.topping_pepperoni);
        toppingMozzarella = v.findViewById(R.id.topping_mozzarella);

        description = v.findViewById(R.id.description);
        cost = v.findViewById(R.id.cost);

        sizeSmall.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                customPizza = new SmallPizza();
                updateDescriptionAndPrice();
            }
        });

        sizeMedium.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                customPizza = new MediumPizza();
                updateDescriptionAndPrice();
            }
        });

        sizeLarge.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                customPizza = new LargePizza();
                updateDescriptionAndPrice();
            }
        });

        sauceTomato.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    customPizza = new TomatoSauce(customPizza);
                    updateDescriptionAndPrice();
                }
            }
        });

        sauceAlfredo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    customPizza = new Alfredo(customPizza);
                    updateDescriptionAndPrice();
                }
            }
        });

        toppingBacon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    customPizza = new Bacon(customPizza);
                    updateDescriptionAndPrice();
                }
            }
        });

        toppingBasil.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    customPizza = new Basil(customPizza);
                    updateDescriptionAndPrice();
                }
            }
        });

        toppingBlackOlives.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    customPizza = new BlackOlives(customPizza);
                    updateDescriptionAndPrice();
                }
            }
        });

        toppingCanadianBacon.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    customPizza = new CanadianBacon(customPizza);
                    updateDescriptionAndPrice();
                }
            }
        });

        toppingGreenPeppers.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    customPizza = new GreenPeppers(customPizza);
                    updateDescriptionAndPrice();
                }
            }
        });

        toppingHam.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    customPizza = new Ham(customPizza);
                    updateDescriptionAndPrice();
                }
            }
        });

        toppingHamburger.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    customPizza = new Hamburger(customPizza);
                    updateDescriptionAndPrice();
                }
            }
        });

        toppingItalianSausage.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    customPizza = new ItalianSausage(customPizza);
                    updateDescriptionAndPrice();
                }
            }
        });

        toppingMushroom.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    customPizza = new Mushroom(customPizza);
                    updateDescriptionAndPrice();
                }
            }
        });

        toppingOnion.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    customPizza = new Onion(customPizza);
                    updateDescriptionAndPrice();
                }
            }
        });

        toppingPepperoni.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    customPizza = new Pepperoni(customPizza);
                    updateDescriptionAndPrice();
                }
            }
        });

        toppingMozzarella.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b) {
                    customPizza = new SlicedMozzarella(customPizza);
                    updateDescriptionAndPrice();
                }
            }
        });

        return v;
    }

    private void updateDescriptionAndPrice() {
        description.setText(customPizza.getDescription());
        cost.setText(PizzaMenuFragment.turnStringToCash(Double.toString(customPizza.cost())));
    }

}
