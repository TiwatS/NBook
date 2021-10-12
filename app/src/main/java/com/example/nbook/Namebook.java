package com.example.nbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Namebook extends AppCompatActivity {
    private ImageView imageView,imageView2,imageView3,imageView4,imageView5,imageView6;

    public Namebook(ImageView imageView) {
        this.imageView = imageView;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namebook);
        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Js success");
                Intent Js = new Intent(getApplicationContext(),Js.class);
                startActivity(Js);
            }
        });
        imageView2 = findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Boots success");
                Intent Boots = new Intent(getApplicationContext(),Boots.class);
                startActivity(Boots);
            }
        });
        imageView3 = findViewById(R.id.imageView3);
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("HTML5 success");
                Intent HTML5 = new Intent(getApplicationContext(),HTML5.class);
                startActivity(HTML5);
            }
        });
        imageView4 = findViewById(R.id.imageView4);
        imageView4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("PHP success");
                Intent PHP = new Intent(getApplicationContext(),PHP.class);
                startActivity(PHP);
            }
        });
        imageView5 = findViewById(R.id.imageView5);
        imageView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Swift success");
                Intent Swift = new Intent(getApplicationContext(),Swift.class);
                startActivity(Swift);
            }
        });
        imageView6 = findViewById(R.id.imageView6);
        imageView6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("Python success");
                Intent Python = new Intent(getApplicationContext(),Python.class);
                startActivity(Python);
            }
        });
    }
}