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

public class SecondActivity extends MenuAppCompatActivity {

    ListView listView;
    String[] mTitle = {"Week 1", "Week 2", "Week 3", "Week 4", "Week 5", "Week 6", "Week 7", "Week 8", "Week 9", "Week 10", "Week 11", "Week 12"};
    String[] mDate = {"1 jan-7 jan","8 jan-14 jan","15 jan-21 jan","22 jan-28 jan","29 jan-4 fev","5 fev-11 fev","12 fev-18 fev","19 fev-25 fev","26 fev-4 mars","5 mars-11 mars","12 mars-18 mars","19 mars-25 mars" };
    int[] images = {R.drawable.ic_baseline_check_circle_24, R.drawable.ic_baseline_check_circle_24, R.drawable.ic_baseline_check_circle_24, R.drawable.ic_baseline_check_circle_24, R.drawable.ic_baseline_check_circle_24, R.drawable.ic_baseline_check_circle_24, R.drawable.ic_loading_svgrepo_com, R.drawable.ic_baseline_hourglass_top_24, R.drawable.ic_baseline_hourglass_top_24, R.drawable.ic_baseline_hourglass_top_24, R.drawable.ic_baseline_hourglass_top_24, R.drawable.ic_baseline_hourglass_top_24};
    // so our images and other things are set in array

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        MyAdapter adapter = new MyAdapter(this, mTitle, mDate, images);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                if (position == 0) {
                    Intent intent = new Intent(getApplicationContext(), GymActivitiesActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[0]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[0]);
                    intent.putExtra("date", mDate[0]);
                    intent.putExtra("enligne", "En ligne");
                    intent.putExtra("description", mDate[0]);
                    // also put your position
                    intent.putExtra("position", ""+0);
                    startActivity(intent);


                }
                if (position == 1) {
                    Intent intent = new Intent(getApplicationContext(), GymActivitiesActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[1]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[1]);
                    intent.putExtra("date", mDate[1]);
                    intent.putExtra("enligne", "En ligne");
                    intent.putExtra("description", mDate[1]);
                    // also put your position
                    intent.putExtra("position", ""+1);
                    startActivity(intent);
                }
                if (position == 2) {
                    Intent intent = new Intent(getApplicationContext(), GymActivitiesActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[2]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[2]);
                    intent.putExtra("date", mDate[2]);
                    intent.putExtra("enligne", "En ligne");
                    intent.putExtra("description", mDate[2]);
                    // also put your position
                    intent.putExtra("position", ""+2);
                    startActivity(intent);
                }
                if (position == 3) {
                    Intent intent = new Intent(getApplicationContext(), GymActivitiesActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[3]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[3]);
                    intent.putExtra("date", mDate[3]);
                    intent.putExtra("enligne", "En ligne");
                    intent.putExtra("description", mDate[3]);
                    // also put your position
                    intent.putExtra("position", ""+3);
                    startActivity(intent);
                }
                if (position == 4) {
                    Intent intent = new Intent(getApplicationContext(), GymActivitiesActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[4]);
                    intent.putExtra("date", mDate[4]);
                    intent.putExtra("enligne", "En ligne");
                    intent.putExtra("description", mDate[4]);
                    // also put your position
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }
                if (position == 5) {
                    Intent intent = new Intent(getApplicationContext(), GymActivitiesActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[4]);
                    intent.putExtra("date", mDate[4]);
                    intent.putExtra("enligne", "En ligne");
                    intent.putExtra("description", mDate[4]);
                    // also put your position
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }
                if (position == 6) {
                    Intent intent = new Intent(getApplicationContext(), GymActivitiesActivity.class);
                    // this intent put our 0 index image to another activity
                    Bundle bundle = new Bundle();
                    bundle.putInt("image", images[4]);
                    intent.putExtras(bundle);
                    // now put title and description to another activity
                    intent.putExtra("title", mTitle[4]);
                    intent.putExtra("date", mDate[4]);
                    intent.putExtra("enligne", "En ligne");
                    intent.putExtra("description", mDate[4]);
                    // also put your position
                    intent.putExtra("position", ""+4);
                    startActivity(intent);
                }

            }
        });
    }

    class MyAdapter extends ArrayAdapter<String> {

        Context context;
        String[] rTitle;
        String[] rDate;
        int[] rImgs;

        MyAdapter (Context c, String[] title, String[] date, int[] imgs) {
            super(c, R.layout.row, R.id.titre, title);
            this.context = c;
            this.rTitle = title;
            this.rDate = date;
            this.rImgs = imgs;

        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.image);
            TextView myTitle = row.findViewById(R.id.titre);
            TextView myDate = row.findViewById(R.id.date);

            // now set our resources on views
            images.setImageResource(rImgs[position]);
            myTitle.setText(rTitle[position]);
            myDate.setText(rDate[position]);




            return row;
        }
    }
}
