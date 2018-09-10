package com.jaldana.tallerlistview;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cubo extends AppCompatActivity {
    private EditText txtLong;
    private AlertDialog.Builder mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cubo);
        txtLong = findViewById(R.id.txtLong);
        mensaje = new AlertDialog.Builder(this);
        mensaje.setCancelable(false);
        mensaje.setPositiveButton(getResources().getText(R.string.continuar), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface mensaje, int id) {
                limpiar();
            }
        });
    }
    @SuppressLint("DefaultLocale")
    public void calcular(View v){
        if (!txtLong.getText().toString().isEmpty()){
            double longitud = Double.parseDouble(txtLong.getText().toString().trim());
            if (longitud >= 0 ) {
                mensaje.setTitle(getResources().getString(R.string.resultado));
                mensaje.setMessage(getResources().getString(R.string.volR) + " " + String.format("%.2f", Metodos.volCubo(longitud)));
                mensaje.show();
            } else {
                Toast.makeText(this, getResources().getText(R.string.errorNegativo), Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, getResources().getText(R.string.errorCubo), Toast.LENGTH_SHORT).show();
        }
    }

    public void borrar(View v){
        limpiar();
    }

    private void limpiar(){
        txtLong.setText("");
        txtLong.requestFocus();
    }

    public void regresar(View v){
        finish();
    }
}
