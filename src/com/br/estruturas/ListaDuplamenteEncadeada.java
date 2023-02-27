package com.br.estruturas;

public class ListaDuplamenteEncadeada {
    private No inicio = null;
    private No fim = null;
    private int tamanho = 0;

    public int getTamanho() {
        return tamanho;
    }

    public void adicionarDadoALista(int dado) {
        No no = new No(dado);

        if(tamanho == 0) {
            // Para o caso de lista vazia, o primeiro nó é início e fim da lista.
            this.inicio = this.fim = no;
        } else {
            // Para as adições com a lista já preenchida, o novo nó será o nó fim.
            // O antigo nó fim assume o novo nó como próximo, e o novo nó assume o antigo nó fim como anterior.
            fim.setProximo(no);
            no.setAnterior(fim);
            this.fim = no;
        }

        this.tamanho++;
    }

    public int pesquisarDado(int dado) {
        int posicao = 0;
        No noAtual = inicio;

        while(noAtual != null) {
            if(noAtual.getDado() == dado) break;
            else noAtual = noAtual.getProximo();

            posicao++;
        }

        return posicao;
    }

    public void editarDado(int indice, int valor) {
        No noSelecionado = selecionarNoPorIndice(indice);

        if(noSelecionado == null) {
            System.out.println("Índice não existente na lista, tente novamente.");
            return;
        }

        noSelecionado.setDado(valor);
    }

    public void excluirDado(int indice) {
        No noSelecionado = selecionarNoPorIndice(indice);

        if(noSelecionado == null) {
            System.out.println("Índice não existente na lista, tente novamente.");
            return;
        }

        if(noSelecionado.getProximo() == null) {
            this.fim = noSelecionado.getAnterior();
        }

        if(noSelecionado.getAnterior() == null) {
            this.inicio = noSelecionado.getProximo();
        }

        // Atribui valores do nó excluído aos nós adjacentes
        if(noSelecionado.getAnterior() != null) noSelecionado.getAnterior().setProximo(noSelecionado.getProximo());
        if(noSelecionado.getProximo() != null) noSelecionado.getProximo().setAnterior(noSelecionado.getAnterior());
    }

    public void exibirLista() {
        No noAtual = inicio;

        while(noAtual != null) {
            System.out.print("{ " + "Dado: " + noAtual.getDado() + ", Próximo: " + noAtual.getProximo() + ", Anterior: " + noAtual.getAnterior() + " }" + "\n");
            noAtual = noAtual.getProximo();
        }
    }

    private No selecionarNoPorIndice(int indice) {
        No noSelecionado = inicio;
        for (int i = 0; i < indice; i++) {
            noSelecionado = noSelecionado != null ? noSelecionado.getProximo() : null;
        }

        return noSelecionado;
    }
}
