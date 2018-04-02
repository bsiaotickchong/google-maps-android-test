package com.example.bsiao.google_maps_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity  {

    EditText edtTextNumber;
    Button btnFind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edtTextNumber = (EditText) findViewById(R.id.edtTextNumber);
        btnFind = (Button) findViewById(R.id.btnFind);



        btnFind.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // query server for number's current lat and lon

                // update map
                GMapsFragment fragmentGMaps = (GMapsFragment) getSupportFragmentManager().findFragmentById(R.id.fragmentGMaps);
                fragmentGMaps.placeMarker(-43.852, 151.211); // placeholder

                // receive directions from Google Maps API
            }
        });
    }
}
