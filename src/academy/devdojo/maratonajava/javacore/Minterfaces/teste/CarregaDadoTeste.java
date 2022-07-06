package academy.devdojo.maratonajava.javacore.Minterfaces.teste;

import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.CarregaArquivo;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.CarregaDados;
import academy.devdojo.maratonajava.javacore.Minterfaces.dominio.CarregaDadosBanco;

public class CarregaDadoTeste {
    public static void main(String[] args) {
        CarregaDadosBanco banco = new CarregaDadosBanco();
        CarregaArquivo arquivo = new CarregaArquivo();

        banco.carrega();
        arquivo.carrega();

        banco.remove();
        arquivo.remove();

        banco.checaPermissao();
        arquivo.checaPermissao();

        CarregaDados.recuperaTamanhoMaximoDado();
        CarregaDadosBanco.recuperaTamanhoMaximoDado();
    }
}
