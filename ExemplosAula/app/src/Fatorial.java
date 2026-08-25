import java.math.*;
import java.util.*;

public class Fatorial {

    public static Integer fatorial (Integer n) {

        Integer fat = 1;

        for (int i = 1; i <= n; i++) {
            fat = fat * i;
        }

        return fat;
    }

    public static BigInteger bigfatorial (Integer n){

        BigInteger fat = BigInteger.ONE;

        for (Integer i = 1; i <= n; i++) {
            fat = fat.multiply(BigInteger.valueOf(i));
        }

        return fat;
    }

    public static void main (String[] args) {

        Scanner num = new Scanner (System.in);
        Integer n1 = num.nextInt();

        //Integer res = fatorial(n1);
        BigInteger res = bigfatorial(n1);

        System.out.print (res);
    }
}