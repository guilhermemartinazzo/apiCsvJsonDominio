package br.com.evoluum.dominio;

import java.util.List;

public class MesoRegiao {

	private Number id;
	private String nome;
	private List<UF> UF;
	
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
	public void setId(Number id) {
		this.id = id;
	}
	public List<UF> getUF() {
		return UF;
	}
	public void setUF(List<UF> uF) {
		UF = uF;
	}
	
}
