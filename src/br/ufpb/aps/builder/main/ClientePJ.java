package br.ufpb.aps.builder.main;

public class ClientePJ extends Cliente{
	private String razaoSocial;
	private String cpnj;
	
	public ClientePJ(String razaSocial, String cnpj) {
		this.razaoSocial = razaSocial;
		this.cpnj = cnpj;
	}
	
	public String getRazaoSocial() {
		return razaoSocial;
	}
	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}
	public String getCpnj() {
		return cpnj;
	}
	public void setCpnj(String cpnj) {
		this.cpnj = cpnj;
	}
	
	public String toString(){
        return "razão social: " + this.razaoSocial + ", cnpj: " + this.cpnj;
    }
	
}
