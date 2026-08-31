package aula02;

import java.util.*;

public class Java1DArray {
    public static void main (String[] args) {

        Scanner val = new Scanner (System.in);
        int n = val.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = val.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println (arr[i]);
        }

    }
}