package com.example.recycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    private TextView itemName;
    private TextView itemDescription;
    private TextView itemRating;
//    private View itemView;
    private Bundle bundle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        itemName = findViewById(R.id.nameID);
        itemDescription = findViewById(R.id.detailID);
        itemRating = findViewById(R.id.rateID);
//        itemView = findViewById(R.id.itemID);
        bundle = getIntent().getExtras();

        if(bundle != null){
           itemName.setText(bundle.getString("name"));
           itemDescription.setText(bundle.getString("description"));
           itemRating.setText(bundle.getString("rating"));
        }
    }
}
