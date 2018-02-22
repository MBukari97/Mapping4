package com.example.a2bukam38.mapping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


/**
 * Created by 2bukam38 on 05/02/2018.
 */

public class LatLongChooseActivity extends AppCompatActivity implements  View.OnClickListener
{

    public void onCreate (Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lat_lon_layout);

        Button locationBtn = (Button)findViewById(R.id.btnLocationButton);


        locationBtn.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        EditText longitudeText = (EditText) findViewById(R.id.etlongitude);
        EditText latitudeText = (EditText) findViewById(R.id.etlatitude);

        Double lat= Double.parseDouble(latitudeText.getText().toString());
        Double lon= Double.parseDouble(longitudeText.getText().toString());

        Intent intent = new Intent();
        Bundle bundle=new Bundle();


        bundle.putDouble("com.example.latitude", lat);
        bundle.putDouble("com.example.longitude", lon);
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();
    }

}


