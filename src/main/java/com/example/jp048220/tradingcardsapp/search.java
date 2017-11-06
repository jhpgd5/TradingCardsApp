package com.example.jp048220.tradingcardsapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.app.SearchManager;
import android.widget.SearchView.OnQueryTextListener;
import android.content.Context;


import com.miguelcatalan.materialsearchview.MaterialSearchView;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by JP048220 on 10/22/2017.
 */

public class search extends AppCompatActivity


{

    ListView search_card;
    ArrayAdapter<String> adapter;


   // MaterialSearchView searchView;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.search);

        search_card=(ListView) findViewById(R.id.search_card);

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(getResources().getStringArray(R.array.my_cards)));

        adapter = new ArrayAdapter<String>(search.this, android.R.layout.simple_list_item_1, arrayList);

        search_card.setAdapter(adapter);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
       //  getSupportActionBar().setTitle("Material Search");
     //  toolbar.setTitleTextColor(Color.parseColor("#FFFFFF"));


        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottomNavView_Bar);
        BotNavHelper.disableShiftMode(bottomNavigationView);
        Menu menu = bottomNavigationView.getMenu();
        MenuItem menuItem = menu.getItem(1);
        menuItem.setChecked(true);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {

                    case R.id.ic_offers:
                        Intent intent0 = new Intent(search.this, MainActivity.class);
                        startActivity(intent0);

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
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);
        MenuItem item = menu.findItem(R.id.search_card);
        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                try {
                    adapter.getFilter().filter(newText);
                }
                catch(Exception e) {
                    System.out.print("Error");
                }
                return false;
            }
        });
        return super.onCreateOptionsMenu(menu);

    }
}
