package com.example.a07_listview;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.theList);

        ArrayList<String> names = new ArrayList<>();
        names.add("ChoeGyeongHu");
        names.add("ParkJungGi");
        names.add("RyuHyunJae");
        names.add("JungWonDo");
        names.add("HwangDoSeong");
        names.add("LeeJaeHun");
        names.add("LeeHaeKyung");

        ArrayAdapter adapter = new ArrayAdapter(this, R.layout.list_item_layout, names);
        list.setAdapter(adapter);

    }
}
