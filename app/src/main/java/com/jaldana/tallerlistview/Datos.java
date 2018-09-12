package com.jaldana.tallerlistview;

public class Datos {
    private String nombre;
    private String nombreP;
    private double resultado;

    public Datos(String nombre, String nombreP, double resultado) {
        this.nombre = nombre;
        this.nombreP = nombreP;
        this.resultado = resultado;
    }

    public  String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public double getResultado() {
        return resultado;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void guardar(){
        Historial.guardar(this);
    }
}
