package academy.devdojo.maratonajava.javacore.Gassociacao.dominio;

public class Escola {

    private String nomeEscola;

    private Professor[] professores;

    public Escola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public Escola(String nomeEscola, Professor[] professores) {
        this.nomeEscola = nomeEscola;
        this.professores = professores;
    }

    public void imprive(){
        System.out.println("-----------------");
        System.out.println(this.getNomeEscola());
        if (this.professores == null) return;
        for(Professor professor: this.professores){
            System.out.println(professor.getNomeProfessor());
        }
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public Professor[] getProfessores() {
        return professores;
    }

    public void setProfessores(Professor[] professores) {
        this.professores = professores;
    }
}
