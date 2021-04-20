package com.example.autocompleteview1;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    String [] countries = {"India", "US", "indonesia", "Japan", "Canada","Russia","Cuba","Malasyia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, countries);
        AutoCompleteTextView ac = (AutoCompleteTextView) findViewById(R.id.autoComplete);
        ac.setThreshold(1);
        ac.setAdapter(adapter);
        ac.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this,"Selected Item" + adapterView.getSelectedItem(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}