import java.util.Scanner;

public class Menus {
   public void menuPrincipal(){
       System.out.println(
               """
                  -------------------
                  | 1 - Vetor       |
                  | 2 - Lista       |
                  | 3 - Sair        |
                  -------------------
                  Selecione a opcao desejada:
               """
       );
   };

    public void menuVetor(){
        System.out.println(
                """
                   ----------------------
                   |       Vetor        |
                   ----------------------
                   | 1 - Inserir Dado   |
                   | 2 - Alterar dado   |
                   | 3 - Pesquisar dado |
                   | 4 - Mostrar dados  |
                   | 5 - Voltar         |
                   ----------------------
                   Selecione a opcao desejada:
                """
        );
    };

    public void menuLista(){
        System.out.println(
                """
                   ----------------------
                   |       Lista        |
                   ----------------------
                   | 1 - Inserir Dado   |
                   | 2 - Alterar dado   |
                   | 3 - Excluir Dado   |
                   | 4 - Pesquisar dado |
                   | 5 - Mostrar dados  |
                   | 6 - Voltar         |
                   ----------------------
                   Selecione a opcao desejada:
                """
        );
    };
}
