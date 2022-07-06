package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Calculadora;

public class CalculadoraTeste03 {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        int [] arrayNum = {1, 2, 3, 4, 5};
        calculadora.somaArray(arrayNum);
        calculadora.somaVarArgs(1, 2, 3, 4, 5, 6, 7);
    }
}
