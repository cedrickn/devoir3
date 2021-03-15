package com.example.customlistview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SearchActivity extends MenuAppCompatActivity {
    boolean clicked;
    ImageView image ;
    Button buttonachat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);


        buttonachat = findViewById(R.id.buttonOptions);
        clicked = true;
        image = findViewById(R.id.imageViewcopied);

        buttonachat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(clicked) {
                    image.setVisibility(View.VISIBLE);
                    clicked=false;
                }
                else if(clicked==false) {
                    image.setVisibility(View.INVISIBLE);
                    clicked=true;
                }
            }
        });


    }



}

