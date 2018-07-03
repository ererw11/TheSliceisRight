package com.example.emery.thesliceisright;

import androidx.fragment.app.Fragment;

public class PizzaMenuActivity extends SingleFragmentActivity {


    @Override
    protected Fragment createFragment() {
        return PizzaMenuFragment.newPizzaMenuInstance();
    }
}