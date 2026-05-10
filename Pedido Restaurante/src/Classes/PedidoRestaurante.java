package Classes;

public class PedidoRestaurante {

    private int    numeroPedido;
    private String nomeCliente;
    private String enderecoEntrega;
    private String itemPrincipal;
    private String bebida;
    private String formaPagamento;
    private double taxaEntrega;

    public int    getNumeroPedido()                  { return numeroPedido; }
    public void   setNumeroPedido(int n)             { this.numeroPedido = n; }
    public String getNomeCliente()                   { return nomeCliente; }
    public void   setNomeCliente(String n)           { this.nomeCliente = n; }
    public String getEnderecoEntrega()               { return enderecoEntrega; }
    public void   setEnderecoEntrega(String e)       { this.enderecoEntrega = e; }
    public String getItemPrincipal()                 { return itemPrincipal; }
    public void   setItemPrincipal(String i)         { this.itemPrincipal = i; }
    public String getBebida()                        { return bebida; }
    public void   setBebida(String b)                { this.bebida = b; }
    public String getFormaPagamento()                { return formaPagamento; }
    public void   setFormaPagamento(String f)        { this.formaPagamento = f; }
    public double getTaxaEntrega()                   { return taxaEntrega; }
    public void   setTaxaEntrega(double t)           { this.taxaEntrega = t; }
}