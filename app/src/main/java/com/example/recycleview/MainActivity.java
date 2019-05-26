package com.example.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import Adapter.MyAdapter;
import Model.ListItem;

public class MainActivity extends AppCompatActivity {
private RecyclerView recyclerView;
private RecyclerView.Adapter adapter;
private List<ListItem> listItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.myRecyclerID);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        //Instantiating array
        listItems = new ArrayList<>();

        // Creating array entries

//        ListItem item1 = new ListItem("Aquaman", "King of the Seven Seas", "Fire");
//        ListItem item2 = new ListItem("Wonder-woman", "Super strong girl, but still weak af", "Okay");

        for (int i = 0; i < 10; i++){
            ListItem item = new ListItem(
                    "item " + (i+1),
                    "description",
                    "fire"
            );

//            listItems.add(item1);
//            listItems.add(item2);

           listItems.add(item);
        }

        // Instantiating the adapter
        adapter = new MyAdapter(this, listItems);

        // connecting adapter to recycler
        recyclerView.setAdapter(adapter);
    }

    // it is finally over
}
