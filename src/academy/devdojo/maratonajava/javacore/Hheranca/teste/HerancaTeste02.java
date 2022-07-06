package academy.devdojo.maratonajava.javacore.Hheranca.teste;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;

public class HerancaTeste02 {
    /*
    * 0 - Bloco de inicialização estático da super classe é executado quando a JVM carrega a classe pai
    * 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carrega a classe filha
    * 2 - Alocado espaço em memória pro objeto da super classe
    * 3 - Cada atributo da superclasse é criado e inicializado com valores default ou o que for passado
    * 4 - Bloco de inicialização da super classe é executado na ordem em que aparece
    * 5 - Construtor é executado da super classe
    * 6 - Alocado espaço em memória pro objeto da subclasse
    * 7 - Cada atributo da subclasse é criado e inicializado com valores default ou o que for passado
    * 8 - Bloco de inicialização da super classe é executado na ordem em que aparece
    * 9 - Construtor é executado da subclasse
    * */

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
    }
}
