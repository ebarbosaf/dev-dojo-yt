package academy.devdojo.maratonajava.javacore.Bintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaoclasses.dominio.ImprimeEstudante;

public class EstudanteTeste01 {

    public static void main(String[] args) {
        Estudante estudante1 = new Estudante("Timão", 23, 'M');
        Estudante estudante2 = new Estudante("Pumba", 25, 'M');
        ImprimeEstudante impressora = new ImprimeEstudante();

        impressora.imprime(estudante1);
        impressora.imprime(estudante2);

        estudante1.imprime();
        estudante2.imprime();

    }
}
