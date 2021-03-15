package com.example.customlistview;

import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MenuAppCompatActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_profile:
                Intent intent = new Intent(this, ProfileActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_horaire:
                Intent intent2 = new Intent(this, HoraireActivity.class);
                startActivity(intent2);
                return true;
            case R.id.action_edit:
                Intent intent3 = new Intent(this, MessageActivity.class);
                startActivity(intent3);
                return true;
            case R.id.action_panier:
//                Toast.makeText(this, "action_panier", Toast.LENGTH_SHORT).show();
                Intent intent4 = new Intent(this, CartActivity.class);
                startActivity(intent4);
                return true;
            case R.id.action_search:
                Intent intent5 = new Intent(this, SecondActivity.class);
                startActivity(intent5);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
