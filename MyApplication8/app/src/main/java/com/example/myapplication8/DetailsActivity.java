package com.example.myapplication8;

import android.app.AppComponentFactory;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    SharedPreferences prf;
    Intent i;
    @Override
    protected void onCreate(@Nullable Bundle savedInstancesState) {
        super.onCreate(savedInstancesState);

        setContentView(R.layout.details);
        TextView result = (TextView)findViewById(R.id.resultView);
        Button btnlogout = (Button)findViewById(R.id.btnlogout);
        prf = getSharedPreferences("user_details",MODE_PRIVATE);
        i =  new Intent(DetailsActivity.this,MainActivity.class);
        result.setText("Hello "+ prf.getString("username",null));
        btnlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = prf.edit();
                editor.clear();
                editor.commit();
                startActivity(i);
            }
        });
    }


}
