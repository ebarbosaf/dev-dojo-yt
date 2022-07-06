package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTeste01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua das candangas");
        endereco.setCep("52146-487");

        Pessoa pessoa = new Pessoa("Margarida");
        pessoa.setCpf("489.789.147-25");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario("Olimpus");
        funcionario.setCpf("123.123.123-45");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(2345.23);

        pessoa.imprime();
        funcionario.imprime();

    }

}
