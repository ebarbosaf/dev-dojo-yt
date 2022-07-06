package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais02 {

    public static void main(String[] args) {

        // idade < 15 categoria infantil
        // idade >= 15 e < 18 categoria juvenil
        // idade >= 18 categoria adulto

        int idade = 50;
        String categoria;

        /*if (idade < 15) {
            categoria = "Categoria infantil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Categoria juvenil";
        } else {
            categoria = "Categoria adulto";
        }*/

        categoria = idade < 15 ? "Categoria infantil" : idade >= 15 && idade < 18 ? "Categoria juvenil" : "Categoria " +
                "adulto";


        System.out.println(categoria);
    }
}
