package com.example.jp048220.tradingcardsapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by JP048220 on 10/22/2017.
 */

public class settings extends AppCompatActivity
{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BotNavHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(3);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.ic_offers:
                        Intent intent0 = new Intent(settings.this, MainActivity.class);
                        startActivity(intent0);

                        break;
                    case R.id.ic_history:
                        Intent intent1 = new Intent(settings.this, history.class);
                        startActivity(intent1);
                        break;
                    case R.id.ic_search:
                        Intent intent2 = new Intent(settings.this, search.class);
                        startActivity(intent2);
                        break;
                    case R.id.ic_settings:

                        break;
                    case R.id.ic_profile:
                        Intent intent4 = new Intent(settings.this, profile.class);
                        startActivity(intent4);
                        break;
                }

                return false;
            }
        });

    }
}
