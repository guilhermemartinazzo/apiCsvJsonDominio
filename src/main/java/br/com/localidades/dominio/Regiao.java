package br.com.localidades.dominio;

public class Regiao {

	private Number id;
	private String nome;
	private String sigla;
	
	public Number getId() {
		return id;
	}
	public void setId(Number id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
}
