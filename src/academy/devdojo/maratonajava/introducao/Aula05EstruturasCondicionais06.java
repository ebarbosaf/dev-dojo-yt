package academy.devdojo.maratonajava.introducao;

import java.util.Scanner;

public class Aula05EstruturasCondicionais06 {

    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 à 7, imprima se eh dia util ou final de semana
        // Considerando 1 como Domingo
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número de 1 à 7: ");
        byte dia = Byte.parseByte(entrada.nextLine());

        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção informada não é válida");

        }

        entrada.close();
    }
}
