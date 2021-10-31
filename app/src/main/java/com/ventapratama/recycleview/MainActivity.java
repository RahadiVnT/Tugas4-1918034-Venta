package com.ventapratama.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MobilAdapter adapter;
    private ArrayList<Mobil> mobilArrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView = (RecyclerView)findViewById(R.id.recycleview);
        adapter = new MobilAdapter(mobilArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        mobilArrayList = new ArrayList<>();
        mobilArrayList.add(new Mobil(R.drawable.a6, "Audi A6", "Sedan" , "Rp 1,649 M OTR" ));
        mobilArrayList.add(new Mobil(R.drawable.hrv, "Honda HRV", "Semi SUV", "Rp 294 Jt OTR"));
        mobilArrayList.add(new Mobil(R.drawable.s660, "Honda S660", "Sport Hatchback", "Rp 700 Jt OTR"));
        mobilArrayList.add(new Mobil(R.drawable.x7, "BMW X7", "SUV Offroader", "Rp 2.399 M OTR "));
        mobilArrayList.add(new Mobil(R.drawable.kona, "Hyundai Kona", "Sedan Electric Car", "Rp 697 Jt OTR"));
    }
}