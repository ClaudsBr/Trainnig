package br.com.gft.model;

public class Vendedor extends Funcionario {
	
	public Vendedor(String nome, int idade, double salario) {
		setNome(nome);
		setIdade(idade);
		setSalario(salario);
	}
	
	@Override
	public double bonificacao() {
		return getSalario()+3000;
	}
}
