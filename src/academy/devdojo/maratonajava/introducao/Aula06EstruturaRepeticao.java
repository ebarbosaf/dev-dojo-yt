package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao {

    public static void main(String[] args) {
        int contador = 0;
        while (contador < 10) {
            System.out.println(++contador);
        }

        int count = 0;
        do {
            System.out.println("Dentro do do-while " + ++count);
        } while (count < 10);

        for (int i = 0; i < 10; ++i) {
            System.out.println("Dentro do for " + i);
        }
    }

}

