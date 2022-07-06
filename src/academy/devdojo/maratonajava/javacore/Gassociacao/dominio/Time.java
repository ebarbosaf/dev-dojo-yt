package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

import java.util.Arrays;

public class Time {

    private String nomeTime;

    private Jogador[] jogares;

    public Time(String nome) {
        this.nomeTime = nome;
    }

    public Time(String nomeTime, Jogador[] jogares) {
        this.nomeTime = nomeTime;
        this.jogares = jogares;
    }

    public void imprime(){
        System.out.println("--------------");
        System.out.println(this.getNomeTime());
        if(this.jogares == null) return;
        for(Jogador jogador: this.jogares){
            if (jogador.getTime() == null) return;
            System.out.println(jogador.getNome());
        }
    }
    public String getNomeTime() {
        return nomeTime;
    }

    public void setNomeTime(String nome) {
        this.nomeTime = nome;
    }

    public Jogador[] getJogares() {
        return jogares;
    }

    public void setJogares(Jogador[] jogares) {
        this.jogares = jogares;
    }
}
