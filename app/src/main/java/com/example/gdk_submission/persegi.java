package com.example.gdk_submission;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import org.w3c.dom.Text;

public class persegi extends AppCompatActivity {
    Button btn_kalkulator;
    Button btn_share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_persegi);

        btn_share = findViewById(R.id.btn_share);
        btn_share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(persegi.this, "Belum Dapat Dishare", Toast.LENGTH_SHORT).show();
            }
        });

        btn_kalkulator = findViewById(R.id.btn_kalkulator);
        btn_kalkulator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent bd_persegi = new Intent(persegi.this, kalkulator_persegi.class);
                startActivity(bd_persegi);
            }
        });
    }
}
