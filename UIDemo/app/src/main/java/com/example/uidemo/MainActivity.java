package com.example.uidemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = new TextView(this);
        t.setText("Name");
        EditText e = new EditText(this);
        e.setText("Enter Name");
        LinearLayout l = new LinearLayout(this);

        l.addView(t);
        l.addView(e);
        setContentView(l);
    }
}