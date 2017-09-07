package com.panares.panaresquiz1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainScreen extends AppCompatActivity {

    Button btn_SendCS, btn_SendIT, btn_SendIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_screen);

        btn_SendCS = (Button) findViewById(R.id.btnSendCS);
        btn_SendIT = (Button) findViewById(R.id.btnSendIT);
        btn_SendIS = (Button) findViewById(R.id.btnSendIS);
    }

    public void callCS(View view) {
        Intent intent = new Intent(this, CsScreen.class);
        startActivity(intent);
    }

    public void callIT(View view) {
        Intent intent = new Intent(this, ItScreen.class);
        startActivity(intent);
    }

    public void callIS(View view) {
        Intent intent = new Intent(this, IsScreen.class);
        startActivity(intent);
    }
}
