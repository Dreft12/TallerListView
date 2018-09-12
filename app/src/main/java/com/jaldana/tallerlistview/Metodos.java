package com.jaldana.tallerlistview;

public class Metodos {
    private static Datos d;
    public static int areaCuadrado(int lado){
        return lado * lado;
    }

    public static double areaRectangulo(double base, double altura){
        return base * altura;
    }

    public static double areaTriangulo(double base, double altura){
        return (base * altura) / 2;
    }

    public static double areaCirculo(double radio) {
        return 3.141592 * Math.pow(radio,2);
    }

    public static double volEsfera(double radio){
        return (4 * 3.141592 * Math.pow(radio,3)) / 3;
    }

    public static double volCilindro(double radio, double altura){
        return 3.141592 * Math.pow(radio,2) * altura;
    }

    public static double volCono(double radio, double altura){
        return (1 * 3.141592 * Math.pow(radio, 2) * altura) / 3;
    }

    public static double volCubo(double longitud){
        return Math.pow(longitud,3);
    }

    public static void guardarHistorialLista(String nombre, String nombreP, double resultado){
        d = new Datos(nombre, nombreP, resultado);
        d.guardar();
    }
}
