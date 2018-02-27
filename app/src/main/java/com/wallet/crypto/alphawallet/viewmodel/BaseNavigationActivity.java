package com.wallet.crypto.alphawallet.viewmodel;

import android.support.annotation.MenuRes;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;
import com.wallet.crypto.alphawallet.R;
import com.wallet.crypto.alphawallet.ui.BaseActivity;

public abstract class BaseNavigationActivity extends BaseActivity implements BottomNavigationViewEx.OnNavigationItemSelectedListener {

    private BottomNavigationViewEx navigation;

    protected void initBottomNavigation()
    {
        navigation = findViewById(R.id.bottom_navigation_ex);
        navigation.setOnNavigationItemSelectedListener(this);
    }

    protected void setBottomMenu(@MenuRes int menuRes)
    {
        navigation.getMenu().clear();
        navigation.inflateMenu(menuRes);

        navigation.enableAnimation(false);
        navigation.enableShiftingMode(false);
        navigation.enableItemShiftingMode(false);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        return false;
    }
}
