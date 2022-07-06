package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio;

public class Seminario {

    private String titulo;

    private Aluno[] alunos;

    private Local local;

    public Seminario(String titulo, Local local){
        this.titulo = titulo;
        this.local = local;
    }

    public void imprimeSeminario(){
        System.out.println("###-Seminario-###");
        System.out.println("Titulo do seminario : " + this.titulo);
        System.out.println("Local do seminario: " + this.local.getEndereco());
        if(this.alunos != null) {
            for(Aluno aluno: this.alunos){
                System.out.println("Alunos participantes: " + aluno.getNome());
            }
        }

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
