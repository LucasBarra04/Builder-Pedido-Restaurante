package Classes;

public class PedidoBuilder {

    private PedidoRestaurante pedido;

    public PedidoBuilder() {
        this.pedido = new PedidoRestaurante();
    }

    public PedidoRestaurante build() {
        return pedido;
    }

    public PedidoBuilder setNumeroPedido(int n) {
        pedido.setNumeroPedido(n);
        return this;
    }

    public PedidoBuilder setNomeCliente(String n) {
        pedido.setNomeCliente(n);
        return this;
    }

    public PedidoBuilder setEnderecoEntrega(String e) {
        pedido.setEnderecoEntrega(e);
        return this;
    }

    public PedidoBuilder setItemPrincipal(String i) {
        pedido.setItemPrincipal(i);
        return this;
    }

    public PedidoBuilder setBebida(String b) {
        pedido.setBebida(b);
        return this;
    }

    public PedidoBuilder setFormaPagamento(String f) {
        pedido.setFormaPagamento(f);
        return this;
    }

    public PedidoBuilder setTaxaEntrega(double t) {
        pedido.setTaxaEntrega(t);
        return this;
    }
}