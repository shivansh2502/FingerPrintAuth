package com.example.fingerprintauth;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class homeactivity extends AppCompatActivity {

    String RoomName;
    String PersonName;
    String KeyIdentifier1="AAAA";
    String KeyIdentifier2="BBBB";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homeactivity);
        findViewById(R.id.loadingPanel).setVisibility(View.GONE);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        RoomName=getIntent().getExtras().getString(KeyIdentifier1,KeyIdentifier1);
        PersonName=getIntent().getExtras().getString(KeyIdentifier2,KeyIdentifier2);

        TextView tv= (TextView) findViewById(R.id.message);
        tv.setText(PersonName+ " entered " + RoomName);

        Button button = (Button) findViewById(R.id.resetButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent= new Intent(homeactivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button button1 = (Button) findViewById(R.id.changeRoom);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent= new Intent(homeactivity.this, RoomActivity.class);
                startActivity(intent);
            }
        });
    }

}
