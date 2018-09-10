package com.jaldana.tallerlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Volumenes extends AppCompatActivity {
    private ListView lvVol;
    private Intent in;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volumenes);
        lvVol = findViewById(R.id.lstVolumenes);
        lvVol.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                switch (i) {
                    case 0: {
                        in = new Intent(Volumenes.this, Esfera.class);
                        startActivity(in);
                        break;
                    }
                    case 1: {
                        in = new Intent(Volumenes.this, Cilindro.class);
                        startActivity(in);
                        break;
                    }
                    case 2: {
                        in = new Intent(Volumenes.this, Cono.class);
                        startActivity(in);
                        break;
                    }
                    case 3: {
                        in = new Intent(Volumenes.this, Circulo.class);
                        startActivity(in);
                        break;
                    }
                    case 4: {
                        finish();
                        break;
                    }
                }
            }
        });
    }
}
