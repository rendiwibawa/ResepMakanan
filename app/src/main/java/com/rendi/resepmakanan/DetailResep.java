package com.rendi.resepmakanan;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;

public class DetailResep extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_resep);

        ImageView imgItemPhoto = findViewById(R.id.img_item_photo);
        TextView tvName = findViewById(R.id.tv_item_name);
        TextView tvDetail = findViewById(R.id.tv_item_deskripsi);


        Resep resep = getIntent().getParcelableExtra(ITEM_EXTRA);
        if (resep != null){
            Glide.with(this)
                    .load(resep.getPhoto())
                    .into(imgItemPhoto);
            tvName.setText(resep.getName());
            tvDetail.setText(resep.getDetail());
        }
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("Detail Resep");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }



    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

}
