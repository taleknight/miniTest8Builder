package br.ufpb.aps.builder.main;

public class VendaBuilder {
	
	private Venda venda;
	
	//Methods
	public VendaBuilder() {
		venda = new Venda();
	}
	
	public Venda build() {
		return this.venda;
	}
	
	public VendaBuilder data(String data) {
		venda.setData(data);
		return this;
	}
	
	public VendaBuilder clientePF(String nome, String cpf) {
		venda.setCliente(new ClientePF(nome, cpf));
		return this; 
	}
	
	public VendaBuilder clientePJ(String razaoSocial, String cnpj) {
		venda.setCliente(new ClientePJ(razaoSocial, cnpj));
		return this;
	}
	
	public VendaBuilder funcionario(String nome) {
		venda.setFuncionario(new Funcionario(nome));
		return this;
	}
	
//	public VendaBuilder item(int quantidade, Produto produto) {
//		venda.setItemVenda(new ItemVenda(quantidade, produto));
//		ItemVenda temp = venda.getItemVenda();
//		venda.item.add(temp);
//		return this;
//	}
	public VendaBuilder item(ItemVenda itemVenda) {
		venda.addItem(itemVenda);
		return this;
	}
	public VendaBuilder frete(Frete frete) {
		venda.setFrete(frete);
		return this;
	}	

}
