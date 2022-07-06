package academy.devdojo.maratonajava.javacore.Csobrecargametodos.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int episodeos;
    private String genero;

    public void init(String nome, String tipo, int episodeos){
        this.nome = nome;
        this.tipo = tipo;
        this.episodeos = episodeos;
    }

    public void init(String nome, String tipo, int episodeos, String genero){
        this.init(nome, tipo, episodeos);
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(nome);
        System.out.println(tipo);
        System.out.println(episodeos);
        System.out.println(genero);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getEpisodeos() {
        return episodeos;
    }

    public void setEpisodeos(int episodeos) {
        this.episodeos = episodeos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
