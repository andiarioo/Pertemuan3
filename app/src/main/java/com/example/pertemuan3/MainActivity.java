package com.example.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void artikel(View view) {
        Intent a = new Intent(MainActivity.this,MainActivity2.class);
        startActivity(a);
        Toast.makeText(this, "Ke Artikel", Toast.LENGTH_SHORT).show();
    }

    public void biodata(View view) {
        Intent b = new Intent(MainActivity.this,MainActivity3.class);
        startActivity(b);
        Toast.makeText(this, "Ke Biodata Mahasiswa", Toast.LENGTH_SHORT).show();
    }
}