package com.panares.panaresquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class IsScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is_screen);
    }

    public void callHome(View view) {
        Intent intent = new Intent(this, MainScreen.class);
        startActivity(intent);
    }

    public void callCS(View view) {
        Intent intent = new Intent(this, CsScreen.class);
        startActivity(intent);
    }

    public void callIS(View view) {
        Intent intent = new Intent(this, IsScreen.class);
        startActivity(intent);
    }
}
