package br.com.gft.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
	private static List<String> magia = new ArrayList<>();
	
	public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level,
			List<Magia> magia) {
		setNome(nome);
		setVida(vida);
		setMana(mana);
		setXp(xp);
		setInteligencia(inteligencia);
		setForca(forca);
		setLevel(level);
		magia = magia;
		
	}
		
	public Mago() {
		
	}
	public List<String> getMagia() {
		
		return magia;
	}

	public void setMagia(List<String> magia) {
		this.magia = magia;
	}
	
	@Override
	public void lvlUp() {
		setLevel(getLevel()+1);
		setMana(getMana()+1);
		setInteligencia(getInteligencia()+1);
	}
	
	public int attack() {
		Random aleatorio = new Random();
		int numeroRandomico = aleatorio.nextInt(300);
		int ataque = (getInteligencia()*getLevel()+numeroRandomico);
		return ataque;
	}
	
	public void aprenderMagia(String magia) {
		this.magia.add(magia);
	}
}
