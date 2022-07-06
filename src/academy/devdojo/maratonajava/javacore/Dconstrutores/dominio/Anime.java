package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {

    private String nome;
    private String tipo;
    private int episodeos;
    private String genero;

    private String estudio;

    public Anime(){
        System.out.println("Dentro do construtor default");
    }

    public Anime(String nome, String tipo, int episodeos, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodeos = episodeos;
        this.genero = genero;
    }

    public Anime(String nome, String tipo, int episodeos, String genero, String estudio){
        this(nome, tipo, episodeos, genero);
        this.estudio = estudio;
    }
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
        System.out.println(estudio);
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

    public void setEstudio(String estudio) {
        this.estudio = estudio;
    }

    public String getEstudio(){
        return this.estudio;
    }
}
