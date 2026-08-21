package aula02;

import java.util.Scanner;

public class JavaDatatypes {
    public static void main (String[] args) {

        Scanner qtd = new Scanner(System.in);
        int q = qtd.nextInt();

        int[] numeros = new int[q];

        for (int i = 0; i < q; i++) {
            numeros[i] = qtd.nextInt();
        }

        for (int i = 0; i < q; i++) {
            try {
                System.out.println (numeros[i] + " can be fitted in:");
                //
            } catch (Exception e) {
                System.out.println ("This number cannot be fitted in anywhere");
            }
        }

    }
}