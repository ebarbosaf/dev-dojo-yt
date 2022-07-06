package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class CarregaDadosBanco implements CarregaDados, RemoveDado{

    @Override
    public void carrega() {
        System.out.println("Lendo dados do banco de dados");
    }

    @Override
    public void remove(){
        System.out.println("Removendo dados do banco de dados");
    }

    public void checaPermissao(){
        System.out.println("Fazendo checagem de permisão no banco de dados");
    }

    public static void recuperaTamanhoMaximoDado(){
        System.out.println("Dentro do metodo recuperaTamanhoMaximoDado na Interface");
    }
}
