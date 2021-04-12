package com.example.customlistview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MessageActivity extends MenuAppCompatActivity implements View.OnClickListener {



        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_message);

            Button button = findViewById(R.id.addtocart);
            button.setOnClickListener(this);


        }


        @Override
        public void onClick(View v) {
            switch (v.getId()) {

                case R.id.addtocart:
                    Toast.makeText(this, "Congradulation", Toast.LENGTH_SHORT).show();
                    break;
            }

        }
    }