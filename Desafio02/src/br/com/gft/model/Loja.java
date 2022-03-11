package br.com.gft.model;

import java.util.List;

public class Loja  {
	private String nome;
	private String cnpj;
	private static List<Livro> livro;
	private static List<VideoGame> videoGame;
	
	public  Loja() {
		
	}
	
	public Loja(String nome, String cnpj, List<Livro> livro, List<VideoGame> videoGame) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livro = livro;
		this.videoGame = videoGame;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivro() {
		return livro;
	}

	public void setLivro(List<Livro> livro) {
		this.livro = livro;
	}

	public List<VideoGame> getVideoGame() {
		return videoGame;
	}

	public void setVideoGame(List<VideoGame> videoGame) {
		this.videoGame = videoGame;
	}
	
	public void listaLivros() {
		if (livro.isEmpty()) {
			System.out.println("A loja não tem livros no seu estoque.");
		
		} else {
			System.out.println("A loja " + getNome()+" possui estes livros para venda: ");
			for(Livro l: livro) {				
				System.out.println("Titulo: "+l.getNome()+", preço: "+l.getPreco()
				+" quantidade: "+ l.getQtd()+ " em estoque");				
			}
		}
	}
	
	public void listaVideoGame() {
		if (videoGame.isEmpty()) {
			System.out.println("A loja não tem video-games no seu estoque.");
		
		} else {
			System.out.println("A loja " + getNome()+" possui estes video-games para venda: ");
			for(VideoGame v: videoGame) {
				System.out.println("Video-game: "+v.getModelo()+ ", preço: "+ v.getPreco()
				+", quantidade: "+v.getQtd()+" em estoque");
			}
		}
		
	}
	
	public double calculaPatrimonio() {
		double patrimonio = 0;
		for (Livro l: livro){
			patrimonio += l.getPreco()*l.getQtd();
			} 
		for (VideoGame v: videoGame) {
			patrimonio += v.getPreco()*v.getQtd();
		}
		System.out.println("O patrimonio da loja: "+ getNome()+" é de R$: "+patrimonio);
		return patrimonio;
	}

}
