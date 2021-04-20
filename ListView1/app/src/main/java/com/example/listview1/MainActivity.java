package com.example.listview1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView ml;  // ml reference variable for ListView
    ArrayAdapter<String> aAdapter;
    private String [] users = {"Naruto","Sasuke","Sakura","Shikamaru","Ino","Choji","Lee","Neji","Ten Ten","Kakashi","Rin","Obito",
            "Hiruzen","Tsunade","Minato","Hashirama","Tobirama","Shisui","Itachi","Pain","Konan","Hidan","Sasori","Deidera","Kakuzo",
            "Orochimaru","Jiraya","Kabuto","Konahamaru","Boruto","Sarada"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ml = (ListView)findViewById(R.id.userList);
        aAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_2,android.R.id.text1 ,users);
        ml.setAdapter(aAdapter);
        ml.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View v, int i, long l) {
                Toast.makeText(MainActivity.this,users[i], Toast.LENGTH_SHORT).show();
                if( i == 3){
                    Intent intent = new Intent(MainActivity.this,Shikamaru.class);
                    startActivityForResult(intent,0);
                }
                if( i == 1){
                    Intent intent = new Intent(MainActivity.this,Sasuke.class);
                    startActivityForResult(intent,0);
                }
                if( i == 2){
                    Intent intent = new Intent(MainActivity.this,Sakura.class);
                    startActivityForResult(intent,0);
                }




            }
        });
    }
}