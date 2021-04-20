package com.example.explicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        Button c2 = (Button)findViewById(R.id.gohs1);
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j2 = new Intent(Intent.ACTION_VIEW);
                j2.setData(Uri.parse("https://www.youtube.com/watch?v=sfqqY-2jIJQ&list=PLwLSw1_eDZl0a8Ktxyo5ZH3L_CjHYLmY9"));
                startActivity(j2);

            }
        });

        Button c3 = (Button)findViewById(R.id.gohs2);
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j3 = new Intent(Intent.ACTION_VIEW);
                j3.setData(Uri.parse("https://www.youtube.com/watch?v=MHQ4gXkfaDA&list=PLwLSw1_eDZl0a8Ktxyo5ZH3L_CjHYLmY9&index=2"));
                startActivity(j3);

            }
        });
        Button c4 = (Button)findViewById(R.id.gohs3);
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j4 = new Intent(Intent.ACTION_VIEW);
                j4.setData(Uri.parse("https://www.youtube.com/watch?v=6-9jLfEzcMc&list=PLwLSw1_eDZl0a8Ktxyo5ZH3L_CjHYLmY9&index=3"));
                startActivity(j4);

            }
        });
        Button c5 = (Button)findViewById(R.id.gohs4);
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j5 = new Intent(Intent.ACTION_VIEW);
                j5.setData(Uri.parse("https://www.youtube.com/watch?v=uVqulFY4GZQ&list=PLwLSw1_eDZl0a8Ktxyo5ZH3L_CjHYLmY9&index=4"));
                startActivity(j5);

            }
        });
        Button c6 = (Button)findViewById(R.id.gohs5);
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j6 = new Intent(Intent.ACTION_VIEW);
                j6.setData(Uri.parse("https://www.youtube.com/watch?v=gargILBCdZg&list=PLwLSw1_eDZl0a8Ktxyo5ZH3L_CjHYLmY9&index=5"));
                startActivity(j6);

            }
        });

    }
}