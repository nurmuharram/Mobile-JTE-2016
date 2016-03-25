package com.example.asus.tugas10_usernamepassword;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Created by ASUS on 3/25/2016.
 */
public class ActivityHalamanUtama extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityhalamanutama);

        Intent pesan = getIntent();
        String pesanStr = pesan.getStringExtra("var1");

        TextView txtHasil = (TextView) findViewById(R.id.txthasil);
        txtHasil.setText(pesanStr);
    }

    public void onClickBtnUbah(View view){
        Intent pesan = new Intent(getApplicationContext(), ActivityUbahLogin.class);
        startActivity(pesan);
    }
}