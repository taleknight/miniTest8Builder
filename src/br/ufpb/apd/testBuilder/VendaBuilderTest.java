package br.ufpb.apd.testBuilder;

import static org.junit.Assert.*;
import org.junit.Test;

import br.ufpb.aps.builder.*;

public class VendaBuilderTest {

	
	@Test
	public void testSemBuilder() {
		Venda venda = new Venda().setData("10/03/20");
		Cliente cliente = new ClientePF("Jose", "010.100.100-10");
		venda.setCliente(cliente);

		Produto produto1 = new Produto("Banana", 1.00);
		ItemVenda item1 = new ItemVenda(3, produto1);
		venda.setItemVenda(item1);

		Produto produto2 = new Produto("Abacaxi", 0.50);
		ItemVenda item2 = new ItemVenda(7, produto2);
		venda.setItemVenda(item2);
	}

	@Test
	public void testComBuilder() {
		Produto banana = new Produto("Banana", 1.00);
		Produto abacaxi = new Produto("Abacaxi", 0.50);
		Venda venda = new VendaBuilder()
				.data("10/03/20")
				.clientePF("Jose", "001.001.100-01")
				.item(3, banana)
				.item(7, abacaxi)
				.build();
		
//		assertEquals("10/03/20, Jose, 001.001.100-01, 3, Banana, 1.00, Abacaxi, 0.50",venda.toString());
	}
	
	@Test
	public void testComBuilder2() {
		Produto cafe = new Produto("Café", 0.05);
		Produto cafeteira = new Produto("Cafeteira", 10.00);
		Produto aguaMineral = new Produto("Água Míneral", 2.00);
		Venda venda = new VendaBuilder()
				.data("13/03/20")
				.clientePF("Reinaldo", "001.010.100-01")
				.item(3, cafe)
				.item(7, cafeteira)
				.item(2, aguaMineral)
				.build();
	}
}
