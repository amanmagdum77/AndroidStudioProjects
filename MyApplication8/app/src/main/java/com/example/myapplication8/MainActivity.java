package com.example.myapplication8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.telecom.Call;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText uname,pwd;
    Button btnlogin;
    SharedPreferences pref;
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        uname = (EditText)findViewById(R.id.txtname);
        pwd   = (EditText)findViewById(R.id.txtpass);
        btnlogin = (Button)findViewById(R.id.btnlogin);
        pref = getSharedPreferences("user_details",MODE_PRIVATE);
        i = new Intent(MainActivity.this, DetailsActivity.class);
        if(pref.contains("username") && pref.contains("password"))
        {
            startActivity(i);
        }

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = uname.getText().toString();
                String password = pwd.getText().toString();
                if(username.equals("1704050")  &&  password.equals("yourname")){
                    SharedPreferences.Editor editor = pref.edit();
                    editor.putString("username",username);
                    editor.putString("password",password);
                    editor.commit();
                    Toast.makeText(MainActivity.this, "Login Successful...", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                }
                else{
                    Toast.makeText(MainActivity.this, "Credentials are not valid", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}