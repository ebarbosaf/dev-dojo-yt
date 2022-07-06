package academy.devdojo.maratonajava.introducao;

import java.awt.font.FontRenderContext;

public class Aula08ArraysMultidimensionais01 {

    public static void main(String[] args) {

        int [][] dias = new int[3][3];

        dias[0][0] = 01;
        dias[0][1] = 02;
        dias[0][2] = 03;

        dias[1][0] = 11;
        dias[1][1] = 12;
        dias[1][2] = 13;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j]);
            }
        }

        System.out.println("Array multidimensional com for each");
        for (int[] arrBase: dias) {
            for (int num: arrBase) {
                System.out.println(num);
            }
        }
    }
}
