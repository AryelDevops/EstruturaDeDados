import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menus menus = new Menus();
        ProcessaMenuVetor processaMenuVetor = new ProcessaMenuVetor();

        Scanner scanner = new Scanner(System.in);
        int escolha = -1;

        do {
            try {
                menus.menuPrincipal();
                escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        menus.menuVetor();
                        processaMenuVetor.processarMenu();
                        break;
                    case 2:
                        menus.menuLista();
                        escolha = 0;
                        break;
                    case 3:
                        //Sair
                        System.out.println(escolha);
                        escolha = 0;
                        break;
                    default:
                        System.out.println("Opção inválida");
                        escolha = -1;
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida");
                scanner.next();
            }
        } while (escolha != 0);

        scanner.close();
    }
}
