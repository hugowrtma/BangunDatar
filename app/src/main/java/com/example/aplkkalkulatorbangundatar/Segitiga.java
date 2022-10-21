package com.example.aplkkalkulatorbangundatar;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Segitiga extends AppCompatActivity {
    EditText etAlas, etTinggi, etMiring;
    TextView tvLuas, tvKeliling;
    Button count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.segitiga);

        etAlas = (EditText) findViewById(R.id.alas1);
        etTinggi = (EditText) findViewById(R.id.tinggi1);
        etMiring = (EditText) findViewById(R.id.sisiMiring1);
        tvLuas = (TextView) findViewById(R.id.hasilLu);
        tvKeliling = (TextView) findViewById(R.id.hasilKel);
        count = (Button) findViewById(R.id.operasi);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double alas, tinggi, miring, Luas, Keliling;

                alas = Double.parseDouble(String.valueOf(etAlas.getText()));
                tinggi = Double.parseDouble(String.valueOf(etTinggi.getText()));
                miring = Double.parseDouble(String.valueOf(etMiring.getText()));
                Luas = alas*tinggi*0.5;
                Keliling = alas+tinggi+miring;

                tvLuas.setText(String.valueOf(Luas));
                tvKeliling.setText(String.valueOf(Keliling));
            }
        });
    }
}