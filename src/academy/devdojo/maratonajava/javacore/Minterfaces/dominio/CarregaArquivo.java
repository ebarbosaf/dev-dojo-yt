package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class CarregaArquivo implements CarregaDados, RemoveDado{

    public void carrega(){
        System.out.println("Lendo dados de uma arquivo");
    }

    public void remove(){
        System.out.println("Removendo dados do arquivo");
    }
}
