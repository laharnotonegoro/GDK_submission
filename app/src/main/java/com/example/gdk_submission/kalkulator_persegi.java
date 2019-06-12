package com.example.gdk_submission;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class kalkulator_persegi extends AppCompatActivity {
    private EditText sisisisi, luas;
    private Button btn_hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_persegi);

        sisisisi = (EditText) findViewById(R.id.edt_sisi);
        luas = (EditText) findViewById(R.id.edt_hasil_luas);
        btn_hitung = (Button)findViewById(R.id.btn_hitung);
        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double sisi = Double.parseDouble(String.valueOf(sisisisi.getText()));
                double luaspersegi = (sisi * sisi);
                luas.setText(String.valueOf(luaspersegi));
            }
        });
    }
}
