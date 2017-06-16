package com.kushal.firstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ScndScreen extends AppCompatActivity {
    private Button  mBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scnd_screen);
     mBtn  = (Button) findViewById(R.id.btnBack);
        mBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intntMain = new Intent(ScndScreen.this , MainActivity.class);
                startActivity(intntMain);
                finish();
            }
        });




    }
}
