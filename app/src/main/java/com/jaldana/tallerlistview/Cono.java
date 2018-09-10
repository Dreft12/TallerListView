package com.jaldana.tallerlistview;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class Cono extends AppCompatActivity {
    private EditText txtRadio, txtAltura;
    private AlertDialog.Builder mensaje;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cono);
        txtRadio = findViewById(R.id.txtRadio);
        txtAltura = findViewById(R.id.txtAltura);
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
        if (!txtRadio.getText().toString().isEmpty()){
            if (!txtAltura.getText().toString().isEmpty()) {
                double radio = Double.parseDouble(txtRadio.getText().toString().trim());
                double altura = Double.parseDouble(txtAltura.getText().toString().trim());
                if (radio >= 0 && altura >= 0) {
                    mensaje.setTitle(getResources().getString(R.string.resultado));
                    mensaje.setMessage(getResources().getString(R.string.areaC) + " " + String.format("%.2f", Metodos.volCono(radio, altura)));
                    mensaje.show();
                } else {
                    Toast.makeText(this, getResources().getText(R.string.errorNegativo), Toast.LENGTH_SHORT).show();
                }
            }else{
                Toast.makeText(this, getResources().getText(R.string.errorAltura), Toast.LENGTH_SHORT).show();
            }
        }else{
            Toast.makeText(this, getResources().getText(R.string.errorRadio), Toast.LENGTH_SHORT).show();
        }
    }

    public void borrar(View v){
        limpiar();
    }

    private void limpiar(){
        txtRadio.setText("");
        txtAltura.setText("");
        txtRadio.requestFocus();
    }

    public void regresar(View v){
        finish();
    }
}
