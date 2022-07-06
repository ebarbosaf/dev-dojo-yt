package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais04 {

    public static void main(String[] args) {
        // $ 0 -> 34712 = 9,70%
        // $ 34713 -> 68507 = 37,35%
        // $ 68508 = 49,50%

        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.35 / 100;

        if (salarioAnual <= 34712) {
            salarioAnual *= primeiraFaixa;
        } else if (salarioAnual >=34713 && salarioAnual <= 68507) {
            salarioAnual *= segundaFaixa;
        } else {
            salarioAnual *= terceiraFaixa;
        }
        System.out.println(salarioAnual);
    }
}
