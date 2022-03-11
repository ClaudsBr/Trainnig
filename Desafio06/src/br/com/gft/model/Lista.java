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
	
	public static void pesquisarNome(String nome) {
		for(Pessoa p: lista) {
			if(p.getNome().equalsIgnoreCase(nome)) {
				System.out.println("O nome "+nome+" est� na lista");
			} 
		}
						
	}
}
