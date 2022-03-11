package br.com.gft.model;

public class Supervisor extends Funcionario {
	
	public Supervisor(String nome, int idade, double salario) {
		setNome(nome);
		setIdade(idade);
		setSalario(salario);
	}
	
	@Override
	public double bonificacao() {
		return getSalario()+5000;
	}
}
