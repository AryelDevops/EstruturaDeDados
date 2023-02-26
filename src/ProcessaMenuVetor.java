import java.sql.Time;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Timer;

public class ProcessaMenuVetor {
    Menus menus = new Menus();
    int[] vetor = new int[5];
    public void inserirDado(){
        vetor[0] = 10;
    };
    public void alterarDado(){
        vetor[0] = 20;
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento " + i + ": " + vetor[i]);
        }
    };

    public void pesquisarDado(int valorProcurado){

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valorProcurado) {
                System.out.println("Valor encontrado na posição " + i);
                break;
            } else {
                System.out.println("valor não foi encontrado!");
                break;
            }
        }
    };

    public void mostrarDado(){
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("Elemento " + i + ": " + vetor[i]);
        }
    };

    public void processarMenu() {
        Scanner scanner = new Scanner(System.in);
        int escolha = -1;

        do {
            try {
                escolha = scanner.nextInt();

                switch (escolha) {
                    case 1:
                        inserirDado();
                        menus.menuVetor();
                        break;
                    case 2:
                        alterarDado();
                        menus.menuVetor();
                        break;
                    case 3:
                        try {
                            int Numero = scanner.nextInt();
                            pesquisarDado(Numero);
                        } catch (InputMismatchException e) {
                            System.out.println("opção inválida!");
                            scanner.next();
                        }
                        menus.menuVetor();
                        break;
                    case 4:
                        mostrarDado();
                        menus.menuVetor();
                        break;
                    case 5:
                        //voltar
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
    }
}
