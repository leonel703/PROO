import java.util.*;

public class EstatisticasArray {
    public static void main (String [] agrs) {

        int[] num = new int[5];

        Scanner tec = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            num[i] = tec.nextInt();
        }

        int soma = 0;
        int media = 0;

        for (int i = 0; i < 5; i++) {
            soma = num[i] + soma;
        }

        media = soma / 5;

        int maior = num[0];

        for (int i = 0; i < 5; i++) {
            if (num[i] > maior) {
                maior = num[i];
            }
        }

        System.out.println (soma);
        System.out.println (media);
        System.out.println (maior);

    }
}
