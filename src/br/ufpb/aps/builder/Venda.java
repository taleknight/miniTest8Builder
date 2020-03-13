package br.ufpb.aps.builder;

import java.util.ArrayList;


public class Venda {
	
	private String data;
	private Cliente cliente;
	private Funcionario funcionario;
	private Frete frete;
	private ItemVenda itemVenda;
	
	//List
	ArrayList<ItemVenda> item = new ArrayList<ItemVenda>();

	
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

	public ItemVenda getItemVenda() {
		return itemVenda;
	}

	public void setItemVenda(ItemVenda itemVenda) {
		this.itemVenda = itemVenda;
	}
	
	
//Metodos criados	
	
	public ArrayList<ItemVenda> getItem() {
		return item;
	}

	public void setItem(ArrayList<ItemVenda> item) {
		this.item = item;
	}

}