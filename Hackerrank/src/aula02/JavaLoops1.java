package aula02;

import java.util.*;

public class JavaLoops1 {
    public static void main (String[] args) {

        Scanner num = new Scanner (System.in);
        int n1 = num.nextInt();

        for (int i = 1; i <= 10; i++) {
            int r = n1 * i;
            System.out.println (n1 + " x " + i + " = " + r);
        }

    }
}