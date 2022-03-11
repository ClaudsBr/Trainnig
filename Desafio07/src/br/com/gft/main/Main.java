package br.com.gft.main;

import br.com.gft.model.Gerente;
import br.com.gft.model.Supervisor;
import br.com.gft.model.Vendedor;

public class Main {

	public static void main(String[] args) {
		Gerente gerente = new Gerente("Malvo", 35, 4605.80);
		
		System.out.println(gerente.bonificacao());
		
		Supervisor supervisor = new Supervisor("Jerome", 27, 2788.45);
		
		System.out.println(supervisor.bonificacao());
		
		Vendedor vendedor = new Vendedor("Perigo", 49, 1344.76);
		
		System.out.println(vendedor.bonificacao());
	}

}
