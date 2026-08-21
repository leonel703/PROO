package aula02;

import java.util.Scanner;

public class StdinStdout2 {
    public static void main (String[] args) {
        Scanner entradas = new Scanner (System.in);
        int a = entradas.nextInt();
        double b = entradas.nextDouble();
        entradas.nextLine();
        String c = entradas.nextLine();

        System.out.println ("String: " + c);
        System.out.println ("Double: " + b);
        System.out.println ("Int: " + a);
    }
}