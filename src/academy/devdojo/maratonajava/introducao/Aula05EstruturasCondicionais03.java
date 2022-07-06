package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais03 {

    public static void main(String[] args) {
        // se salário > 5000 fazer doação de 500
        double salario = 6000;
        String mensagemDoacao = "Vou doar 500";
        String mensagemSemDoacao = "Não vou poder doar por enquanto, mas um dia terei";
        String resultado = salario > 5000 ? mensagemDoacao : mensagemSemDoacao;

        System.out.println(resultado);
    }
}
