package br.com.gft.model;

public class VideoGame extends Produto implements Imposto {
	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public VideoGame() {
		
	}
	
	public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		setNome(nome);
		setPreco(preco);
		setQtd(qtd);
		this.marca = marca;
		this.modelo = modelo;
		this.isUsado = isUsado;
	}
	
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double calcularImposto() {
		if(this.isUsado()) {
			double imposto = 0.25* this.getPreco();
			System.out.println("Imposto "+ getNome()+ " usado, R$ "+ imposto + ".");
		} else {
			double imposto = 0.45*this.getPreco();
			System.out.println("Imposto "+ getNome()+ " R$ "+ imposto + ".");
		}
		return 0;
	}
	
	

}
