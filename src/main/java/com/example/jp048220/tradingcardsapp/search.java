package com.example.jp048220.tradingcardsapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import com.miguelcatalan.materialsearchview.MaterialSearchView;

/**
 * Created by JP048220 on 10/22/2017.
 */

public class search extends AppCompatActivity


{

    MaterialSearchView searchView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       //  getSupportActionBar().setTitle("Material Search");
     //  toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BotNavHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(2);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.ic_offers:
                        Intent intent0 = new Intent(search.this, MainActivity.class);
                        startActivity(intent0);

                        break;
                    case R.id.ic_history:
                        Intent intent1 = new Intent(search.this, history.class);
                        startActivity(intent1);
                        break;
                    case R.id.ic_search:

                        break;
                    case R.id.ic_settings:
                        Intent intent3 = new Intent(search.this, settings.class);
                        startActivity(intent3);
                        break;
                    case R.id.ic_profile:
                        Intent intent4 = new Intent(search.this, profile.class);
                        startActivity(intent4);
                        break;
                }

                return false;
            }
        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_item, menu);
        MenuItem item = menu.findItem(R.id.action_search);
        searchView.setMenuItem(item);
        return true;
    }
}
