import java.util.Scanner;

    //Escreva um código onde o usuário informa um número inicial, posteriormente irá informar outros N números, 
    //a execução do código irá continuar até que o número informado dividido pelo primeiro 
    //número tenha resto diferente de 0 na divisão, números menores que o primeiro número devem ser ignorados

public class ExercicioEstruturasdeControle4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número inicial: ");
        int numeroInicial = scanner.nextInt();

        //while (true) cria uma repetição que, por padrão, nunca termina sozinha, pois a condição sempre será verdadeira.
        while (true) { 
            System.out.print("Digite um número (ou um número menor que " + numeroInicial + " para encerrar): ");
            int numero = scanner.nextInt();

            if (numero < numeroInicial) {
                System.out.println("Número menor que o inicial. Encerrando o programa.");
                break;
            }

            if (numero % numeroInicial != 0) {
                System.out.println("Número " + numero + " não é divisível por " + numeroInicial + ". Encerrando o programa.");
                break;
            }

            System.out.println("Número " + numero + " é divisível por " + numeroInicial + ".");
        }

        scanner.close();
    }
    
}
