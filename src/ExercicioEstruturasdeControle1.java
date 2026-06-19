public class ExercicioEstruturasdeControle1 {
    //Escreva um código onde o usuário entra com um número e seja gerada a tabuada de 1 até 10 desse número;

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("Digite um número para gerar a tabuada: ");
        int numero = scanner.nextInt();

        System.out.println("Tabuada de " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
    }
    
}
