package com.example.myapplication0;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import com.example.myapplication0.list.MyDataAdapter;
import com.example.myapplication0.list.SampData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<SampData> movieDataList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.InitializeMovieData();

        ListView listview = findViewById(R.id.listView);
        final MyDataAdapter myAdapter = new MyDataAdapter(this,movieDataList);

        listview.setAdapter(myAdapter);
    }
    public void InitializeMovieData()
    {
        movieDataList = new ArrayList<SampData>();

        movieDataList.add(new SampData("15세 이상관람가","감자감자감자1"));
        movieDataList.add(new SampData("19세 이상관람가","감자감자감자2"));
        movieDataList.add(new SampData("12세 이상관람가","감자감자감자3"));
    }
}