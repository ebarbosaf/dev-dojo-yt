package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa{

    private double salario;

    static {
        System.out.println("Bloco de inicialização estático da classe Funcionario");
    }
    {
        System.out.println("Bloco de inicialização da classe Funcionario 1");
    }
    {
        System.out.println("Bloco de inicialização da classe Funcionario 2");
    }

    public Funcionario() {
        System.out.println("Dentro do construtor Funcionario");
    }

    public Funcionario(String nome){
        super(nome);
    }

    @Override
    public void imprime(){
        super.imprime();
        System.out.println(this.getSalario());
        this.relatorioSalario();
    }

    public void relatorioSalario(){
        System.out.println("Eu " + this.nome + " recebi o salário no valore de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
