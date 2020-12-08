package com.rendi.resepmakanan;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.rendi.resepmakanan.Adapter.Adapter;
import com.rendi.resepmakanan.Adapter.OnItemClickCallback;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RecyclerView tampilResep;
    private ArrayList<Resep> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tampilResep = findViewById(R.id.tampil_resep);
        tampilResep.setHasFixedSize(true);

        list.addAll(DataResep.getListData());
        showRecycleList();

        Button akun1 = findViewById(R.id.akunku);
        akun1.setOnClickListener(this);
    }

    private void showRecycleList() {
        tampilResep.setLayoutManager(new LinearLayoutManager(this));
        Adapter adapter = new Adapter(list);
        tampilResep.setAdapter(adapter);

        adapter.setOnItemClickCallback(new OnItemClickCallback() {
            @Override
            public void onItemClicked(Resep resep) {
                Intent moveIntent1 = new Intent(MainActivity.this, DetailResep.class);
                moveIntent1.putExtra(DetailResep.ITEM_EXTRA, resep);
                startActivity(moveIntent1);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.profil_me, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.kontak_id) {
            Intent moveIntent = new Intent(MainActivity.this, AboutMe.class);
            startActivity(moveIntent);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.akunku:
                Intent moIntent = new Intent(MainActivity.this, akun.class);
                startActivity(moIntent);
                break;
        }

    }
}


