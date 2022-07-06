package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Pessoa {

    protected String nome;
    private String cpf;
    private Endereco endereco;

    static {
        System.out.println("Bloco de inicialização estático da classe Pessoa");
    }
    {
        System.out.println("Bloco de inicialização da classe Pessoa 1");
    }
    {
        System.out.println("Bloco de inicialização da classe Pessoa 2");
    }

    public Pessoa() {
        System.out.println("Dentro do construtor Pessoa");
    }

    public Pessoa(String nome){
        this.nome = nome;
    }

    public Pessoa(String nome, String cpf, Endereco endereco){
        this(nome);
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public void imprime(){
        System.out.println("-------------------");
        System.out.println(this.getNome());
        System.out.println(this.getCpf());
        System.out.println(this.endereco.getRua() + " CEP: " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
