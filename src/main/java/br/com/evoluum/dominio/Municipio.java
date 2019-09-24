package br.com.evoluum.dominio;

public class Municipio {

	private Number id;
	private String nome;
	private MicroRegiao microrregiao;
	
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
	public MicroRegiao getMicrorregiao() {
		return microrregiao;
	}
	public void setMicrorregiao(MicroRegiao microrregiao) {
		this.microrregiao = microrregiao;
	}
}
