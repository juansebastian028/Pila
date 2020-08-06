package com.company;

public class Main {

    public static void main(String[] args) {
        Pila p1 = new Pila();
        p1.apilar(11);
        p1.apilar(22);
        p1.apilar(50);
        p1.apilar(12);
        p1.apilar(44);
        p1.despilar();
        p1.mostrarPila();
    }
}
