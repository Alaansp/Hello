import java.util.Scanner;

//Escreva um código que receba o nome e o ano de nascimento de alguém 
// e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"

public class Exercicio1 {  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite seu ano de nascimento:");
        int anoNascimento = scanner.nextInt();

        int anoAtual = java.time.Year.now().getValue();
        int idade = anoAtual - anoNascimento;

        System.out.println("Olá " + nome + ", você tem " + idade + " anos.");

        scanner.close();
    }
    
}
