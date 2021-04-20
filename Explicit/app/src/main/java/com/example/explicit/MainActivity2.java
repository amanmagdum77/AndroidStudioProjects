package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button a1 = (Button)findViewById(R.id.e1);
        a1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j1 = new Intent(Intent.ACTION_VIEW);
                j1.setData(Uri.parse("https://www.youtube.com/watch?v=RoAPuxzfad4"));
                startActivity(j1);
            }
        });


        Button a2 = (Button)findViewById(R.id.e2);
        a2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j2 = new Intent(Intent.ACTION_VIEW);
                j2.setData(Uri.parse("https://www.youtube.com/watch?v=cXUGI0CVG4c"));
                startActivity(j2);
            }
        });

        Button a3 = (Button)findViewById(R.id.e3);
        a3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j3 = new Intent(Intent.ACTION_VIEW);
                j3.setData(Uri.parse("https://www.youtube.com/watch?v=Kgcp9mzgtIM&list=PLwLSw1_eDZl0eZktsDv3cu78EC0l2qYKI&index=3"));
                startActivity(j3);
            }
        });


        Button a4 = (Button)findViewById(R.id.e4);
        a4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j4 = new Intent(Intent.ACTION_VIEW);
                j4.setData(Uri.parse("https://www.youtube.com/watch?v=d6fm4-ym830&list=PLwLSw1_eDZl0eZktsDv3cu78EC0l2qYKI&index=4"));
                startActivity(j4);
            }
        });

        Button a5 = (Button)findViewById(R.id.e5);
        a5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j5 = new Intent(Intent.ACTION_VIEW);
                j5.setData(Uri.parse("https://www.youtube.com/watch?v=bvi1YXJ4VnY"));
                startActivity(j5);
            }
        });



    }
}