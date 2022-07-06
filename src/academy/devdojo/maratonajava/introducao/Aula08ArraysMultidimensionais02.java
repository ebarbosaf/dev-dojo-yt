package academy.devdojo.maratonajava.introducao;

public class Aula08ArraysMultidimensionais02 {

    public static void main(String[] args) {

        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[4];
        arrayInt[2] = new int[6];

        for (int[] arrBase: arrayInt) {
            System.out.println("----");
            for (int num: arrBase) {
                System.out.print(num);
            }
            System.out.println();
        }

        int[][] arrayInt2 = {{0,0}, {1,2,3}, {1,2,3,4,5,6}};
        for(int[] arrBase: arrayInt2){
            System.out.println("#####");
            for (int num: arrBase) {
                System.out.print(num + ", ");
            }
            System.out.println();
        }

        for (int i = 0; i < arrayInt2.length; i++) {
            System.out.println(arrayInt2[i]);
            for (int j = 0; j < arrayInt2[i].length; j++) {
                System.out.println(arrayInt2[i][j]);
            }
        }

    }
}
