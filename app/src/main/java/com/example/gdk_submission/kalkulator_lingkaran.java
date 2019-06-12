package com.example.gdk_submission;

import android.net.wifi.aware.PublishConfig;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import org.w3c.dom.Text;

public class kalkulator_lingkaran extends AppCompatActivity {
    private EditText jarijari, luas;
    private  Button btn_hitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator_lingkaran);

        jarijari = (EditText) findViewById(R.id.edt_jari_jari);
        luas = (EditText) findViewById(R.id.edt_hasil_luas);
        btn_hitung = (Button)findViewById(R.id.btn_hitung);
        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double jari = Double.parseDouble(String.valueOf(jarijari.getText()));
                double luaslingkaran = (3.14 * jari * jari);
                luas.setText(String.valueOf(luaslingkaran));
            }
        });
    }
}
