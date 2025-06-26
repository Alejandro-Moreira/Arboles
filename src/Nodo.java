public class Nodo {
    private Computador computador;
    private Nodo izquierdo;
    private Nodo derecho;


    public Nodo(Computador computador) {
        this.computador = computador;
        izquierdo=null;
        derecho=null;
    }

    public Nodo(Computador computador, Nodo izquierdo, Nodo derecho) {
        this.computador = computador;
        this.izquierdo = izquierdo;
        this.derecho = derecho;
    }

    public Computador getComputador() {
        return computador;
    }

    public void setComputador(Computador computador) {
        this.computador = computador;
    }

    public Nodo getIzquierdo() {
        return izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }
}