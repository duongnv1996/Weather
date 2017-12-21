package com.duongkk.weather.ui.main;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.duongkk.weather.R;
import com.duongkk.weather.model.WeatherModel;
import com.duongkk.weather.ui.base.BaseActivity;
import com.wenchao.cardstack.CardAnimator;
import com.wenchao.cardstack.CardStack;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends BaseActivity {
    private List<WeatherModel> weatherModelList;
    private CardsAdapter cardsAdapter;

    @BindView(R.id.container)
    CardStack container;

    @Override
    protected int initLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initVariables() {
        weatherModelList = new ArrayList<>();
        weatherModelList.add(new WeatherModel());
        weatherModelList.add(new WeatherModel());
        weatherModelList.add(new WeatherModel());
        weatherModelList.add(new WeatherModel());
        weatherModelList.add(new WeatherModel());
        weatherModelList.add(new WeatherModel());
        weatherModelList.add(new WeatherModel());
        weatherModelList.add(new WeatherModel());
        weatherModelList.add(new WeatherModel());
        weatherModelList.add(new WeatherModel());
        weatherModelList.add(new WeatherModel());
        weatherModelList.add(new WeatherModel());
        weatherModelList.add(new WeatherModel());
        weatherModelList.add(new WeatherModel());
        weatherModelList.add(new WeatherModel());
        cardsAdapter =new CardsAdapter(this,weatherModelList);
        container.setAdapter(cardsAdapter);
        container.setStackMargin(40);
        container.setStackGravity(CardAnimator.BOTTOM);
        container.setVisibleCardNum(4);
        container.setEnableRotation(true);
    }

    @Override
    protected void initViews() {
        ButterKnife.bind(this);
        container.setContentResource(R.layout.card_content);
    }



}
