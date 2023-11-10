package com.example.igor_bueno_polanco_ex1ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    //Imagen del logo
    ImageView logo;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //consigo el id de la imgen del logo
        logo = findViewById(R.id.idIvLogo);


        //Setea el listener para la imagen
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //creamos el intent para ir al activity de las fotos de los monumentos
                Intent i = new Intent(MainActivity.this, ActivityFotos.class);
                i.putExtra("puntuar", false);//seteamos un booleano, luego se especifica porque
                startActivity(i);


            }
        });
    }
}