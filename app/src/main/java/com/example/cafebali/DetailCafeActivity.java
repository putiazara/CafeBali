package com.example.cafebali;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailCafeActivity extends AppCompatActivity {
    public static final String ITEM_EXTRA = "item_extra";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_cafe);

        ImageView imgCafe = findViewById(R.id.imgCafe);
        TextView tvCafeName = findViewById(R.id.tvCafeName);
        TextView tvCafeDetail = findViewById(R.id.tvCafeDetail);

        Cafe cafe = getIntent().getParcelableExtra(ITEM_EXTRA);
        if(cafe != null){
            Glide.with(this)
                    .load(cafe.getPhoto())
                    .into(imgCafe);
            tvCafeName.setText(cafe.getName());
            tvCafeDetail.setText(cafe.getDetail());
        }
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("TENTANG CAFE");
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}