package miniTestBuilder;

import static org.junit.Assert.*;
import org.junit.Test;

import br.ufpb.aps.builder.*;

public class VendaBuilderTest {

	@Test
	public void test() {
		Produto banana = new Produto("Banana", 1.00);
		Produto abacaxi = new Produto("Abacaxi", 0.50);
		Venda venda = new VendaBuilder().data("10/03/20").clientePF("Jose", "000.000.000-00").item(3, banana)
				.item(7, abacaxi).build();
	}

}
