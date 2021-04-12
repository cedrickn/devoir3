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
        System.out.println();
        switch (item.getItemId()) {
            case R.id.action_profile:
                Intent intent = new Intent(this, ProfileActivity.class);
                startActivity(intent);
                return true;
            case R.id.action_horaire:
                Intent intent2 = new Intent(this, GymActivitiesActivity.class);
                startActivity(intent2);
                return true;
            case R.id.action_edit:
                Intent intent3 = new Intent(this, ActivitiesActivity.class);
                startActivity(intent3);
                return true;
            case R.id.action_search:
                Intent intent5 = new Intent(this, StartActivity.class);
                startActivity(intent5);
                return true;
            case R.id.action_house:
                Intent intent6 = new Intent(this, SecondActivity.class);
                startActivity(intent6);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

}
