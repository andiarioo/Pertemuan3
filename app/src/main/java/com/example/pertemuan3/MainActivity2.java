package com.example.pertemuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void home(View view) {
        Intent c = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(c);
        Toast.makeText(this, "Ke Home", Toast.LENGTH_SHORT).show();
    }

    public void biodata(View view) {
        Intent d = new Intent(MainActivity2.this,MainActivity3.class);
        startActivity(d);
        Toast.makeText(this, "Ke Biodata Mahasiswa", Toast.LENGTH_SHORT).show();
    }
}