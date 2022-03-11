package br.com.gft.model;

import java.util.ArrayList;

public class ListaPersonagens {
	private static ArrayList<Personagem> listaPersonagens = new ArrayList<>();
	
	
	public static void adicionarPersonagem(Personagem personagem) {
		listaPersonagens.add(personagem);
		
	}
	
	public static int qtdPersonagens() {
		int qtd = 0;
		
		for(Personagem p: listaPersonagens) {
			qtd++;
		}
		return qtd;
	}
}
