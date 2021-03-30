package com.example.cafebali;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCafe;
    private ArrayList<Cafe> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCafe = findViewById(R.id.rv_cafe);
        rvCafe.setHasFixedSize(true);

        list.addAll(CafeData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList(){
        rvCafe.setLayoutManager(new LinearLayoutManager(this));
        ListCafeAdapter listCafeAdapter = new ListCafeAdapter(list);
        rvCafe.setAdapter(listCafeAdapter);

        listCafeAdapter.setOnItemClickCallback(new ListCafeAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Cafe cafe) {
                Intent moveIntent = new Intent(MainActivity.this,DetailCafeActivity.class);
                moveIntent.putExtra(DetailCafeActivity.ITEM_EXTRA, cafe);
                startActivity(moveIntent);
            }
        });
    }
}