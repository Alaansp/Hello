import java.util.Scanner;

public class Exercicio4 {
    //Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = scanner.nextLine();

        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = scanner.nextInt();

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = scanner.next();
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = scanner.nextInt();

        int diferenca = Math.abs(idade1 - idade2); //O método Math.abs em Java é usado para retornar o valor absoluto 
        //..(ou seja, a versão estritamente positiva) de um número. Ele é um método estático embutido na classe Math
        //...(pacote java.lang) e não precisa de importação para ser utilizado.

        System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é: " + diferenca + " anos.");

        scanner.close();
    }

}
