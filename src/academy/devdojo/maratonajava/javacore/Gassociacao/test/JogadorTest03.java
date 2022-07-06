package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Rambo");
        Jogador jogador2 = new Jogador("Eliseu");
        Jogador jogador3 = new Jogador("Frajola");
        Time time = new Time("Paisandu");
        Jogador[] jogadores = {jogador1, jogador2, jogador3};
        jogador1.setTime(time);
        jogador2.setTime(time);
        time.setJogares(jogadores);

        System.out.println("--- Jogador ---");
        for(Jogador jogador: jogadores) jogador.imprime();

        System.out.println("--- Time ---");
        time.imprime();
    }



}
