package com.company;

public class Pila {
    private Nodo ultimoValorIgresado;
    private int tamano;

    public Pila() {
        ultimoValorIgresado = null;
        tamano = 0;
    }

    public boolean estaVacia() {
        if (ultimoValorIgresado == null) {
            return true;
        } else {
            return false;
        }
    }

    //Insetar nodo a la pila(Apilar)
    /* 2 <- nuevo
       3 <- ultimo ingresado
    */
    /* 2<-ultimo ingresado
       3
    */
    public void apilar(int valor) {
        Nodo nuevo = new Nodo(valor);
        nuevo.setSiguiente(ultimoValorIgresado);
        ultimoValorIgresado = nuevo;
        tamano++;
    }

    //Elimina el ultimo nodo introducido en la pila
    public void despilar() {
        if (tamano > 0) {
            ultimoValorIgresado = ultimoValorIgresado.getSiguiente();
            tamano--;
        }
    }

    //Obtener el elemento en la cima de la pila
    public int cima() {
        return ultimoValorIgresado.getValor();
    }

    //Muestra el tamaño actual de la pila
    public int getTamano() {
        return tamano;
    }

    //Muestra la pila
    public void mostrarPila() {
        Nodo recorrido = ultimoValorIgresado;
        String pilaString = "";
        while (recorrido != null) {
            pilaString += recorrido.getValor() + "\n";
            recorrido = recorrido.getSiguiente();
        }
        System.out.println(pilaString);
    }
}
