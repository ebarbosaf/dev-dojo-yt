package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Jogador {

    private String nome;

    private Time time;

    public Jogador(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime(){
        System.out.println("-------------");
        System.out.println(this.nome);
        if (this.time != null) System.out.println(this.time.getNomeTime());
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
