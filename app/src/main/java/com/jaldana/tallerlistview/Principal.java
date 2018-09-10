package com.jaldana.tallerlistview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class Principal extends AppCompatActivity {
    private Intent in;
    private ListView lv;
    private AlertDialog.Builder mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        lv = findViewById(R.id.lstOp);
        mensaje = new AlertDialog.Builder(this);
        mensaje.setCancelable(false);
        mensaje.setTitle(getResources().getString(R.string.salir));
        mensaje.setMessage(getResources().getString(R.string.salirMensaje));
        mensaje.setPositiveButton(getResources().getText(R.string.si), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface mensaje, int id) {
                finish();
            }
        });
        mensaje.setNegativeButton(getResources().getString(R.string.no), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialogo1, int id) {
                //No hace nada, lo mantiene en el activity
            }
        });
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
                    case 3: {
                        mensaje.show();
                        break;
                    }
                }
            }
        });
    }
}
