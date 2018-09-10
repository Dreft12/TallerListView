package com.jaldana.tallerlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Areas extends AppCompatActivity {
    private ListView lvArea;
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_areas);
        lvArea = findViewById(R.id.lstAreas);
        lvArea.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                switch (i) {
                    case 0: {
                        in = new Intent(Areas.this, Cuadrado.class);
                        startActivity(in);
                        break;
                    }
                    case 1: {
                        in = new Intent(Areas.this, Rectangulo.class);
                        startActivity(in);
                        break;
                    }
                    case 2: {
                        in = new Intent(Areas.this, Triangulo.class);
                        startActivity(in);
                        break;
                    }
                }
            }
        });
    }
}
