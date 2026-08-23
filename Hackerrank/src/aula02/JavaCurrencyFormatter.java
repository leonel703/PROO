package aula02;

import java.text.*;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {
    public static void main (String[] args) {

        Scanner moeda = new Scanner (System.in);
        double valor = moeda.nextDouble();

        NumberFormat eua = NumberFormat.getCurrencyInstance(Locale.US);
        String us = eua.format(valor);

        NumberFormat eur = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String fra = eur.format(valor);

        NumberFormat chin = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String ch = chin.format(valor);

        Locale indiaLocale = new Locale("en", "IN");
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(indiaLocale);

        DecimalFormat india = new DecimalFormat("##,##,##0.00", symbols);
        String ind = "Rs." + india.format(valor);

        System.out.println ("US: " + us);
        System.out.println ("India: " + ind);
        System.out.println ("China: " + ch);
        System.out.println ("France: " + fra);
    }
}