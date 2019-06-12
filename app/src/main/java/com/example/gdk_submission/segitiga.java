package com.example.gdk_submission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class segitiga extends AppCompatActivity {
    Button btn_kalukator;
    Button btn_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segitiga);

        btn_share = findViewById(R.id.btn_share);
        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(segitiga.this, "Belum Dapat Dishare", Toast.LENGTH_SHORT).show();
            }
        });

        btn_kalukator = findViewById(R.id.btn_kalkulator);
        btn_kalukator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(segitiga.this, "Belum Dapat Menghitung", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
