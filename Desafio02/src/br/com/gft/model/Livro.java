package br.com.gft.model;

public class Livro extends Produto implements Imposto {
	private String autor;
	private String tema;
	private int qtdPaginas;
	
	
	
	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPaginas) {
		setNome(nome);
		setPreco(preco);
		setQtd(qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPaginas = qtdPaginas;
	}
	
	
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	
	public String getTema() {
		return tema;
	}
	
	
	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPaginas() {
		return qtdPaginas;
	}

	public void setQtdPaginas(int qtdPaginas) {
		this.qtdPaginas = qtdPaginas;
	}
	
	@Override
	public double calcularImposto() {
		if (tema.equalsIgnoreCase("educativo")) {
			System.out.println("Livro educativo n?o tem imposto: " + getNome() );
				return 0;
			} else {
				double imposto = this.getPreco()*0.1;
				System.out.println("R$ "+ imposto +" de impostos sobre o livro "+ getNome());
			}
		return 0;
		}
	
	

}
