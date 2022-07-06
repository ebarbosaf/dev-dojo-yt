package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain.Carro;

public class CarroTest01 {

    public static void main(String[] args) {
        Carro c1 = new Carro("BMW", 275);
        Carro c2 = new Carro("Mercedes", 265);
        Carro c3 = new Carro("Audi", 280);

        c1.imprime();
        Carro.setVelocidadeLimite(255);
        c2.imprime();
        c3.imprime();

    }
}
