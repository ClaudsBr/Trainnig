package br.com.gft.model;

public class Magia {
	String nomeMagia;
	int poderAtaque;
	
	public Magia(String nomeMagia, int poderAtaque){
		this.nomeMagia = nomeMagia;
		this.poderAtaque = poderAtaque;
	}
	public String getNomeMagia() {
		return nomeMagia;
	}

	public void setNomeMagia(String nomeMagia) {
		this.nomeMagia = nomeMagia;
	}

	public int getPoderAtaque() {
		return poderAtaque;
	}

	public void setPoderAtaque(int poderAtaque) {
		this.poderAtaque = poderAtaque;
	}
	
	
}
