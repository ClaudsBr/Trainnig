package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.Lista;
import br.com.gft.model.Pessoa;

public class Main {

	public static void main(String[] args) {
		Pessoa joao = new Pessoa("Joao", 15);
		Pessoa leandro = new Pessoa("Leandro", 21);
		Pessoa paulo = new Pessoa("Paulo", 17);
		Pessoa jessica = new Pessoa("Jessica", 18);

		Lista lista = new Lista();
		lista.adicionar(joao);
		lista.adicionar(leandro);
		lista.adicionar(paulo);
		lista.adicionar(jessica);
		
		//Exibindo as pessoas da Lista
		System.out.println(lista.listarPessoas());
		//Removendo o menor de 18
		lista.removerMenorDeDezoito();
		System.out.println();
		//Exibindo a nova Lista
		System.out.println(lista.listarPessoas());
		// Removendo o outro menor de 18
		lista.removerMenorDeDezoito();
		System.out.println();
		//Exibindo a nova Lista
		System.out.println(lista.listarPessoas());

	}

}
