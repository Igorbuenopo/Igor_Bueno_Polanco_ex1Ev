package com.example.igor_bueno_polanco_ex1ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityFoto extends AppCompatActivity {

    String titulo, descripcion;
    int numMonumento, puntuacion;

    ImageView imagen;

    TextView titView, descView, puntView;

    Button volver, puntuar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto);

        Bundle bun = getIntent().getExtras();

        titulo = bun.getString("titulo");
        descripcion = bun.getString("descripcion");
        numMonumento = bun.getInt("monumento");
        puntuacion = bun.getInt("puntuacion");

        imagen = findViewById(R.id.idIvMon);
        titView = findViewById(R.id.idTvTitMon);
        descView = findViewById(R.id.idTvDescMon);
        puntView = findViewById(R.id.idTvPunt);

        volver = findViewById(R.id.idBtVolver);
        puntuar = findViewById(R.id.idBtPuntuar);

        titView.setText(titulo);
        descView.setText(descripcion);
        puntView.setText("Puntuación: "+String.valueOf(puntuacion));


        if(numMonumento == 1){
            Drawable img = getDrawable(R.drawable.foto1);
            imagen.setImageDrawable(img);

        }else if(numMonumento == 2){
            Drawable img = getDrawable(R.drawable.foto2);
            imagen.setImageDrawable(img);
        }else if(numMonumento == 3){
            Drawable img = getDrawable(R.drawable.foto3);
            imagen.setImageDrawable(img);
        }else{
            Drawable img = getDrawable(R.drawable.foto4);
            imagen.setImageDrawable(img);
        }

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityFoto.this, ActivityFotos.class);
                i.putExtra("puntuar", false);
                startActivity(i);
            }
        });

        puntuar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                puntuacion = puntuacion+1;
                Intent i = new Intent(ActivityFoto.this, ActivityFotos.class);
                i.putExtra("puntuar", true);
                i.putExtra("monumento",numMonumento);
                i.putExtra("puntuacion", puntuacion);
                startActivity(i);
            }
        });






    }
}