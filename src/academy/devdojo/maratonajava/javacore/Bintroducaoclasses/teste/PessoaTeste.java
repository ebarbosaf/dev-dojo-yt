package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Pessoa;

public class PessoaTeste {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Jão");
        pessoa.setIdade(13);
        System.out.println(pessoa);
    }
}
