package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio;

public class Anime {

    private String nome;
    private int[] episodeos;

    /*
    * 1 - Alocado espaço em memória pro projeto
    * 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    * 3 - Bloco de inicialização
    * 4 - Construtor é executado
    * */

    {
        System.out.println("Dentro do bloco de inicialização");
        episodeos = new int[100];
        for (int i = 0; i < episodeos.length ; i++) {
            episodeos[i] = i+1;
        }
    }

    public Anime() {
        for(int episodeo: episodeos){
            System.out.print(episodeo + " ");
        }
        System.out.println();
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodeos() {
        return episodeos;
    }

    public void setEpisodeos(int[] episodeos) {
        this.episodeos = episodeos;
    }
}