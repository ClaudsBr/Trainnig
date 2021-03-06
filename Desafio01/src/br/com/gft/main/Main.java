package br.com.gft.main;

import br.com.gft.model.Veiculo;

public class Main {

	public static void main(String[] args) {
		Veiculo v1 = new Veiculo("Fiat","Argo", "PGH5J78", "Cinza", 1988, false, 0, 21, 48500 );
		
		
		
		//Testando o M?todo acelerar
		System.out.println(v1.getVelocidade()+"km/h");
		v1.acelerar();
		System.out.println(v1.getVelocidade()+" km/h");		
		//Ligando o carro e setando a velocidade em 10 km/h
		v1.ligar();
		v1.setVelocidade(10);
		System.out.println(v1.getVelocidade()+" km/h");
		v1.acelerar();
		System.out.println(v1.getVelocidade()+" km/h");
		System.out.println("----------------------------------");
		
		//Testando o M?todo Abastecer
		System.out.println(v1.getLitrosCombustivel()+" litros");
		v1.abastecer(33);
		System.out.println(v1.getLitrosCombustivel()+" litros");
		System.out.println("----------------------------------");
		
		//Testando o m?todo frear
		System.out.println("velocidade atual "+v1.getVelocidade()+" km/h");
		v1.frear();
		System.out.println("velocidade atual "+v1.getVelocidade()+" km/h");		
		//Setando a velocidade para 0
		v1.setVelocidade(0);
		v1.frear();
		System.out.println("----------------------------------");
		
		//Testando o M?todo Pintar
		System.out.println("Cor atual: "+v1.getCor());
		//Alterando a cor para Vermelho
		v1.setCor("vermelho");
		System.out.println("Nova Cor: "+v1.getCor());
		System.out.println("----------------------------------");
		
		//Testando o M?todo Ligar
		System.out.println("O carro est? ligado?"+ v1.isLigado());
		v1.desligar();
		System.out.println("O carro est? ligado?"+ v1.isLigado());
		v1.ligar();
		System.out.println("O carro est? ligado?"+ v1.isLigado());
		System.out.println("----------------------------------");
		
		//Testando o M?todo Desligar
		System.out.println("O carro est? ligado? "+ v1.isLigado());
		v1.setVelocidade(50);
		//Testando o M?todo Ligar com o carro em Movimento
		v1.desligar();
		// Setando a velocidade do carro para 0
		v1.setVelocidade(0);
		System.out.println("O carro est? ligado? "+ v1.isLigado());
		v1.desligar();
		System.out.println("O carro est? ligado? "+ v1.isLigado());
	}

}
