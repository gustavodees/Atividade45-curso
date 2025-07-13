package principal;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantos numeros você deseja digitar? ");
        int n = input.nextInt();
        double[] vect = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            vect[i] = input.nextDouble();

        }
        double npares = 0, soma = 0.0, media = 0.0;

        for (int i = 0; i < n; i++) {
            if (vect[i] % 2 == 0) {
                soma += vect[i];
                npares++;
            }
        }
        if (npares == 0) {
            System.out.println("Nenhum número par!");
        } else {
            media = soma / npares;
            System.out.println("Media dos pares " + media);
        }

    }
}