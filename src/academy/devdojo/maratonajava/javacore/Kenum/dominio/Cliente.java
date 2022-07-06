package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Cliente {

    private String nome;

    private TipoCliente tipoCliente;

    private TipoPagamento tipoPagamento;
    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }
    /*private String tipoCliente;
    public static final String PESSOA_FISICA = "PESSOA_FISICA";
    public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";*/

    /*public Cliente(String nome, String tipoCliente) {
        if (!tipoCliente.equalsIgnoreCase(PESSOA_FISICA) && !tipoCliente.equalsIgnoreCase(PESSOA_JURIDICA))
            return;
        this.nome = nome;
        this.tipoCliente = tipoCliente;
    }*/


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteInt=" + tipoCliente.VALOR +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

//    public String getTipoCliente() {
//        return tipoCliente;
//    }
//
//    public void setTipoCliente(String tipoCliente) {
//        this.tipoCliente = tipoCliente;
//    }
}
