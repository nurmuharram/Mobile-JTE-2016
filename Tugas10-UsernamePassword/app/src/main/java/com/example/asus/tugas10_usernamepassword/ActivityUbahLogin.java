package com.example.asus.tugas10_usernamepassword;

import android.app.Activity;

        import android.content.Context;
        import android.content.Intent;
        import android.content.SharedPreferences;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;

public class ActivityUbahLogin extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityubahlogin);
    }

    public void onClickBtnSimpan(View view){
        EditText inputUbahUsername = (EditText) findViewById(R.id.userubah);
        String usernameStr = inputUbahUsername.getText().toString();
        EditText inputUbahPassword = (EditText) findViewById(R.id.passwordubah);
        String passwordStr = inputUbahPassword.getText().toString();

        SharedPreferences sharedPreferences =
                getSharedPreferences("id.ac.unsyiah.elektro.mobile.tugas10_usernamepassword.PREF_BERSAMA", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("user", usernameStr);
        editor.putString("pass", passwordStr);
        editor.apply();

        Intent pesan = new Intent(getApplicationContext(), MainActivity.class);
        pesan.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(pesan);
        finish();
    }
}