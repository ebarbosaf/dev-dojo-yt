package academy.devdojo.maratonajava.javacore.Kenum.teste;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.TipoPagamento;

public class ClienteTeste01 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Cliente 1", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Cliente 2", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);
        Cliente cliente3 = new Cliente("Cliente 3", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente4 = new Cliente("Cliente 4", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(cliente3);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(10));

        TipoCliente tipo = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipo);
        TipoCliente tipo2 = TipoCliente.tipoClientePorNomeRelatorio("Pessoa fisica");
        System.out.println(tipo2.getNomeRelatorio());
    }
}
