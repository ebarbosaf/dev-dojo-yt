package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Calculadora;

public class CalculadoraTeste02 {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int a = 1;
        int b = 2;

        calc.alteraDoisNumero(a, b);

        System.out.println("a " + a);
        System.out.println("b " + b);
    }
}
