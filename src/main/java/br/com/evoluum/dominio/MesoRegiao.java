package br.com.evoluum.dominio;

public class MesoRegiao {

	private Number id;
	private String nome;
	private UF uf;
	
	public Number getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public UF getUf() {
		return uf;
	}
	public void setUf(UF uf) {
		this.uf = uf;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setId(Number id) {
		this.id = id;
	}
	
}
