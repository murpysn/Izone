package com.example.izone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class About extends AppCompatActivity {
    ImageView foto;
            TextView nama, email;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("About");
        foto = (ImageView) findViewById(R.id.fotoku);
        nama = (TextView) findViewById(R.id.namaku);
        email = (TextView) findViewById(R.id.emailku);
        foto.setImageResource(R.drawable.fotodiri);
        nama.setText("Murpy Satriya Nugraha");
        email.setText("murpy.simdig25@gmail.com");
    }
}
