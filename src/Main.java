import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Lê os dois valores inteiros da entrada (saldo e valor da transação)
        System.out.print("Digite seu saldo: ");
        int saldo = scanner.nextInt();
        
        System.out.print("Digite o valor da Transação: ");
        int valorTransacao = scanner.nextInt();

        // TODO: Verifique se o saldo é suficiente e imprima a mensagem apropriada

        scanner.close(); //O método scanner.close(); serve para fechar a instância do Scanner e liberar os recursos do 
                        // sistema operacional que estavam sendo utilizados para ler os dados. 
                        // Ele age como um "desligamento" da ponte de comunicação entre o seu programa e a fonte de entrada.
        
        if (saldo < valorTransacao) {
          System.out.println("Saldo insuficiente");
            
        } else { 
          System.out.println("Transacao aprovada");
        }

    }
}