package aula02;

import java.util.Scanner;;

public class JavaIfElse {
    public static void main (String[] args) {

        Scanner num  = new Scanner(System.in);
        int n1 = num.nextInt();

        if (n1 % 2 != 0) {
            System.out.print ("Weird");
        } else if (n1 % 2 == 0 && n1 >= 2 && n1 <= 5) {
            System.out.print ("Not Weird");
        } else if (n1 % 2 == 0 && n1 >= 6 && n1 <= 20) {
            System.out.print ("Weird");
        } else if (n1 % 2 == 0 && n1 > 20) {
            System.out.print ("Not Weird");
        }

    }
}
