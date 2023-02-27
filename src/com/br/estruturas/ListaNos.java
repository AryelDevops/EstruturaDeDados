package com.br.estruturas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ListaNos {
    Scanner sc = new Scanner(System.in);
    ListaDuplamenteEncadeada lista = new ListaDuplamenteEncadeada();

    public ListaNos() {
        exibirMenuListaNos();
    }


    private void exibirMenuListaNos() {
        System.out.println("-----------------------");
        System.out.println("|        Lista        |");
        System.out.println("-----------------------");
        System.out.println("| 1 - Inserir dado    |");
        System.out.println("| 2 - Alterar dado    |");
        System.out.println("| 3 - Excluir dado    |");
        System.out.println("| 4 - Pesquisar dado  |");
        System.out.println("| 5 - Mostrar dados   |");
        System.out.println("| 6 - Voltar          |");
        System.out.println("-----------------------\n");
        System.out.println("Selecione a opção desejada: ");

        try {
            int opcaoSelecionada = sc.nextInt();

            if(opcaoSelecionada == 1) adicionarDadoALista();
            else if(opcaoSelecionada == 2) editarDadoNaLista();
            else if(opcaoSelecionada == 3) excluirDado();
            else if(opcaoSelecionada == 4) pesquisarDadoNaLista();
            else if(opcaoSelecionada == 5) mostrarLista();
            else if(opcaoSelecionada == 6) return;
            else {
                System.out.println("Opção inválida, tente novamente.");
                exibirMenuListaNos();
            }
        } catch (InputMismatchException e) {
            System.out.println("Opção inválida, tente novamente.");
            sc.next();
            exibirMenuListaNos();
        }

    }

    private void adicionarDadoALista() {
        System.out.println("Digite o inteiro que deseja adicionar: ");
        lista.adicionarDadoALista(sc.nextInt());
        exibirMenuListaNos();
    }

    private void editarDadoNaLista() {
        System.out.println("Digite o índice (iniciando em 0) do dado que deseja editar: ");
        int indice = sc.nextInt();
        System.out.println("Insira o novo valor para o índice selecionado: ");
        int valor = sc.nextInt();

        lista.editarDado(indice, valor);

        exibirMenuListaNos();
    }

    private void excluirDado() {
        System.out.println("Digite o índice (iniciando em 0) do dado que deseja remover: ");
        int indice = sc.nextInt();

        lista.excluirDado(indice);

        exibirMenuListaNos();
    }

    private void pesquisarDadoNaLista() {
        System.out.println("Digite o valor do dado que deseja pesquisar: ");
        int posicaoEncontrada = lista.pesquisarDado(sc.nextInt());

        System.out.println("Valor no índice: " + posicaoEncontrada);
        exibirMenuListaNos();
    }

    private void mostrarLista() {
        lista.exibirLista();
        System.out.println("Tamanho da lista: " + lista.getTamanho());
        exibirMenuListaNos();
    }
}
