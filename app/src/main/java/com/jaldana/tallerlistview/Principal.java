package com.jaldana.tallerlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity {
    private Intent in;
    private ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lv = findViewById(R.id.lstOp);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                switch (i) {
                    case 0: {
                        in = new Intent(Principal.this, Areas.class);
                        startActivity(in);
                        break;
                    }
                    case 1: {
                        in = new Intent(Principal.this, Volumenes.class);
                        startActivity(in);
                        break;
                    }
                }
            }
        });
    }
}
