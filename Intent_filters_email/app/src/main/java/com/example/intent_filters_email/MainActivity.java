package com.example.intent_filters_email;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = (Button)findViewById(R.id.btn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL,new String[]{"amanmagdum77@gmail.com"});
                i.putExtra(Intent.EXTRA_SUBJECT,"Welcome to Android");
                i.putExtra(Intent.EXTRA_TEXT,"Welcome to Android Email, Implicit filter Assignment");
                startActivity(Intent.createChooser(i,"Choose Email App"));


            }
        });


    }
}