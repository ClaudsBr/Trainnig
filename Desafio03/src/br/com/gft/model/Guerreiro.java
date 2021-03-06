package br.com.gft.model;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {
	private static List<String> habilidade;
	
	public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<Habilidade> habilidade) {
		setNome(nome);
		setVida(vida);
		setMana(mana);
		setXp(xp);
		setInteligencia(inteligencia);
		setForca(forca);
		setLevel(level);
		habilidade = habilidade;
		
	}

	public List<String> getHabilidade() {
		return habilidade;
	}

	public void setHabilidade(List<String> habilidade) {
		this.habilidade = habilidade;
	}
	
	@Override
	public void lvlUp() {
		setLevel(getLevel()+1);
		setVida(getVida()+1);
		setForca(getForca()+1);
	}
	
	public int attack() {
		Random aleatorio = new Random();
		int numeroAleatorio = aleatorio.nextInt(300);
		int ataque = (getForca()*getLevel()+numeroAleatorio);
		return ataque;
	}
	
	public void aprenderHabilidade(String habilidade) {
		this.habilidade.add(habilidade);
	}

}
