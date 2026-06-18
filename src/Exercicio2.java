import java.util.Scanner;

public class Exercicio2 {
    //Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela
    //fórmula: área=lado X lado

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tamanho do lado do quadrado:");
        double lado = scanner.nextDouble();

        double area = lado * lado;

        System.out.println("A área do quadrado é: " + area);

        scanner.close();
    }
}