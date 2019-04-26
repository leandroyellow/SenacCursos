package com.example.leandroqtrepador.senaccursos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public static final String TITULO = "MENSAGEMTITULO";
    public String tituloDaActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tecnologia (View view){
        tituloDaActivity = "Tecnologia da Informação";
        Intent intent = new Intent(this, ListaCursoActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
    public void moda (View view){
        tituloDaActivity = "Moda";
        Intent intent = new Intent(this, ListaCursoActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
    public void saude (View view){
        tituloDaActivity = "Saúde";
        Intent intent = new Intent(this, ListaCursoActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
    public void gastronomia (View view){
        tituloDaActivity = "Gastronomia";
        Intent intent = new Intent(this, ListaCursoActivity.class);
        intent.putExtra(TITULO, tituloDaActivity);
        startActivity(intent);
    }
}
