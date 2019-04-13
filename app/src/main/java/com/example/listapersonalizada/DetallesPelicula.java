package com.example.listapersonalizada;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DetallesPelicula extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalles_pelicula);

        TextView titulo = (TextView) findViewById(R.id.tvTituloDescripcion);
        TextView detalles = (TextView) findViewById(R.id.tvDescripcion);

        Intent intent = getIntent();
        Bundle b = intent.getExtras();

        if (b!=null){
            titulo.setText(b.getString("TIT"));
            detalles.setText(b.getString("DET"));
        }
    }
}
