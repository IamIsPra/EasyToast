package com.medialablk.easytoastapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.medialablk.easytoast.EasyToast;

public class MainActivity extends AppCompatActivity {

    Button btnSuccess, btnError, btnInfo, btnWarning, btnCustom, btnCustom2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSuccess = (Button) findViewById(R.id.btnSuccess);
        btnError = (Button) findViewById(R.id.btnError);
        btnInfo = (Button) findViewById(R.id.btnInfo);
        btnWarning = (Button) findViewById(R.id.btnWarning);
        btnCustom = (Button) findViewById(R.id.btnCustom);
        btnCustom2 = (Button) findViewById(R.id.btnCustom2);

        btnSuccess.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EasyToast.success(MainActivity.this, "Success!!!", Toast.LENGTH_LONG);
            }
        });

        btnError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EasyToast.error(MainActivity.this, "Error!!!", Toast.LENGTH_LONG);
            }
        });

        btnInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EasyToast.info(MainActivity.this, "Info!!!", Toast.LENGTH_LONG);
            }
        });

        btnWarning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EasyToast.warning(MainActivity.this, "Warning!!!", Toast.LENGTH_LONG);
            }
        });

        btnCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EasyToast.custom(MainActivity.this, "Custom w/o icon", Toast.LENGTH_LONG);
            }
        });

        btnCustom2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EasyToast.custom(MainActivity.this, "I am customized!!!", R.drawable.custom, getResources().getColor(R.color.maroon), getResources().getColor(R.color.gold), Toast.LENGTH_LONG);
            }
        });

    }


}
