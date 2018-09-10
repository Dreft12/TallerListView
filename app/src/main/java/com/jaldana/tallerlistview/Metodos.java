package com.jaldana.tallerlistview;

public class Metodos {

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
        return 3.141592 * (radio*radio);
    }
}
