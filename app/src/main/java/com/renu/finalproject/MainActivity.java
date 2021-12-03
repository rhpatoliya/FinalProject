package com.renu.finalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_list_of_all_news, menu);
        return true;
    }
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId())
        {
            case R.id.weather:
                //perform any action;
                WeatherFragment weatherFragment = new WeatherFragment();
                FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.mainframe, weatherFragment);
                ft.commit();
                return true;
            case R.id.time:
                //perform any action;
                TimeFragment timeFragment = new TimeFragment();
                ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.mainframe, timeFragment);
                ft.commit();
                return true;
            case R.id.gold_price:
                //perform any action;
                GoldPriceFragment goldPriceFragment = new GoldPriceFragment();
                ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.mainframe, goldPriceFragment);
                ft.commit();
                return true;
            case R.id.convert_currency:
                ConvertCurrencyFragment convertCurrencyFragment = new ConvertCurrencyFragment();
                ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.mainframe, convertCurrencyFragment);
                ft.commit();
                //perform any action;
                return true;
            case R.id.stockprice:
                //perform any action;
                StockPriceFragment stockPriceFragment = new StockPriceFragment();
                ft = getSupportFragmentManager().beginTransaction();
                ft.replace(R.id.mainframe, stockPriceFragment);
                ft.commit();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}