package br.com.gft.model;

import java.util.ArrayList;
import java.util.Arrays;

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
	
	public static String pessoaMaisVelha() {
		int maior = 0;
		String maisVelho = "";
		for(Pessoa p: lista) {
			if(p.getIdade() >= maior) {
				maior = p.getIdade();
				maisVelho = p.getNome();
			}
			
		}
		return "A pessoa mais velha da lista é "+maisVelho+ " com "+maior+" anos";
	}
		
	
}
