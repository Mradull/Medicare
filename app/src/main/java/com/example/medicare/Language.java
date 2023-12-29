package com.example.medicare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Language extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_language);
        bt1=findViewById(R.id.button1);
        bt2=findViewById(R.id.button2);
        bt3=findViewById(R.id.button3);
        bt4=findViewById(R.id.button4);
        bt5=findViewById(R.id.button5);
        bt6=findViewById(R.id.button6);
        bt7=findViewById(R.id.button7);
        bt8=findViewById(R.id.button8);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Language.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Language.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Language.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Language.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Language.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Language.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Language.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent= new Intent(Language.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        });

    }
}