package com.br.estruturas;

public class No {
    int dado;
    No anterior = null;
    No proximo = null;

    public No(int dado) {
        this.dado = dado;
        this.anterior = null;
        this.proximo = null;
    }

    public No(int dado, No proximo, No anterior) {
        this.dado = dado;
        this.anterior = anterior;
        this.proximo = proximo;
    }

    public void setAnterior(No anterior) {
        this.anterior = anterior;
    }

    public No getAnterior() {
        return anterior;
    }

    public void setProximo(No proximo) {
        this.proximo = proximo;
    }

    public No getProximo() {
        return proximo;
    }

    public void setDado(int valor){
        this.dado = valor;
    }

    public int getDado() {
        return dado;
    }

    @Override
    public String toString() {
        return "No{" +
                "dado=" + dado +
                '}';
    }
}
