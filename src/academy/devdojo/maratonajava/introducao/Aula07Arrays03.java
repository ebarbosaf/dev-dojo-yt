package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {

    public static void main(String[] args) {
        // byte, short, int, long, double, float -> quando não inicializados começam com 0 (zero)
        // char '\u0000' ' ' -> começa com vazio
        // boolean -> false
        // String -> null

        String[] nome = new String[3];
        nome[0] = "Nome 1";
        nome[1] = "Nome 2";
        nome[2] = "Nome 3";

        for (int i = 0; i < nome.length; i++) {
            System.out.println("Nome: " + nome[i]);
        }

    }
}
