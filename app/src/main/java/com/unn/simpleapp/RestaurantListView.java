package com.unn.simpleapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class RestaurantListView extends AppCompatActivity {

    int[] IMAGES ={R.drawable.abeans, R.drawable.bkitchen, R.drawable.cbar,R.drawable.dcafe,R.drawable.ecafe,
            R.drawable.frestaurant,R.drawable.grestaurant,R.drawable.hcouple};

    String[] NAMES={"The Corner","Kings","Zen Atm","Sunny","The View","Divine Flavours","The Street Cafe","Romantics"};

    String[] DESCRIPTION={"Bob`s Place","Best pies in town","Pink Environment","Quiet Afternoons ","Best Cafe in Town","Best Plates","Evenings with Friends","Tinder is here"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_list_view);

        ListView listView=(ListView)findViewById(R.id.listView);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);


    }

    class CustomAdapter extends BaseAdapter {

        @Override
        public int getCount() {
            return 0;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {


            view = getLayoutInflater().inflate(R.layout.customlayout,null);
            ImageView imageView = view.findViewById(R.id.imageView);
            TextView textView_name = (TextView)view.findViewById(R.id.textView_name);
            TextView textView_description = (TextView)view.findViewById(R.id.textView_description);

            imageView.setImageResource(IMAGES[i]);
            textView_name.setText(NAMES[i]);
            textView_description.setText(DESCRIPTION[i]);

            return view;
        }
    }
}
