package com.example.puebliandoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity2 extends AppCompatActivity {

    //Atributos son elementos de la actividad , una clase viene sin atributos. Una clase es un molde*/

    MediaPlayer cancion;

    //Metodos
    //clase que mapea todos los recursos de la apps  y lo lleva a la parte logica que es java.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        cancion = MediaPlayer.create(this, R.raw.musica);
        cancion.start();

        // Temporizar el splash, definir el  tiempo
        TimerTask inicioApp = new TimerTask() {
            @Override
            public void run() {
                //lanzo el HOME, se activa el home
                Intent lanzamiento = new Intent(MainActivity2.this, Home.class);
                startActivity(lanzamiento);

            }
        };
        Timer tiempo = new Timer();
        tiempo.schedule(inicioApp, 10000);
    }
}

