import java.util.*;

public class Inverte {
    public static void main (String[] args) {

        int[] array = new int[5];

        Scanner entrada = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            array[i] = entrada.nextInt();
        }

        for (int i = 4; i >= 0; i--) {
            System.out.print (array[i] + " ");
        }

    }
}