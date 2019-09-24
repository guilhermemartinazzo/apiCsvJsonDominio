package br.com.evoluum.dominio;

public class MicroRegiao {

	
	private Number id;
	private String nome;
	private MesoRegiao mesorregiao;
	
	public Number getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public MesoRegiao getMesorregiao() {
		return mesorregiao;
	}
	public void setMesorregiao(MesoRegiao mesorregiao) {
		this.mesorregiao = mesorregiao;
	}
}
