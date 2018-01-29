package com.example.a2bukam38.mapping;

import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.osmdroid.config.Configuration;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        // This line sets the user agent, a requirement to download OSM maps
        Configuration.getInstance().load(this, PreferenceManager.getDefaultSharedPreferences(this));

        setContentView(R.layout.activity_main);

        MapView mv = (MapView)findViewById(R.id.map1);
        mv.setBuiltInZoomControls(true);

        mv.getController() .setZoom(16);

        mv.getController() .setCenter (new GeoPoint(53.430829, -2.960830));
    }
}
