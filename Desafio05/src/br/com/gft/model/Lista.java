package br.com.gft.model;

import java.util.ArrayList;


public class Lista {
	private static ArrayList<Pessoa> lista = new ArrayList<>();
	
	
	public static ArrayList<Pessoa> getLista() {
		return lista;
	}

	public static void adicionar(Pessoa pessoa) {
		lista.add(pessoa);
	}
	
	public static String listarPessoas() {
		String saida = "";
		System.out.println("|Aa Nome|# Idade|");
		for(Pessoa p: lista) {
			saida += " "+p.getNome()+"     "+p.getIdade()+"\n";
		}
		return saida;
	}
				
	public static boolean removerMenorDeDezoito() {
		for(Pessoa p: lista) {
			if(p.getIdade() < 18) {
				lista.remove(p);
				System.out.println("O elemento "+p.getNome()+" foi removido");
				return true;
			}
		}
		return false;
	}
}
