package academy.devdojo.maratonajava.javacore.Isobrescrita.dominio;

public class Anime extends Object{

    private String nome;

    public Anime(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
