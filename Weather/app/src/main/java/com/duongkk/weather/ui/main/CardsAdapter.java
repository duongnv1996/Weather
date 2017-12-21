package com.duongkk.weather.ui.main;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.duongkk.weather.R;
import com.duongkk.weather.model.WeatherModel;

import java.util.List;
import java.util.Random;




public class CardsAdapter extends ArrayAdapter<WeatherModel> {
    public static String TAG = CardsAdapter.class.getSimpleName().toUpperCase();
    private List<WeatherModel> list;
    public CardsAdapter(Activity context, List<WeatherModel> list) {
        super(context,R.layout.card_content);
        this.list = list;
    }
    @Override
    public int getCount() {
        return list.size();
    }
    @Override
    public View getView(int position, final View contentView, ViewGroup parent) {
        return LayoutInflater.from(parent.getContext()).inflate(R.layout.card_content,parent,false);
    }

}
