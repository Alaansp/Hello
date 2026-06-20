import java.util.Scanner;
    //Escreva um código que o usuário entre com um primeiro número, um segundo número maior que o primeiro 
    //e escolhe entre a opção par e impar, com isso o código deve informar todos os números pares ou ímpares 
    //(de acordo com a seleção inicial) no intervalo de números informados, 
    //incluindo os números informados e em ordem decrescente;

public class ExercicioEstruturasdeControle3 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        System.out.print("Digite o segundo número (maior que o primeiro): ");
        int segundoNumero = scanner.nextInt();

        while (segundoNumero <= primeiroNumero) {
            System.out.print("O segundo número deve ser maior que o primeiro. Digite novamente: ");
            segundoNumero = scanner.nextInt();
        }

        System.out.print("Escolha entre par ou impar (digite 'par' ou 'impar'): ");
        String escolha = scanner.next();

        System.out.println("Números " + escolha + " entre " + primeiroNumero + " e " + segundoNumero + ":");
        for (int i = segundoNumero; i >= primeiroNumero; i--) {

            //O método equalsIgnoreCase serve para comparar duas palavras ignorando letras maiúsculas ou minúsculas.
            if (escolha.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.println(i);
            } else if (escolha.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}
