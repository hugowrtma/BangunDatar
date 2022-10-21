package com.example.aplkkalkulatorbangundatar;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Persegi extends AppCompatActivity {
    // public int panjang, lebar;
    EditText etSisi;
    TextView tvLuas, tvKeliling;
    Button count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.persegi);

        etSisi = (EditText) findViewById(R.id.sisi1);
        tvLuas = (TextView) findViewById(R.id.hasilLu);
        tvKeliling = (TextView) findViewById(R.id.hasilKel);
        count = (Button) findViewById(R.id.operasi);

        count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double sisi, Luas, Keliling;

                sisi = Double.parseDouble(String.valueOf(etSisi.getText()));
                Luas = sisi * sisi;
                Keliling = 4 * sisi;

                tvLuas.setText(String.valueOf(Luas));
                tvKeliling.setText(String.valueOf(Keliling));
            }
        });
    }
}