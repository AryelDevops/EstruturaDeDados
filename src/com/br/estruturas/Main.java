package com.br.estruturas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        exibirMenuPrincipal(sc);
    }

    private static void exibirMenuPrincipal(Scanner sc){
        int opcaoSelecionada = 0;
        while (opcaoSelecionada != 3) {
            System.out.println("-------------");
            System.out.println("| 1 - Vetor |");
            System.out.println("| 2 - Lista |");
            System.out.println("| 3 - Sair |");
            System.out.println("-------------\n");
            System.out.println("Selecione a opção desejada: ");

            try {
                opcaoSelecionada = sc.nextInt();

                if (opcaoSelecionada == 3) {
                    sc.close();
                    break;
                }
                if (opcaoSelecionada == 1) new Vetor();
                else new ListaNos();
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida, tente novamente.");
                sc.next();
                exibirMenuPrincipal(sc);
            }
        }
    }
}
