package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {

    public static void main(String[] args){

        int idade = 16;
         boolean isAutorizadoABeber = idade >= 18;

         if (isAutorizadoABeber){
             System.out.println("Está autorizado a consumir bebida alcoólica.");
         }

         if (!isAutorizadoABeber){
             System.out.println("Não está autorizado a consumir bebida alcoólica.");
         }
    }
}
