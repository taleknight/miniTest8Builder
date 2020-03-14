package br.ufpb.aps.builder.main;

public class ItemVenda {
	
	private int quantidade;
	private Produto produto;
	
	public ItemVenda(int quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
    public String toString(){
        return "quantidade: " + this.quantidade + ", " + this.produto.toString();
    }

}