package com.example.registration_file;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DetailsActivity extends AppCompatActivity
{
    FileInputStream fstream;
    Intent i;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.deatils);

        TextView res = (TextView)findViewById(R.id.resView);
        Button back = (Button)findViewById(R.id.btnBack);

        try {
            fstream = openFileInput("users");
            StringBuffer sb = new StringBuffer();
            int i;
            while ((i = fstream.read())!= -1){
                sb.append((char) i);
            }
            fstream.close();
            String details[] = sb.toString().split("\n");
            res.setText("Name : "+details[0] + "\nPassword : "+details[1]);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                i = new Intent(DetailsActivity.this,MainActivity.class);
                startActivity(i);
            }
        });

    }
}
