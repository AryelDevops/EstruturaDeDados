package com.br.estruturas;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Vetor {
    Scanner sc = new Scanner(System.in);
    int[] vetor = new int[] {};
    public Vetor() {
        exibirMenuLista();
    }


    private void exibirMenuLista() {
        System.out.println("-----------------------");
        System.out.println("|        Vetor        |");
        System.out.println("-----------------------");
        System.out.println("| 1 - Inserir dado    |");
        System.out.println("| 2 - Alterar dado    |");
        System.out.println("| 3 - Pesquisar dado  |");
        System.out.println("| 4 - Mostrar dados   |");
        System.out.println("| 5 - Voltar          |");
        System.out.println("-----------------------\n");
        System.out.println("Selecione a opção desejada: ");

        try {
            int opcaoSelecionada = sc.nextInt();

            if(opcaoSelecionada == 1) adicionarDadoALista();
            else if(opcaoSelecionada == 2) editarDadoNaLista();
            else if(opcaoSelecionada == 3) pesquisarDadoNaLista();
            else if(opcaoSelecionada == 4) mostrarLista();
            else if(opcaoSelecionada == 5) return;
            else {
                System.out.println("Opção inválida, tente novamente.");
                exibirMenuLista();
            }
        } catch (InputMismatchException e) {
            System.out.println("Opção inválida, tente novamente.");
            sc.next();
            exibirMenuLista();
        }
    }

    private void adicionarDadoALista() {
        System.out.println("Digite o inteiro que deseja adicionar: ");
        int[] aux = new int[vetor.length + 1];
        for (int i = 0; i < vetor.length; i++){
            aux[i] = vetor[i];
        }
        aux[aux.length - 1] = sc.nextInt();
        this.vetor = aux;
        exibirMenuLista();
    }

    private void editarDadoNaLista() {
        System.out.println("Digite o índice (iniciando em 0) do dado que deseja editar: ");
        int indice = sc.nextInt();

        if(indice > vetor.length - 1) {
            System.out.println("Índice não existente no vetor, tente novamente.");
        } else {
            System.out.println("Insira o novo valor para o índice selecionado: ");
            int novoValor = sc.nextInt();

            this.vetor[indice] = novoValor;
        }

        exibirMenuLista();
    }

    private void pesquisarDadoNaLista() {
        System.out.println("Digite o valor do dado que deseja pesquisar: ");
        int valorAPesquisar = sc.nextInt();
        List<Integer> indicesEncontrados = new ArrayList<Integer>();

        for (int i = 0; i < vetor.length; i++) {
            if (valorAPesquisar == vetor[i]) {
                indicesEncontrados.add(i);
            }
        }

        String indices = indicesEncontrados.size() > 0 ? indicesEncontrados.stream()
                .map(Object::toString)
                .collect(Collectors.joining(", ")) : "-1" ;
        System.out.println("Valor encontrado no(s) indíce(s): " + indices);

        exibirMenuLista();
    }

    private void mostrarLista() {
        for(int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + "\n");
        }

        exibirMenuLista();
    }
}
