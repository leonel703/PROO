package aula02;
import java.util.Scanner;

public class JavaEOF {
    public static void main(String[] args) {
        String[] fr = new String[3];
        Scanner frases = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            fr[i] = frases.nextLine();
        }

        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + " " + fr[i]);
        }
    }
}