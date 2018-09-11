package com.jaldana.tallerlistview;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.LinkedList;

public class Listar extends AppCompatActivity {
    private TableLayout tabla;
    private LinkedList<Datos> datos;

    @SuppressLint("DefaultLocale")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listar);
        tabla = findViewById(R.id.tabla);
        datos = Historial.mostrar();

        for (int i = 0; i < datos.size(); i++) {
            TableRow row = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);
            c1.setText(String.valueOf(i + 1));
            c2.setText(datos.get(i).getNombre());
            c3.setText(datos.get(i).getNombreP());
            c4.setText(String.format("%.2f", datos.get(i).getResultado()));
            row.addView(c1);
            row.addView(c2);
            row.addView(c3);
            row.addView(c4);
            tabla.addView(row);
        }
    }
}
