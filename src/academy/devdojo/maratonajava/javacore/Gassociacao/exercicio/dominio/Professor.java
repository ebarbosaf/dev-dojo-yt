package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio;

public class Professor {

    private String nome;
    private String especialidade;

    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios){
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprimeProfessor(){
        System.out.println("###-Professor-###");
        System.out.println("Nome do professor " + this.nome);
        System.out.println("Especialidade do professor " + this.especialidade);
        if (this.seminarios == null) return;
        for (Seminario seminario: this.seminarios){
            System.out.println("Seminários a participar " + seminario.getTitulo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
