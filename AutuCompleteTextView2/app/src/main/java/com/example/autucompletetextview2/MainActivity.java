package com.example.autucompletetextview2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView ac;
    String [] countires = {"India","Nepal","China","USA","UK","Australia","USSR","Indonesia"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ac = (AutoCompleteTextView)findViewById(R.id.acv_country);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_dropdown_item_1line,countires);

        ac.setThreshold(2);
        ac.setAdapter(adapter);


        ac.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {
                Toast.makeText(MainActivity.this, "Selected Item "+ adapterView.getSelectedItem(), Toast.LENGTH_SHORT).show();
            }
        });




    }
}