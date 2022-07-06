package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao01 {

    public static void main(String[] args) {
        //Imprima todos os numeros pares de 0 à 1000000
        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) System.out.printf("Numeros pares de 0 à 1000000 %d %n", +i);
        }
    }
}
