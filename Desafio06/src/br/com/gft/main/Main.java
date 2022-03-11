package br.com.gft.main;

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
		
		// Verificando se o nome Jessica existe na lista
		lista.pesquisarNome("Jessica");

	}

}
