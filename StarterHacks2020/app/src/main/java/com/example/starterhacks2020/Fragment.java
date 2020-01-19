package com.example.starterhacks2020;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Fragment extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);


        Button b = (Button) findViewById(R.id.button1);

        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                startActivity(new Intent(Fragment.this,Pop.class));
            }
        });
    }

    public void buttonOnClick(View v){
        Button button = (Button) v;
        ((Button) v).setText("clicked");

    }
}