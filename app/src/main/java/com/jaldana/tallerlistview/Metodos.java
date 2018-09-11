package com.jaldana.tallerlistview;

public class Metodos {

    public static int areaCuadrado(int lado){
        return lado * lado;
    }

    public static double areaRectangulo(double base, double altura){
        double resultado = base * altura;
       // d = new Datos("Area del Rectangulo", "Base: " + base +"\n"+ "Altura: " +altura, resultado);
        d.guardar();
        return resultado;
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

    public static void guardarLista(String nombre, String nombreP, double resultado){
        Datos.setNombre(nombre);
        d.setNombreP(nombreP);
        d.setResultado(resultado);
        d.guardar();
    }
}
