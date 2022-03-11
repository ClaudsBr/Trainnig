package br.com.gft.model;

public class Habilidade {
	String nomeHabilidade;
	int poderAtaque;
	
	public Habilidade(String nomeHabilidade, int poderAtaque) {
		this.nomeHabilidade = nomeHabilidade;
		this.poderAtaque = poderAtaque;
	}
	public String getNomeHabilidade() {
		return nomeHabilidade;
	}
	public void setNomeHabilidade(String nomeHabilidade) {
		this.nomeHabilidade = nomeHabilidade;
	}
	public int getPoderAtaque() {
		return poderAtaque;
	}
	public void setPoderAtaque(int poderAtaque) {
		this.poderAtaque = poderAtaque;
	}
	
	
}
