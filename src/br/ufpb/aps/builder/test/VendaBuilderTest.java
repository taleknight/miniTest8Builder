package br.ufpb.aps.builder.test;

import static org.junit.Assert.*;
import org.junit.Test;

import br.ufpb.aps.builder.main.*;


public class VendaBuilderTest {

	@Test
	public void testSemBuilder() {
		Venda venda = new Venda().setData("10/03/20");
		Cliente cliente = new ClientePF("Jose", "010.100.100-10");
		venda.setCliente(cliente);

		Produto produto1 = new Produto("Banana", 1.00);
		ItemVenda item1 = new ItemVenda(3, produto1);

		Produto produto2 = new Produto("Abacaxi", 0.50);
		ItemVenda item2 = new ItemVenda(7, produto2);
	}

	@Test
	public void testComBuilderClientePF() {
		Produto banana = new Produto("Banana", 1.00);
		Produto abacaxi = new Produto("Abacaxi", 0.50);
        ItemVenda itemVenda = new ItemVenda(5, banana);
        ItemVenda itemVenda2 = new ItemVenda(5, abacaxi);

		Venda venda = new VendaBuilder()
				.data("10/03/20")
				.clientePF("Jose", "001.001.100-01")
				.item(itemVenda)
				.item(itemVenda2)
				.build();

		assertEquals("data: 10/03/20, cliente: nome: Jose, cpf: 001.001.100-01, " +
                "itemVenda: [quantidade: 5, descrição: Banana, preço: 1.00]",
                venda.toString());
	}
	
	@Test
    public void vendaBuilderPJ(){
        Produto mesa = new Produto("Mesa", 172.90);
        Frete frete = new Frete(50.00);

        ItemVenda itemVenda = new ItemVenda(1, mesa);

        Venda venda = new VendaBuilder()
                .data("10/07/93")
                .funcionario("Jonas")
                .clientePJ("Empresa Ltda", "65894785")
                .frete(frete)
                .item(itemVenda)
                .build();

        assertEquals("data: 10/07/93, cliente: razão social: Empresa Ltda, cnpj: 65894785, " +
                        "itemVenda: [quantidade: 1, descrição: Mesa, preço: 172.9], Frete: 50.0, Funcionario: Jonas",
                venda.toString());
    }

//	@Test
//	public void testComBuilder2() {
//		Produto cafe = new Produto("Café", 0.05);
//		Produto cafeteira = new Produto("Cafeteira", 10.00);
//		Produto aguaMineral = new Produto("Água Míneral", 2.00);
//		ItemVenda itemVenda = new ItemVenda(2, cafe);
//      ItemVenda itemVenda2 = new ItemVenda(1, cafeteira);
//		ItemVenda itemVenda3 = new ItemVenda(3, aguaMineral)
//		Venda venda = new VendaBuilder()
//				.data("13/03/20")
//				.clientePF("Reinaldo", "001.010.100-01")
//				.item(3, cafe)
//				.item(7, cafeteira)
//				.item(2, aguaMineral)
//				.build();
//	}
}
