package com.example.jp048220.tradingcardsapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.design.internal.NavigationMenuView;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.miguelcatalan.materialsearchview.MaterialSearchView;


public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BotNavHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(0);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.ic_offers:


                        break;
                    case R.id.ic_history:
                        Intent intent1 = new Intent(MainActivity.this, history.class);
                        startActivity(intent1);
                        break;
                    case R.id.ic_search:
                        Intent intent2 = new Intent(MainActivity.this, search.class);
                        startActivity(intent2);
                        break;
                    case R.id.ic_settings:
                        Intent intent3 = new Intent(MainActivity.this, settings.class);
                        startActivity(intent3);
                        break;
                    case R.id.ic_profile:
                        Intent intent4 = new Intent(MainActivity.this, profile.class);
                        startActivity(intent4);
                        break;
                }

                return false;
            }
        });

    }



}
