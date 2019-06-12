package com.example.gdk_submission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class oval extends AppCompatActivity {
    Button btn_kalkulator;
    Button btn_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oval);

        btn_share = findViewById(R.id.btn_share);
        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(oval.this, "Belum Dapat Dishare", Toast.LENGTH_SHORT).show();
            }
        });

        btn_kalkulator = findViewById(R.id.btn_kalkulator);
        btn_kalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(oval.this, "Belum Dapat Menghitung", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
