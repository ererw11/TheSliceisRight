package com.example.emery.thesliceisright;

import androidx.fragment.app.Fragment;

public class CustomPizzaActivity extends SingleFragmentActivity{

    @Override
    protected Fragment createFragment() {
        return CustomPizzaFragment.newCustomPizzaInstance();
    }
}
