package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio;

public class Carro {
    public String nome;
    public String modelo;
    public int ano;

    public String exibeInfoCarro(){
        return "Nome: " + nome + " modelo " + modelo + " e ano " + ano;
    }
}
