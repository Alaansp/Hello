import java.util.Scanner;

public class Exercicio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê a linha de entrada e separa em nome e tipo de conta
        String input = scanner.nextLine();
        String[] partes = input.split(" ");

        String nome = partes[0];
        String tipoConta = partes[1];

        // TODO: Verifique se o tipo de conta é válido ("corrente", "poupanca" ou "investimento")
        // e imprima a mensagem de saudação personalizada ou a mensagem de erro conforme o caso.

        scanner.close();

        if (tipoConta.equals("corrente") || tipoConta.equals("poupanca") || tipoConta.equals("investimento")) {
            System.out.println("Bem-vindo(a), " + nome + "! Sua conta " + tipoConta + " esta pronta para uso.");
        } else {
            System.out.println("Tipo de conta invalido.");
        }
    }
}