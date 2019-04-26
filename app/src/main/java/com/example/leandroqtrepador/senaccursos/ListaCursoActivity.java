package com.example.leandroqtrepador.senaccursos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.leandroqtrepador.senaccursos.modelos.Cursos;

import java.util.ArrayList;

public class ListaCursoActivity extends AppCompatActivity {

    public ArrayList<Cursos> cursos = new ArrayList<>();
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_curso);

        Intent intent = getIntent();
        String titulo = intent.getStringExtra(MainActivity.TITULO);
        TextView textViewTitulo = findViewById(R.id.tvTitulo);
        textViewTitulo.setText(titulo);

        if (titulo.equals("Tecnologia da Informação")){
            cursos.add(new Cursos("Programação", 188.99, "Aprendendo a programar"));
            cursos.add(new Cursos("Windows", 333.45, "Como arrumar seu carro"));
            cursos.add(new Cursos("Linux", 332.99, "Como ir para a lua"));
        }
        else if (titulo.equals("Moda")){
            cursos.add(new Cursos("costura", 188.99, "Aprendendo a programar"));
            cursos.add(new Cursos("saia", 333.45, "Como arrumar seu carro"));
            cursos.add(new Cursos("fuchico", 332.99, "Como ir para a lua"));
        }
        else if (titulo.equals("Saúde")){
            cursos.add(new Cursos("farmacia", 188.99, "Aprendendo a programar"));
            cursos.add(new Cursos("enfermagem", 333.45, "Como arrumar seu carro"));
        }
        else if (titulo.equals("Gastronomia")){
            cursos.add(new Cursos("brigadeiro", 188.99, "Aprendendo a programar"));
            cursos.add(new Cursos("bolo", 333.45, "Como arrumar seu carro"));
            cursos.add(new Cursos("doce", 332.99, "Como ir para a lua"));
            cursos.add(new Cursos("pudim", 188.99, "Aprendendo a programar"));
            cursos.add(new Cursos("beringela", 333.45, "Como arrumar seu carro"));
            cursos.add(new Cursos("fubá", 332.99, "Como ir para a lua"));
        }

        listaCursos(cursos);

    }

    public void listaCursos(ArrayList<Cursos>lista){
        linearLayout = findViewById(R.id.llListaCurso);
        for (int i = 0; i<lista.size(); i ++){
            TextView textViewNome = new TextView(this);
            TextView textViewPreco = new TextView(this);
            TextView textViewDescricao = new TextView(this);

            textViewNome.setText(lista.get(i).getNome());
            textViewNome.setTextSize(20);
            textViewPreco.setText(lista.get(i).getPreco().toString());
            textViewDescricao.setText(lista.get(i).getDescricao());

            linearLayout.addView(textViewNome);
            linearLayout.addView(textViewPreco);
            linearLayout.addView(textViewDescricao);
        }
    }
}
