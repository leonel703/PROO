package app;

import java.util.*;

public class App {
    public static void main (String[] args) {

        Jogador jogador1 = new Jogador();

        jogador1.nome = "zoro";

        ArrayList <Jogador> timeA = new ArrayList<>();
        timeA.add(jogador1);
        timeA.add(new Jogador());

        System.out.println (jogador1.nome);

    }
}
