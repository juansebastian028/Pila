package com.company;

public class Nodo {
    private int valor;
    private Nodo siguiente;

    Nodo(int valor) {
        this.valor = valor;
        this.siguiente = null;
    }

    public int getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
