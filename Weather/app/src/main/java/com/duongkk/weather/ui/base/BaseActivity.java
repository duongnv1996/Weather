package com.duongkk.weather.ui.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import butterknife.ButterKnife;

/**
 * Created by thaopt on 12/21/17.
 */

public abstract class BaseActivity extends AppCompatActivity {
    protected abstract int initLayout();
    protected abstract void initVariables();
    protected abstract void initViews();
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(initLayout());
        initViews();
        initVariables();
    }
}
