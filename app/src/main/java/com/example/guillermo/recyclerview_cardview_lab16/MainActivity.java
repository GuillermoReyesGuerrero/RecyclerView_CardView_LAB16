package com.example.guillermo.recyclerview_cardview_lab16;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    String[][] datos= {
            {"Calibre 50","El corrido de juanito"},
            {"Banda MS","El color de tus ojos"},
            {"Alta Consigna","Te deseo lo mejor"},
            {"El fantasma","Catarino y los rurales"},
            {"Pancho Barraza","Mi enemigo el amor"},
            {"La Arrolladora","Sobre mis pies"},
            {"Remmy Valenzuela","30 cartas"}
    };
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.lista);
        Adapter adapter=new Adapter(datos);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setHasFixedSize(true);
    }
}
