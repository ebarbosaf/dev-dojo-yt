package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {

    public static void main(String[] args) {
        // byte, short, int, long, double, float -> quando não inicializados começam com 0 (zero)
        // char '\u0000' ' ' -> começa com vazio
        // boolean -> false
        // String -> null

        String[] valor = new String[3];
        System.out.println(valor[0]);
        System.out.println(valor[1]);
        System.out.println(valor[2]);
    }
}