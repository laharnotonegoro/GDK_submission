package com.example.gdk_submission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn_segitiga;
    Button btn_persegi;
    Button btn_lingkaran;
    Button btn_jajar_genjang;
    Button btn_oval;
    Button btn_layanglayang;
    Button btn_belah_ketupat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_persegi = findViewById(R.id.btn_persegi);
        btn_persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bd_persegi = new Intent(MainActivity.this, persegi.class );
                startActivity(bd_persegi);
            }
        });

        btn_lingkaran = findViewById(R.id.btn_lingkaran);
        btn_lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bd_lingkaran = new Intent(MainActivity.this, lingkaran.class);
                startActivity(bd_lingkaran);
            }
        });

        btn_segitiga = findViewById(R.id.btn_segituga);
        btn_segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bd_segitiga = new Intent(MainActivity.this, segitiga.class);
                startActivity(bd_segitiga);
            }
        });

        btn_oval = findViewById(R.id.btn_oval);
        btn_oval.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bd_oval = new Intent(MainActivity.this, oval.class);
                startActivity(bd_oval);
            }
        });

        btn_layanglayang = findViewById(R.id.btn_layanglayang);
        btn_layanglayang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bd_layanglayang = new Intent(MainActivity.this, layang_layang.class);
                startActivity(bd_layanglayang);
            }
        });

        btn_jajar_genjang = findViewById(R.id.btn_jajar_genjang);
        btn_jajar_genjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bd_jajar_genjang = new Intent(MainActivity.this, jajar_genjang.class);
                startActivity(bd_jajar_genjang);
            }
        });

        btn_belah_ketupat = findViewById(R.id.btn_belah_ketupat);
        btn_belah_ketupat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bd_belah_ketupat = new Intent(MainActivity.this, belah_ketupat.class);
                startActivity(bd_belah_ketupat);
            }
        });
    }
}


