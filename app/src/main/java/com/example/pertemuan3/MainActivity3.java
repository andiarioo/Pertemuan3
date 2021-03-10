package com.example.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    public void home(View view) {
        Intent e = new Intent(MainActivity3.this,MainActivity.class);
        startActivity(e);
        Toast.makeText(this, "Ke Home", Toast.LENGTH_SHORT).show();
    }

    public void artikel(View view) {
        Intent f = new Intent(MainActivity3.this,MainActivity2.class);
        startActivity(f);
        Toast.makeText(this, "Ke Artikel", Toast.LENGTH_SHORT).show();
    }
}