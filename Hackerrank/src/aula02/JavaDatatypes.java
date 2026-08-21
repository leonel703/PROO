package aula02;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaDatatypes {
    public static void main (String[] args) {

        Scanner qtd = new Scanner(System.in);
        int q = Integer.parseInt(qtd.nextLine().trim());
        String[] numeros = new String[q];

        for (int i = 0; i < q; i++) {
            numeros[i] = qtd.nextLine().trim();
        }

        for (int i = 0; i < q; i++) {
                BigInteger n = new BigInteger(numeros[i]);
                System.out.println(numeros[i] + " can be fitted in:");
                if (n.compareTo(BigInteger.valueOf(-128)) >= 0 && n.compareTo(BigInteger.valueOf(127)) <= 0) {
                    System.out.println("* byte");
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (n.compareTo(BigInteger.valueOf(-32768)) >= 0 && n.compareTo(BigInteger.valueOf(32767)) <= 0) {
                    System.out.println("* short");
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (n.compareTo(BigInteger.valueOf(-2147483648L)) >= 0 && n.compareTo(BigInteger.valueOf(2147483647L)) <= 0) {
                    System.out.println("* int");
                    System.out.println("* long");
                } else if (n.compareTo(BigInteger.valueOf(Long.MIN_VALUE)) >= 0 && n.compareTo(BigInteger.valueOf(Long.MAX_VALUE)) <= 0) {
                    System.out.println("* long");
                } else {
                    System.out.println(numeros[i] + " can't be fitted anywhere.");
                }
        }

    }
}