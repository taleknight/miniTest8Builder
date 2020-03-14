package br.ufpb.aps.builder.main;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private String data;
	private Cliente cliente;
	private Funcionario funcionario;
	private Frete frete;
//	private ItemVenda itemVenda;

	// List
	List<ItemVenda> item = new ArrayList<ItemVenda>();

// Get and Set

	public String getData() {
		return data;
	}

	public Venda setData(String data) {
		this.data = data;
		return this;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Frete getFrete() {
		return frete;
	}

	public void setFrete(Frete frete) {
		this.frete = frete;
	}
//
//	public ItemVenda getItemVenda() {
//		return itemVenda;
//	}
//
//	public void setItemVenda(ItemVenda itemVenda) {
//		this.itemVenda = itemVenda;
//	}

//Metodos criados	

	public List<ItemVenda> getItem() {
		return item;
	}

	public void setItem(List<ItemVenda> item) {
		this.item = item;
	}

	public void addItem(ItemVenda itemVenda) {
		this.item.add(itemVenda);
	}

	public String toString() {
		return "data: " + data + ", cliente: " + cliente.toString() 
				+ ", itemVenda: " + item.toString() + ", "
				+ frete.toString() + ", Funcionario: "
				+ funcionario.toString();
	}
}
