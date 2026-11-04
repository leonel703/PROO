package aula02;

import java.util.*;
import java.time.*;

public class JavaDateAndTime {
    public static void main (String[] args) {

        Scanner tec = new Scanner (System.in);
        String data = tec.nextLine();

        String[] partes = data.split (" ");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]);
        int ano = Integer.parseInt(partes[2]);

        LocalDate date = LocalDate.of(ano, mes, dia);
        System.out.println (date.getDayOfWeek());

    }
}