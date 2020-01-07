package com.rujira.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        // Setting Layout
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        // Setting Adapter
        String[] libraries = {"Retrofit2", "OkHttp", "Room", "Glide", "RxJava"};
        MyRecyclerAdapter adapter = new MyRecyclerAdapter(libraries);
        recyclerView.setAdapter(adapter);
    }
}
