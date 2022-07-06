package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Calculadora;

public class TesteCalculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        calc.somarDoisNumeros();
        System.out.println("Fim do método somarDoisNumeros");
        calc.subtrairDoisNumeros();
        System.out.println("Fim do método subtrairDoisNumeros");
        calc.multiplicaDoisNumeros(2, 3);
        System.out.println("Fim do método multiplicaDoisNumeros");
        int resultado = (int) calc.divideDoisNumeros(20,2);
        System.out.println(resultado);
        System.out.println(calc.divideDoisNumeros02(20,0));
        System.out.println("----------------");
        calc.imprimeDivisaoDeDoisNumeros(3,0);
    }
}
