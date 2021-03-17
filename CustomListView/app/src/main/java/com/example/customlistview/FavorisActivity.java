package com.example.customlistview;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class FavorisActivity extends MenuAppCompatActivity {

    ListView listView;
    String[] mTitle = {"Apprendre a dessiner", "Apprendre a danser", "Apprendre le yoga", "Apprendre a apprendre", "Apprendre le bonheur"};
    int[] images = {R.drawable.zoom, R.drawable.zoom, R.drawable.zoom, R.drawable.zoom, R.drawable.zoom};
    int[] images2 = {R.drawable.ic_baseline_favorite_242,R.drawable.ic_baseline_favorite_242,R.drawable.ic_baseline_favorite_242,R.drawable.ic_baseline_favorite_242,R.drawable.ic_baseline_favorite_242};
    // so our images and other things are set in array

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle,images,images2);
        listView.setAdapter(adapter);


    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String[] rTitle;
        int[] rImgs;
        int[] rImgs2;

        MyAdapter (Context c, String[] title, int[] imgs, int[] imgs2) {
            super(c, R.layout.favoris_row, R.id.titre, title);
            this.context = c;
            this.rTitle = title;
            this.rImgs = imgs;
            this.rImgs2 = imgs2;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.favoris_row, parent, false);
            ImageView images = row.findViewById(R.id.imagehead);
            ImageView images2 = row.findViewById(R.id.imageheart);
            TextView myTitle = row.findViewById(R.id.titre2);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            images2.setImageResource(rImgs2[position]);
            myTitle.setText(rTitle[position]);




            return row;
        }
    }
}

