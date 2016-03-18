package com.example.asus.tugas09_tebakgambar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by ASUS on 3/18/2016.
 */
public class ActivityKedua extends Activity {
    @Override
    protected  void onCreate (Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitykedua);

        Intent pesan = getIntent();
        String pesan1Str = pesan.getStringExtra("varl");
        int pesan2Str = pesan.getIntExtra("var2", 0);

        TextView Hasiltxt = (TextView) findViewById(R.id.Hasiltxt);
        Hasiltxt.setText(pesan1Str);

        ImageView imgView = (ImageView) findViewById(R.id.imgView);
        imgView.setImageResource(pesan2Str);
    }
}