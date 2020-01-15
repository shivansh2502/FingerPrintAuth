package com.example.fingerprintauth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class RoomActivity extends AppCompatActivity {

    String[] Array = {"Ward 1","Ward 2","Ward 3","Ward 4",
            "Canteen","Gym","Office"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.single_listview, Array);
        ListView listView = (ListView) findViewById(R.id.roomlist);
        listView.setAdapter(adapter);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String s=Array[position];
                PersonSelection ha = new PersonSelection();
                ha.changeName(s);
                Toast.makeText(RoomActivity.this,"Room name Changed to "+s, Toast.LENGTH_LONG).show();
                Intent intent= new Intent(RoomActivity.this, PersonSelection.class);
                startActivity(intent);
            }
        });
    }
}
