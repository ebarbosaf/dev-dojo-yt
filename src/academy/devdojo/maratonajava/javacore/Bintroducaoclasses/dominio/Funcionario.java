package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio;

public class Funcionario {

    private String nome;
    private int idade;
    private double[] salarios;

    private double media;

    public Funcionario() {

    }

    public Funcionario(String nome, int idade, double... salario) {
        this.nome = nome;
        this.idade = idade;
        this.salarios = salario;
    }

    public void infoFuncionario() {
        System.out.printf("Nome %s tem %d de idade e média salárial de %.2f dos últimos %d salários %n", this.nome,
                this.idade, this.calculaMediaSalario(), this.salarios.length);
        for (int i = 0; i < this.salarios.length; i++) {
            System.out.println((i + 1) + "º" + " salário no valor de " + this.salarios[i]);
        }
    }

    public double calculaMediaSalario() {
        for (int i = 0; i < this.salarios.length; i++) {
            media += this.salarios[i];
        }

        return media /= this.salarios.length;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }

}
