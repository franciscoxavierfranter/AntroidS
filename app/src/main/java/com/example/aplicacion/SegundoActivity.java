package com.example.aplicacion;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class SegundoActivity extends AppCompatActivity {
    List<ListElement> elements;
    private Spinner spinner1;
    private String[] corpse = {"humano", "zombie", "Nemesis", "UberSoldat"};
    private TextView emailView;
    private String[] text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        init();

        spinner1 = findViewById(R.id.id_spinner);
        ArrayAdapter<String> corpse1 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, corpse);
        spinner1.setAdapter(corpse1);

        emailView = (TextView) findViewById(R.id.textUsuario);
    }

    public void init() {
        elements = new ArrayList<>();
        elements.add(new ListElement("#775447", "Chile", "Santiago", "Activo"));
        elements.add(new ListElement("#775447", "Mexico", "Mexico DF", "Activo"));
        elements.add(new ListElement("#775447", "Argentina", "Buenos Aires", "Activo"));
        elements.add(new ListElement("#775447", "Peru", "Lima", "Activo"));
        elements.add(new ListElement("#775447", "Uruguay", "Montevideo", "Activo"));

        ListAdapter listAdapter = new ListAdapter(elements, this);
        RecyclerView recyclerView = findViewById(R.id.listRecycleeView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(listAdapter);
    }
}