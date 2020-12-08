package com.rendi.resepmakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class akun extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_akun);

        //RENDI
        findViewById(R.id.btn_wa).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://wa.wizard.id/b4e20a");
            }
        });

        findViewById(R.id.btn_ig).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://www.instagram.com/rpw_24/?hl=id");
            }
        });

        //AMY
        findViewById(R.id.btn_wa2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://wa.me/+6281243294691");
            }
        });

        findViewById(R.id.btn_ig2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://www.instagram.com/amytaakrynti/?hl=id");
            }
        });

        //AGAM
        findViewById(R.id.btn_wa3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://wa.me/+6281357609405");
            }
        });

        findViewById(R.id.btn_ig3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clicked_btn("https://www.instagram.com/genggams/?hl=id");
            }
        });
    }
    public  void clicked_btn(String url){
        Intent intent= new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(url));
        startActivity(intent);
    }
}
