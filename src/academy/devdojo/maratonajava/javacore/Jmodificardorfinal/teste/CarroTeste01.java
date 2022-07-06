package academy.devdojo.maratonajava.javacore.Jmodificardorfinal.teste;

import academy.devdojo.maratonajava.javacore.Jmodificardorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificardorfinal.dominio.Ferrari;

public class CarroTeste01 {

    public static void main(String[] args) {

        Carro carro = new Carro();
        // Acessando uma constante não estática, só é possivel pela instância de referência
        // System.out.println(carro.VELOCIDADE_LIMITE);

        // Acessando uma constante estática, só é possivel pela própria Classe
        System.out.println(Carro.VELOCIDADE_LIMITE);

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Nome do comprador");
        System.out.println(carro.COMPRADOR.getNome());

        Ferrari ferrari = new Ferrari();
        ferrari.setNome("Kakaroto");
        System.out.println(ferrari.imprime());

    }



}
