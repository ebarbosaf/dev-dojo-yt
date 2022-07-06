package academy.devdojo.maratonajava.javacore.Jmodificardorfinal.dominio;

public class Carro {

    private String nome;

    public static final double VELOCIDADE_LIMITE;
    public final Comprador COMPRADOR = new Comprador();
//    public final double VELOCIDADE_LIMITE;

    static{
        VELOCIDADE_LIMITE = 250;
    }

    /*public Carro(){
        VELOCIDADE_LIMITE = 100;
    }*/

    public final String imprime(){
        return this.toString();
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nome='" + nome + '\'' +
                ", COMPRADOR=" + COMPRADOR +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String test(){
        return "Oi";
    }
}
