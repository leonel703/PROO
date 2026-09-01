package aula02;

import java.util.*;

public class ProblemaJosephus {
    public static void main(String[] args) {

        int n;
        int k;
        int m;

        Scanner tec = new Scanner(System.in);
        n = tec.nextInt();
        k = tec.nextInt();

        int[] grupo = new int[n];

        for (int i = 0; i < n; i++) {
            grupo[i] = i + 1;
        }

        int j;
        j = n;

        while (j > 1) {
            for (int i = 0; i < n; i++) {
                if (grupo[i] == 0) {

                } else {

                    j--;
                    grupo[i] = 0;
                }

            }
        }

        for (int i = 0; i < n; i++) {
            System.out.println (grupo[i]);
        }
    }

}
