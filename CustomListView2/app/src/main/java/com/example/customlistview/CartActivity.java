package com.example.customlistview;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CartActivity extends MenuAppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cart_row);

        Button buttonachat = findViewById(R.id.buttonachat);
        buttonachat.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.buttonachat:
                Toast.makeText(this, "Achat effectué! Bienvenue en Enfer!!!!", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
