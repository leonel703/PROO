package aula02;

import java.util.Scanner;

public class StdinStdout1 {
    public static void main (String[] args) {
        Scanner n1 = new Scanner (System.in);
        int a = n1.nextInt();
        int b = n1.nextInt();
        int c = n1.nextInt();

        System.out.println (a);
        System.out.println (b);
        System.out.println (c);
    }
}
