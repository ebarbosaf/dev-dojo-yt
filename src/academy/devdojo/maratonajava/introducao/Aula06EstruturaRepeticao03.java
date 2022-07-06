package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao03 {

    public static void main(String[] args) {
        // Dado o valor de um carro descubra quantas vezes ele poderá ser parcelado
        // Condição valorParcela >= 1000
        double valorCarro = 50344.00;
        for (int i = 1; i < valorCarro; i++) {
            double valorParcela = valorCarro / i;
            if (valorParcela >= 1000){
                System.out.printf("Parcela %d valor da parcela %.2f %n ", i, valorParcela);
            } else {
                break;
            }
        }
        // ### OUTRA FORMA ###

        double valorTotal = 50344;
        for (int j = 1; j < valorTotal; j++) {
            double totalParcela = valorTotal / j;
            if (totalParcela < 1000) break;
            System.out.printf("Parcela %d valor da parcela %.2f %n ", j, totalParcela);
        }

    }
}
