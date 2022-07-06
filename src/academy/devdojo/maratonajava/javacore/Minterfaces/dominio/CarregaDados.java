package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface CarregaDados {

    public static final int MAX_SIZE_DATA = 10;

    public abstract void carrega();

    public default void checaPermissao(){
        System.out.println("Fazendo checagem de permissões");
    }

    public static void recuperaTamanhoMaximoDado(){
        System.out.println("Dentro do metodo recuperaTamanhoMaximoDado na Classe CarregaDados");
    }
}
