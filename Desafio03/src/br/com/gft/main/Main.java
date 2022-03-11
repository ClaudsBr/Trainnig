package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.Guerreiro;
import br.com.gft.model.Habilidade;
import br.com.gft.model.ListaPersonagens;
import br.com.gft.model.Magia;
import br.com.gft.model.Mago;

public class Main {

	public static void main(String[] args) {
					
		List<Magia> magia = new ArrayList<Magia>();
		List<Habilidade> habilidade = new ArrayList<Habilidade>();
		
		Magia thunder = new Magia("Thunder", 800);
		Magia flash = new Magia("Flash de Luz", 100);
		Habilidade cortar = new Habilidade("Corte com a Espada", 680);
		magia.add(thunder);
		magia.add(flash);
		habilidade.add(cortar);
		
		Mago gandalf = new Mago("Gandalf", 1000, 800, 135, 900, 25, 92, magia);
		Guerreiro aragorn = new Guerreiro("Aragorn", 700, 100, 127, 750, 80,77, habilidade);
		
		gandalf.lvlUp();
		System.out.println(gandalf.getLevel());
		System.out.println(gandalf.getMana());
		System.out.println(gandalf.getInteligencia());
		
		aragorn.lvlUp();
		System.out.println(aragorn.getLevel());
		System.out.println(aragorn.getForca());
		System.out.println(aragorn.getVida());
		
		//Usando o metodo attack()
		System.out.println(gandalf.attack());
		System.out.println(aragorn.attack());
		
		ListaPersonagens lista = new ListaPersonagens();
		lista.adicionarPersonagem(aragorn);
		lista.adicionarPersonagem(gandalf);
		
		System.out.println(lista.qtdPersonagens());

	}

}
