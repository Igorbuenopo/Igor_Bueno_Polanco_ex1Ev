package com.example.igor_bueno_polanco_ex1ev;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

public class ActivityFotos extends AppCompatActivity {

    //creamos los objetos de los monumentos
    Monumento m1 = new Monumento("Puppy", "Puppy (en español Cachorro) es una icónica escultura floral moderna realizada por el artista estadounidense Jeff Koons en 1992 que está ubicada frente al Museo Guggenheim de la ciudad de Bilbao, España.", "foto1", 0);
    Monumento m2 = new Monumento("Torre de Pisa", "La torre de Pisa o torre inclinada de Pisa (en italiano: torre pendente di Pisa) es la torre campanario de la catedral de Pisa, situada en la plaza del Duomo de Pisa, en la ciudad del mismo nombre, municipio de la región italiana de la Toscana y capital de la provincia homónima de Italia.", "foto2", 0);
    Monumento m3 = new Monumento("El Cristo Redentor", "El Cristo Redentor o Cristo del Corcovado es una estatua art déco que representa a Jesús de Nazaret, con los brazos abiertos, mostrando a la ciudad de Río de Janeiro, Brasil. La estatua tiene una altura de treinta metros sobre un pedestal de ocho metros", "foto3", 0);
    Monumento m4 = new Monumento("Taj Mahal", "El Taj Mahal (hindi: ताज महल Tāj Mahal, urdu: تاج محل Tāŷ Mahal, 'Corona de los palacios'; es un monumento funerario construido entre 1632 y 1654 en la ciudad de Agra, estado de Uttar Pradesh (India), a orillas del río Yamuna, por el emperador musulmán Shah Jahan de la dinastía mogol.", "foto4", 0);

    //declaramos las variables de las imagenes y los TextView
    ImageView monumento1, monumento2, monumento3, monumento4;
    TextView titulo1, titulo2, titulo3, titulo4;
    TextView puntuacion1, puntuacion2, puntuacion3, puntuacion4;
    int numMonumento;//int para saber el monumento
    int puntuacion;//int para saber la puntuacion

    boolean puntuar = false;//booleano para saber si puntua o no


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fotos);

        Bundle bun = getIntent().getExtras();

        //con el bundle conseguimos el booelano de puntuar
        puntuar = bun.getBoolean("puntuar");


        //si es true, puntua segun el numMonumento, si es false, no lo hace
        if(puntuar){
            numMonumento = bun.getInt("monumento");
            puntuacion = bun.getInt("puntuacion");

            if(numMonumento ==1){
                m1.setPuntuacion(puntuacion);

            }else if(numMonumento == 2){
                m2.setPuntuacion(puntuacion);
            }else if(numMonumento == 3){
                m3.setPuntuacion(puntuacion);
            }else{
                m4.setPuntuacion(puntuacion);
            }

        }




        // id de las imagenes
        monumento1 = findViewById(R.id.idIvMon1);
        monumento2 = findViewById(R.id.idIvMon2);
        monumento3 = findViewById(R.id.idIvMon3);
        monumento4 = findViewById(R.id.idIvMon4);

        //id de los titulos
        titulo1 = findViewById(R.id.idTvTitMon1);
        titulo2 = findViewById(R.id.idTvTitMon2);
        titulo3 = findViewById(R.id.idTvTitMon3);
        titulo4 = findViewById(R.id.idTvTitMon4);

        //id de las puntuaciones

        puntuacion1 = findViewById(R.id.idTvPuntMon1);
        puntuacion2 = findViewById(R.id.idTvPuntMon2);
        puntuacion3 = findViewById(R.id.idTvPuntMon3);
        puntuacion4 = findViewById(R.id.idTvPuntMon4);


        //seteamos titulos
        titulo1.setText(m1.getTitulo());
        titulo2.setText(m2.getTitulo());
        titulo3.setText(m3.getTitulo());
        titulo4.setText(m4.getTitulo());

        //seteamos puntuaciones
        puntuacion1.setText("Puntuación: "+String.valueOf(m1.getPuntuacion()));
        puntuacion2.setText("Puntuación: "+String.valueOf(m2.getPuntuacion()));
        puntuacion3.setText("Puntuación: "+String.valueOf(m3.getPuntuacion()));
        puntuacion4.setText("Puntuación: "+String.valueOf(m4.getPuntuacion()));

        //si clicka la imagen del monumento1, envia los datos del monumento 1
        monumento1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numMonumento = 1;
                Intent i = new Intent(ActivityFotos.this, ActivityFoto.class);
                i.putExtra("titulo", m1.getTitulo());
                i.putExtra("descripcion", m1.getDescripcion());
                i.putExtra("monumento", numMonumento);
                i.putExtra("puntuacion", m1.getPuntuacion());
                startActivity(i);
            }
        });
        //si clicka la imagen del monumento2, envia los datos del monumento 2
        monumento2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numMonumento = 2;
                Intent i = new Intent(ActivityFotos.this, ActivityFoto.class);
                i.putExtra("titulo", m2.getTitulo());
                i.putExtra("descripcion", m2.getDescripcion());
                i.putExtra("monumento", numMonumento);
                i.putExtra("puntuacion", m2.getPuntuacion());
                startActivity(i);
            }
        });
        //si clicka la imagen del monumento3, envia los datos del monumento 3
        monumento3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numMonumento = 3;
                Intent i = new Intent(ActivityFotos.this, ActivityFoto.class);
                i.putExtra("titulo", m3.getTitulo());
                i.putExtra("descripcion", m3.getDescripcion());
                i.putExtra("monumento", numMonumento);
                i.putExtra("puntuacion", m3.getPuntuacion());
                startActivity(i);
            }
        });
        //si clicka la imagen del monumento4, envia los datos del monumento 4
        monumento4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numMonumento = 4;
                Intent i = new Intent(ActivityFotos.this, ActivityFoto.class);
                i.putExtra("titulo", m4.getTitulo());
                i.putExtra("descripcion", m4.getDescripcion());
                i.putExtra("monumento", numMonumento);
                i.putExtra("puntuacion", m4.getPuntuacion());
                startActivity(i);
            }
        });





    }
}