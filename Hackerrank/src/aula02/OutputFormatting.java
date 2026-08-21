package aula02;

import java.util.Scanner;

public class OutputFormatting {
    public static void main (String[] args) {
        Scanner entradas = new Scanner(System.in);
        StringBuilder saida = new StringBuilder();
        saida.append(String.format("================================%n"));
        for (int i = 0; i < 3; i++) {
            String palavra = entradas.next();
            int numero = entradas.nextInt();
            saida.append (String.format("%-15s%03d%n", palavra, numero));
        }
        saida.append("================================");

        System.out.println (saida);
    }
}
