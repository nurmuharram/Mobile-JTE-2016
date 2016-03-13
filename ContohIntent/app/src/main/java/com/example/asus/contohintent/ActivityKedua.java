package com.example.asus.contohintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by ASUS on 3/12/2016.
 */
public class ActivityKedua extends Activity{

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitykedua);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");

        TextView txtAct2 = (TextView) findViewById(R.id.activitykeduatext);
        txtAct2.setText(pesanStr);


    }
}
