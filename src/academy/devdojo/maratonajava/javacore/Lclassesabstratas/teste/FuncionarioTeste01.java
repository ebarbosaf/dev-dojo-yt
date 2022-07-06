package academy.devdojo.maratonajava.javacore.Lclassesabstratas.teste;

import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTeste01 {
    public static void main(String[] args) {
        Gerente ger = new Gerente("Anton", 7842);
        Desenvolvedor dev = new Desenvolvedor("Correndo atrás", 4500);
        System.out.println(ger);
        System.out.println(dev);
        ger.imprime();
        dev.imprime();
    }
}
