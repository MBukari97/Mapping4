package com.example.a2bukam38.mapping;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


/**
 * Created by 2bukam38 on 05/02/2018.
 */

public class MapChooseActivity extends AppCompatActivity implements  View.OnClickListener
{

    public void onCreate (Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_choose);

        Button regularBtn = (Button)findViewById(R.id.btnRegular),
                hikeBikeBtn = (Button)findViewById(R.id.btnHikeBikeMap);

        regularBtn.setOnClickListener(this);
        hikeBikeBtn.setOnClickListener(this);
    }

    public void onClick(View view)
    {
        Intent intent = new Intent();
        Bundle bundle=new Bundle();
        boolean hikebikemap=false;
        if (view.getId()==R.id.btnHikeBikeMap)
        {
            hikebikemap=true;
        }
        bundle.putBoolean("com.example.hikebikemap",hikebikemap);
        intent.putExtras(bundle);
        setResult(RESULT_OK,intent);
        finish();
    }

}


