package Classes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PedidoBuilderTest {

    private PedidoRestaurante pedidoCompleto() {
        return new PedidoBuilder()
                .setNumeroPedido(1001)
                .setNomeCliente("Lucas Barra")
                .setEnderecoEntrega("Rua Raul Correa Castro, 23 - Ipiranga")
                .setItemPrincipal("X-Burguer Duplo")
                .setBebida("Coca-Cola 600ml")
                .setFormaPagamento("Cartão de débito")
                .setTaxaEntrega(6.50)
                .build();
    }

    @Test
    void buildDeveRetornarPedidoNaoNulo() {
        PedidoRestaurante p = new PedidoBuilder().build();
        assertNotNull(p);
    }

    @Test
    void numeroPedidoDeveSerAtribuido() {
        assertEquals(1001, pedidoCompleto().getNumeroPedido());
    }

    @Test
    void nomeClienteDeveSerAtribuido() {
        assertEquals("Lucas Barra", pedidoCompleto().getNomeCliente());
    }

    @Test
    void itemPrincipalDeveSerAtribuido() {
        assertEquals("X-Burguer Duplo", pedidoCompleto().getItemPrincipal());
    }

    @Test
    void taxaEntregaDeveSerAtribuida() {
        assertEquals(6.50, pedidoCompleto().getTaxaEntrega(), 0.01);
    }

    @Test
    void campoOpcionalNaoAtribuidoDeveSerNulo() {
        PedidoRestaurante p = new PedidoBuilder()
                .setNumeroPedido(1002)
                .setNomeCliente("Ana Lima")
                .setItemPrincipal("Pizza Margherita")
                .build();
        assertNull(p.getBebida());
    }

    @Test
    void fluentInterfaceDeveRetornarOMesmoBuilder() {
        PedidoBuilder builder = new PedidoBuilder();
        assertSame(builder, builder.setNomeCliente("Teste"));
    }

    @Test
    void buildDeveRetornarSempreAMesmaInstancia() {
        PedidoBuilder builder = new PedidoBuilder().setNomeCliente("João");
        assertSame(builder.build(), builder.build());
    }
}