package com.jaldana.tallerlistview;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Rectangulo extends AppCompatActivity {
    private EditText txtBase, txtAltura;
    private AlertDialog.Builder mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rectangulo);
        txtBase = findViewById(R.id.txtBase);
        txtAltura = findViewById(R.id.txtAltura);
        mensaje = new AlertDialog.Builder(this);
        mensaje.setCancelable(false);
        mensaje.setPositiveButton(getResources().getText(R.string.continuar), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface mensaje, int id) {
                limpiar();
            }
        });
    }

    public void calcular(View v){
        if (!txtBase.getText().toString().isEmpty() && !txtAltura.getText().toString().isEmpty()){
            int lado = Integer.parseInt(txtBase.getText().toString().trim());
            if (lado >= 0){
                mensaje.setTitle(getResources().getString(R.string.resultado));
                mensaje.setMessage(getResources().getString(R.string.areaC) + " " + Integer.toString(Metodos.areaCuadrado(lado)));
                mensaje.show();
            }else{
                Toast.makeText(this, getResources().getText(R.string.errorNegativo), Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, getResources().getText(R.string.errorVacio), Toast.LENGTH_SHORT).show();
        }
    }

    public void borrar(View v){
        limpiar();
    }

    private void limpiar(){
        txtBase.setText("");
        txtAltura.setText("");
        txtBase.requestFocus();
    }

    public void regresar(View v){
        finish();
    }
}
