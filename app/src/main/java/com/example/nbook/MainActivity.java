package com.example.nbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button Buttonlog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Buttonlog = findViewById(R.id.buttonlog);
        Buttonlog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("login success");
                Intent login = new Intent(getApplicationContext(),Namebook.class);
                startActivity(login);
            }
        });
    }
}