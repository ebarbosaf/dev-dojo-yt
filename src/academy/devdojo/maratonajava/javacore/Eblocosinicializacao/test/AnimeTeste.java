package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.test;


import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime = new Anime();

        for (int episodio: anime.getEpisodeos()){
            System.out.print(episodio + " ");
        }


    }
}
