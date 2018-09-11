package com.jaldana.tallerlistview;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cuadrado extends AppCompatActivity {
    private EditText txtLado;
    private AlertDialog.Builder mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cuadrado);
        txtLado = findViewById(R.id.txtLado);
        mensaje = new AlertDialog.Builder(this);
        mensaje.setCancelable(false);
        mensaje.setPositiveButton(getResources().getText(R.string.continuar), new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface mensaje, int id) {
                limpiar();
            }
        });

    }

    public void calcular(View v){
        if (!txtLado.getText().toString().isEmpty()){
            int lado = Integer.parseInt(txtLado.getText().toString().trim());
            if (lado >= 0){
                String nombre = "Area del Cuadrado", nombreP = "Lado:" + lado;
                int resultado = Metodos.areaCuadrado(lado);
                Metodos.guardarLista(nombre, nombreP, resultado);
                mensaje.setTitle(getResources().getString(R.string.resultado));
                mensaje.setMessage(getResources().getString(R.string.areaC) + " " + Integer.toString(resultado));
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
        txtLado.setText("");
        txtLado.requestFocus();
    }

    public void regresar(View v){
        finish();
    }
}
