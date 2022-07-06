package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio;

public class Aluno {

    private String nome;
    private int idade;

    private Seminario seminario;

    public Aluno(){}

    public Aluno(String nome, int idade, Seminario seminario){
        this.nome = nome;
        this.idade = idade;
        this.seminario = seminario;
    }

    public void imprimeAluno(){
        System.out.println("###-Aluno-###");
        System.out.println("Nome do aluno: " + this.nome);
        System.out.println("Idade do aluno: " + this.idade);
        if (this.seminario == null) return;
        System.out.println("Seminário que o aluno está registrado " + this.seminario.getTitulo());
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

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
