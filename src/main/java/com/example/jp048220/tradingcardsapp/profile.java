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

public class profile extends AppCompatActivity
{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profile);

        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BotNavHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(4);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.ic_offers:
                        Intent intent0 = new Intent(profile.this, MainActivity.class);
                        startActivity(intent0);

                        break;
                    case R.id.ic_history:
                        Intent intent1 = new Intent(profile.this, history.class);
                        startActivity(intent1);
                        break;
                    case R.id.ic_search:
                        Intent intent2 = new Intent(profile.this, search.class);
                        startActivity(intent2);
                        break;
                    case R.id.ic_settings:
                        Intent intent3 = new Intent(profile.this, settings.class);
                        startActivity(intent3);
                        break;
                    case R.id.ic_profile:

                        break;
                }

                return false;
            }
        });

    }
}
