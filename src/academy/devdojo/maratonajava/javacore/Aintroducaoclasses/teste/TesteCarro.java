package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class TesteCarro {

    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Civic";
        carro1.modelo = "Honda";
        carro1.ano = 2012;

        Carro carro2 = new Carro();
        carro2.nome = "Ka";
        carro2.modelo = "Ford";
        carro2.ano = 1998;

        System.out.println(carro1.exibeInfoCarro());
        System.out.println(carro2.exibeInfoCarro());

        carro2 = carro1;

        System.out.println(carro1.exibeInfoCarro());
        System.out.println(carro2.exibeInfoCarro());
    }

}
