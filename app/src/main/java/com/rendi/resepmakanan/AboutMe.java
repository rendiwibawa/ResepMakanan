package com.rendi.resepmakanan;


import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class AboutMe extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actifity_about_me);


        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("About Me");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}
