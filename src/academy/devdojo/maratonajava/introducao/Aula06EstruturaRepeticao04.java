package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturaRepeticao04 {

    public static void main(String[] args) {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000){
                continue;
            }
            System.out.printf("Número da parcela %d e valor R$ %.2f %n", parcela, valorParcela);
        }
    }
}
