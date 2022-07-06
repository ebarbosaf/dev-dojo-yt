package academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.teste;

import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.exercicio.dominio.Seminario;

public class SeminarioTeste01 {
    public static void main(String[] args) {
        Local local = new Local("Av dos Paralelepipedos, sem número");
        Seminario seminario1 = new Seminario("Vivendo a vida adoidado", local);
        Seminario seminario2 = new Seminario("Uma vida sem bug não é vida", local);
        Seminario seminario3 = new Seminario("E quem disse que programar é vida?", local);
        Seminario[] seminarios = {seminario2, seminario3};
        Professor professor1 = new Professor("Jungle", "Viajante", new Seminario[]{seminario1});
        Professor professor2 = new Professor("Bug", "Dev sonhador", seminarios);
        Aluno aluno1 = new Aluno("Pluto", 17, seminario1);
        Aluno aluno2 = new Aluno("Pateta", 18, seminario2);
        Aluno aluno3 = new Aluno("Teco", 18, seminario3);

        seminario2.setAlunos(new Aluno[]{aluno2,aluno3});
        seminario1.setAlunos(new Aluno[]{aluno1});
        seminario3.setAlunos(new Aluno[]{aluno3});

        professor1.imprimeProfessor();
        professor2.imprimeProfessor();

        seminario1.imprimeSeminario();
        seminario2.imprimeSeminario();
        seminario3.imprimeSeminario();

        aluno1.imprimeAluno();
        aluno2.imprimeAluno();
        aluno3.imprimeAluno();



    }
}
