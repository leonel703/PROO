package aula02;

import java.util.*;
import java.math.*;

public class CacheInteger {
    public static void main (String[] args) {

        Integer n1 = 121;
        Integer n2 = 121;
        System.out.println ("Par dentro da faixa (== ): " + (n1 == n2));
        System.out.println ("Par dentro da faixa (.equals()): " + n1.equals(n2));

        Integer n3 = 300;
        Integer n4 = 300;
        System.out.println ("Par fora da faixa (== )" + (n3 == n4));
        System.out.println ("Par fora da faixa (.equals())" + n3.equals(n4));

    }
}