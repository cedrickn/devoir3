package com.example.customlistview;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends MenuAppCompatActivity implements View.OnClickListener {
@Override
protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);



        Button button1 = findViewById(R.id.button1);
        Button button2 = findViewById(R.id.button2);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        }
@Override
public void onClick(View v) {
        switch (v.getId()) {
        case R.id.button1:
                case R.id.button2:
                        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        break;
        }
        }

        }