package br.com.evoluum.dominio;

public class UF {

	
	private Number id;
	private String nome;
	private String sigla;
	private Regiao regiao;
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
	public Regiao getRegiao() {
		return regiao;
	}
	public void setRegiao(Regiao regiao) {
		this.regiao = regiao;
	}
}
