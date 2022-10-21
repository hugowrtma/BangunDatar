package com.example.aplkkalkulatorbangundatar;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Lingkaran extends AppCompatActivity {
    // public int panjang, lebar;
    EditText etJari;
    TextView tvLuas, tvKeliling;
    Button count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lingkaran);

        etJari = (EditText) findViewById(R.id.jari1);
        tvLuas = (TextView) findViewById(R.id.hasilLu);
        tvKeliling = (TextView) findViewById(R.id.hasilKel);
        count = (Button) findViewById(R.id.operasi);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double jari, Luas, Keliling;

                jari = Double.parseDouble(String.valueOf(etJari.getText()));
                Luas = Math.PI*Math.pow(jari, 2);
                Keliling = Math.PI*2*jari;

                tvLuas.setText(String.valueOf(Luas));
                tvKeliling.setText(String.valueOf(Keliling));
            }
        });
    }
}