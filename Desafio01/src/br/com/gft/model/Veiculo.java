package br.com.gft.model;

public class Veiculo {
	String marca;
	String modelo;
	String placa;
	String cor;
	float km;
	boolean isLigado;
	int velocidade;
	int litrosCombustivel;
	double preco;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String ma, String mo, String pl, String co,
			float km, boolean il, int v, int lc, double pr) {
		this.marca = ma;
		this.modelo = mo;
		this.placa = pl;
		this.cor = co;
		this.km = km;
		this.isLigado = il;
		this.velocidade = v;
		this.litrosCombustivel = lc;
		this.preco = pr;
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
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public float getKm() {
		return km;
	}
	public void setKm(float km) {
		this.km = km;
	}
	public boolean isLigado() {
		return isLigado;
	}
	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}
	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void acelerar() {
		if (this.isLigado) {
			this.velocidade +=20;
		} else {
			System.out.println("O carro esta desligado");
		}
		
	}
	
	public void abastecer(int combustivel) {
		if ((this.litrosCombustivel + combustivel) > 60) {
			System.out.println("Excede a capacidade do tanque");
		} else {
			this.litrosCombustivel += combustivel;
		}
	}
	
	public void frear() {
		if (this.velocidade == 0) {			
			System.out.println("O carro est? parado");
			
		}else if (this.velocidade > 0 && this.velocidade < 20) {
			this.velocidade = 0;				
		} else {
			this.velocidade -=20;
		}
	}
	
	public void pintar(String cor) {
		this.cor = cor;
		
	}
	
	public void ligar() {
		if (!this.isLigado) {
			this.isLigado = true;
		}
	}
	
	public void desligar() {		
		if (this.velocidade > 0) {
			System.out.println("Carro em movimento... impossivel desliga-lo");			
		} else {
			this.isLigado = false;
		}
	}
	
	public String descricaoVeiculo() {
		String veiculo = "";
		
		return veiculo;
	}
}
