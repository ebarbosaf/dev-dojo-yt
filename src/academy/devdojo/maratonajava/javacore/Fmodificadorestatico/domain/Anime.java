package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Anime {

    private String nome;
    public static int[] episodeos;

    /*
    * 0 - Bloco de inicialização é executado quando a JVM carrega a classe
    * 1 - Alocado espaço em memória pro projeto
    * 2 - Cada atributo de classe é criado e inicializado com valores default ou o que for passado
    * 3 - Bloco de inicialização
    * 4 - Construtor é executado
    * */

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodeos = new int[100];
        for (int i = 0; i < episodeos.length ; i++) {
            episodeos[i] = i+1;
        }
    }

    static{
        System.out.println("Dentro do bloco de inicialização estática 1");
    }
    static{
        System.out.println("Dentro do bloco de inicialização estática 2");
    }
    static{
        System.out.println("Dentro do bloco de inicialização estática 3");
    }

    {
        System.out.println("Dentro do bloco de inicialização não estático");
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