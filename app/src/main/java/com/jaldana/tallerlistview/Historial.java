package com.jaldana.tallerlistview;

import java.util.LinkedList;

public class Historial {
    private static LinkedList<Datos> lista = new LinkedList<>();

    public static void guardar(Datos d){
        lista.add(d);
    }

    public static LinkedList<Datos> mostrar(){
        return lista;
    }
}
