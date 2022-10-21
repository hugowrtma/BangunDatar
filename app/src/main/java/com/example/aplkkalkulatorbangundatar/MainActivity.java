package com.example.aplkkalkulatorbangundatar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "OOP_ACT";
    private Button persegi, lingkaran, segitiga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        persegi = (Button) findViewById(R.id.gambar_persegi1);
        persegi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), Persegi.class);
                startActivity(intent);
            }
        });

        lingkaran = (Button) findViewById(R.id.gambar_lingkaran1);
        lingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent (getApplicationContext(), Lingkaran.class);
                startActivity(new Intent (getApplicationContext(), Lingkaran.class));
            }
        });

        segitiga = (Button) findViewById(R.id.gambar_segitiga1);
        segitiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getApplicationContext(), Segitiga.class);
                startActivity(intent);
            }
        });
    }
}