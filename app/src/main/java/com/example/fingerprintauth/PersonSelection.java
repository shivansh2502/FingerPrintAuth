package com.example.fingerprintauth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class PersonSelection extends AppCompatActivity {

    String[] Array = {"Prisoner 1","Prisoner 2","Prisoner 3","Prisoner 4",
            "Police Officer","Cook","Police Inspector","Police Junior Constable"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_person_selection);
        findViewById(R.id.loadingPanel).setVisibility(View.GONE);

        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.single_listview, Array);

        ListView listView = (ListView) findViewById(R.id.peoplelist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(PersonSelection.this, homeactivity.class);
                startActivity(intent);
            }
        });


}
}
