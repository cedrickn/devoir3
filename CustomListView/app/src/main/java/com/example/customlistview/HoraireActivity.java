package com.example.customlistview;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class HoraireActivity extends MenuAppCompatActivity {

    ListView listView;
    String[] mTitle = {"Apprendre a dessiner", "Apprendre a dessiner", "Apprendre a dessiner", "Apprendre a dessiner", "Apprendre a dessiner"};
    String[] mDate = {"Lundi 12h00-14h00","Mardi 12h00-14h00","Mercredi 12h00-14h00","Jeudi 12h00-14h00","Vendredi 12h00-14h00"};
    String[] mRatings ={"0.1","0.1","0.1","0.1","0.1"};
    int[] images = {R.drawable.zoom, R.drawable.zoom, R.drawable.zoom, R.drawable.zoom, R.drawable.zoom};
    int[] images2 ={R.drawable.ic_mdi_star_rate, R.drawable.ic_mdi_star_rate,R.drawable.ic_mdi_star_rate,R.drawable.ic_mdi_star_rate,R.drawable.ic_mdi_star_rate};
    int[] images3 ={R.drawable.ic_baseline_notifications_242, R.drawable.ic_baseline_notifications_24,R.drawable.ic_baseline_notifications_24,R.drawable.ic_baseline_notifications_24,R.drawable.ic_baseline_notifications_24};
    // so our images and other things are set in array

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDate, mRatings, images, images2,images3);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[0]);
                    bundle.putInt("image3", images3[0]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[0]);
                    intent.putExtra("date", mDate[0]);
                    intent.putExtra("enligne", "En ligne");
                    intent.putExtra("ratings", mRatings[0]);
                    intent.putExtra("description", mDate[0]);
                    // also put your position
                    intent.putExtra("position", ""+0);


                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[1]);
                    bundle.putInt("image3", images3[1]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[1]);
                    intent.putExtra("date", mDate[1]);
                    intent.putExtra("enligne", "En ligne");
                    intent.putExtra("ratings", mRatings[1]);
                    intent.putExtra("description", mDate[1]);
                    // also put your position
                    intent.putExtra("position", ""+1);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[2]);
                    bundle.putInt("image3", images3[2]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[2]);
                    intent.putExtra("date", mDate[2]);
                    intent.putExtra("enligne", "En ligne");
                    intent.putExtra("ratings", mRatings[2]);
                    intent.putExtra("description", mDate[2]);
                    // also put your position
                    intent.putExtra("position", ""+2);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[3]);
                    bundle.putInt("image3", images3[3]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[3]);
                    intent.putExtra("date", mDate[3]);
                    intent.putExtra("enligne", "En ligne");
                    intent.putExtra("ratings", mRatings[3]);
                    intent.putExtra("description", mDate[3]);
                    // also put your position
                    intent.putExtra("position", ""+3);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), AnotherActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    bundle.putInt("image3", images3[4]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[4]);
                    intent.putExtra("date", mDate[4]);
                    intent.putExtra("enligne", "En ligne");
                    intent.putExtra("ratings", mRatings[4]);
                    intent.putExtra("description", mDate[4]);
                    // also put your position
                    intent.putExtra("position", ""+4);
                }
            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String[] rTitle;
        String[] rDate;
        String[] rRatings;
        int[] rImgs;
        int[] rImgs2;
        int[] rImgs3;

        MyAdapter (Context c, String[] title, String[] date, String[] ratings, int[] imgs, int[] imgs2, int[] imgs3) {
            super(c, R.layout.row, R.id.titre, title);
            this.context = c;
            this.rTitle = title;
            this.rDate = date;
            this.rRatings=ratings;
            this.rImgs = imgs;
            this.rImgs2 = imgs2;
            this.rImgs3 = imgs3;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.horaire_row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            ImageView images2= row.findViewById(R.id.image2);
            ImageView images3= row.findViewById(R.id.image3);
            TextView myTitle = row.findViewById(R.id.titre);
            TextView myDate = row.findViewById(R.id.date);
            TextView myRatings = row.findViewById(R.id.rating);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDate.setText(rDate[position]);
            myRatings.setText(rRatings[position]);
            images2.setImageResource(rImgs2[position]);
            images3.setImageResource(rImgs3[position]);




            return row;
        }
    }
}
