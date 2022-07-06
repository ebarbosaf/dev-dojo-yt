package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio;

public class Estudante {

    public String nome;
    public int idade;
    public char sexo;

    public Estudante(String nome, int idade, char sexo){
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void imprime() {
        System.out.println("---------------------------");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
