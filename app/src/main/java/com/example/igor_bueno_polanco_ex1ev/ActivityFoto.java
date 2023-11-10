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

    //declaramos las variables de los datos de los monumentos
    String titulo, descripcion;
    int numMonumento, puntuacion;

    ImageView imagen;

    //declaramos los TextView y los botones de volver y puntuar
    TextView titView, descView, puntView;

    Button volver, puntuar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto);

        Bundle bun = getIntent().getExtras();

        //recibimos con el bundle los datos del monumento
        titulo = bun.getString("titulo");
        descripcion = bun.getString("descripcion");
        numMonumento = bun.getInt("monumento");
        puntuacion = bun.getInt("puntuacion");

        //los id de lso componentes
        imagen = findViewById(R.id.idIvMon);
        titView = findViewById(R.id.idTvTitMon);
        descView = findViewById(R.id.idTvDescMon);
        puntView = findViewById(R.id.idTvPunt);

        volver = findViewById(R.id.idBtVolver);
        puntuar = findViewById(R.id.idBtPuntuar);

        //seteamos los datos
        titView.setText(titulo);
        descView.setText(descripcion);
        puntView.setText("Puntuación: "+String.valueOf(puntuacion));

        //segun el numMonumento seteamos la imagen
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

        //onclickListener del boton volver, con el booleano de puntuar a false
        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(ActivityFoto.this, ActivityFotos.class);
                i.putExtra("puntuar", false);
                startActivity(i);
            }
        });

        //onclickListener del boton volver, con el booleano de puntuar a true, y con el nuevo puntuacion y a que monumento
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