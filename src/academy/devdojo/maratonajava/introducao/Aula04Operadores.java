package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {

    public static void main(String[] args) {
        // + - * /
        int a = 10;
        int b = 20;
        /*
         fazer cast de double para que o resultado não seja 0 (zero)
         numeros inteiros só retornam inteiros
         */
        double resultado = a / (double) b; // fazer cast de double para que o resultado não seja 0 (zero)
        System.out.println(a + b + " Valor " + a + b + " ou " + resultado);

        // % resto
        int resto = 20 % 2;
        System.out.println(resto);

        // < > (menor/maior) <=(menor ou igual) >= (maior ou igual) == (igual) != (diferente)
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte " + isDezMenorQueVinte);
        System.out.println("isDezIgualVinte " + isDezIgualVinte);
        System.out.println("isDezDiferenteVinte " + isDezDiferenteVinte);

        // && (AND) || (OR)
        int idade = 29;
        float salario = 3500f;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorDoPlaystationCinco = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorDoPlaystationCinco || valorTotalContaPoupanca >= valorDoPlaystationCinco;

        System.out.println("isPlaystationCincoCompravel " + isPlaystationCincoCompravel);

        // Operadores de atribuicao (=, +=, -=, *=, /=, %=)
        int bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0

        System.out.println("bonus " + bonus);

        // ++ (incremento) -- (decremento)

        int contador = 0;
        contador++;
        contador--;
        ++contador;
        --contador;
        /*
         * Quando o operador está depois da variável o que tiver que ser executado com a variável será executado antes de receber a atribuição
         * Quando o operador estiver antes da variável a atribuição ocorrerá antes da execução da variável
         */
        System.out.println("contador recebendo incremento antes de imprimir "+ ++contador); // contador está 0 e antes de imprimir será atribuído 1;
        System.out.println("contador imprimindo antes do decremento "+ contador--); // continuará imprimindo 1, só após a impressão é que o contador será decrementado
        System.out.println("impressão final do contador "+ contador); // imprimirá 0
    }
}
