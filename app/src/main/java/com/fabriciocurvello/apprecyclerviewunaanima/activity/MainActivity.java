package com.fabriciocurvello.apprecyclerviewunaanima.activity;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.fabriciocurvello.apprecyclerviewunaanima.R;
import com.fabriciocurvello.apprecyclerviewunaanima.adapter.Adapter;
import com.fabriciocurvello.apprecyclerviewunaanima.model.Disciplina;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private List<Disciplina> disciplinas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        recyclerView = findViewById(R.id.recyclerView);

        //Listagem de Disciplinas
        this.criarDisciplinas();

        //Configurar Adapter
        Adapter adapter = new Adapter( disciplinas );

        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager( layoutManager );
        recyclerView.setHasFixedSize( true );

        //inserindo uma linha entre cada item
        recyclerView.addItemDecoration(new DividerItemDecoration(this, LinearLayoutManager.VERTICAL));

        recyclerView.setAdapter( adapter );
    } // fim do onCreate()

    public void criarDisciplinas() {

        Disciplina d = new Disciplina("Lógica de Programação","Juan Baptista","SEG","LAB 05" );
        disciplinas.add(d);

        d = new Disciplina("Estatística Computacional","Wellington Avila","SEG","SALA 107" );
        disciplinas.add(d);

        d = new Disciplina("Teoria de Sistemas da Informação","Wellington Avila","TER","SALA 109" );
        disciplinas.add(d);

        d = new Disciplina("Banco de Dados I","Fabrício Curvello","QUA","LAB 05");
        disciplinas.add(d);

        d = new Disciplina("Arquitetura de Computadores","Wellington Avila","QUA","LAB 05");
        disciplinas.add(d);

        d = new Disciplina("Programação Orientada a Objetos","Fabrício Curvello","QUA","LAB 04");
        disciplinas.add(d);

        d = new Disciplina("Computação para Dispositivos Móveis","Fabrício Curvello","QUI","LAB 02");
        disciplinas.add(d);

        d = new Disciplina("Estrutura de Dados","Juan Baptista","QUI","LAB 04");
        disciplinas.add(d);

        d = new Disciplina("Interface Humano-Computador","Wellington Avila","SEX","SALA 109");
        disciplinas.add(d);

        d = new Disciplina("Desevolvimento de Software para Web","Juan Baptista","SEX","LAB 02");
        disciplinas.add(d);

        d = new Disciplina("Estatística Computacional","Wellington Avila","SEG","SALA 107" );
        disciplinas.add(d);

        d = new Disciplina("Teoria de Sistemas da Informação","Wellington Avila","TER","SALA 109" );
        disciplinas.add(d);

        d = new Disciplina("Banco de Dados I","Fabrício Curvello","QUA","LAB 05");
        disciplinas.add(d);

        d = new Disciplina("Arquitetura de Computadores","Wellington Avila","QUA","LAB 05");
        disciplinas.add(d);

        d = new Disciplina("Programação Orientada a Objetos","Fabrício Curvello","QUA","LAB 04");
        disciplinas.add(d);

        d = new Disciplina("Computação para Dispositivos Móveis","Fabrício Curvello","QUI","LAB 02");
        disciplinas.add(d);

        d = new Disciplina("Estrutura de Dados","Juan Baptista","QUI","LAB 04");
        disciplinas.add(d);

        d = new Disciplina("Interface Humano-Computador","Wellington Avila","SEX","SALA 109");
        disciplinas.add(d);

        d = new Disciplina("Desevolvimento de Software para Web","Juan Baptista","SEX","LAB 02");
        disciplinas.add(d);

        d = new Disciplina("Estatística Computacional","Wellington Avila","SEG","SALA 107" );
        disciplinas.add(d);

        d = new Disciplina("Teoria de Sistemas da Informação","Wellington Avila","TER","SALA 109" );
        disciplinas.add(d);

        d = new Disciplina("Banco de Dados I","Fabrício Curvello","QUA","LAB 05");
        disciplinas.add(d);

        d = new Disciplina("Arquitetura de Computadores","Wellington Avila","QUA","LAB 05");
        disciplinas.add(d);

        d = new Disciplina("Programação Orientada a Objetos","Fabrício Curvello","QUA","LAB 04");
        disciplinas.add(d);

        d = new Disciplina("Computação para Dispositivos Móveis","Fabrício Curvello","QUI","LAB 02");
        disciplinas.add(d);

        d = new Disciplina("Estrutura de Dados","Juan Baptista","QUI","LAB 04");
        disciplinas.add(d);

        d = new Disciplina("Interface Humano-Computador","Wellington Avila","SEX","SALA 109");
        disciplinas.add(d);

        d = new Disciplina("Desevolvimento de Software para Web","Juan Baptista","SEX","LAB 02");
        disciplinas.add(d);

        d = new Disciplina("Estatística Computacional","Wellington Avila","SEG","SALA 107" );
        disciplinas.add(d);

        d = new Disciplina("Teoria de Sistemas da Informação","Wellington Avila","TER","SALA 109" );
        disciplinas.add(d);

        d = new Disciplina("Banco de Dados I","Fabrício Curvello","QUA","LAB 05");
        disciplinas.add(d);

        d = new Disciplina("Arquitetura de Computadores","Wellington Avila","QUA","LAB 05");
        disciplinas.add(d);

        d = new Disciplina("Programação Orientada a Objetos","Fabrício Curvello","QUA","LAB 04");
        disciplinas.add(d);

        d = new Disciplina("Computação para Dispositivos Móveis","Fabrício Curvello","QUI","LAB 02");
        disciplinas.add(d);

        d = new Disciplina("Estrutura de Dados","Juan Baptista","QUI","LAB 04");
        disciplinas.add(d);

        d = new Disciplina("Interface Humano-Computador","Wellington Avila","SEX","SALA 109");
        disciplinas.add(d);

        d = new Disciplina("Desevolvimento de Software para Web","Juan Baptista","SEX","LAB 02");
        disciplinas.add(d);
    }

}