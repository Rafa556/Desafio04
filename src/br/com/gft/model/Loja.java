package br.com.gft.model;

import java.util.List;

public class Loja {
	
	private String nome;
	private String cnpj;
	private List <Livro> livros;
	private List<VideoGame> videoGame;
	
	
	public Loja(String nome, String cnpj, List <Livro> livros, List<VideoGame> videoGame) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGame = videoGame;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpg() {
		return cnpj;
	}

	public void setCnpg(String cnpg) {
		this.cnpj = cnpg;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGame() {
		return videoGame;
	}

	public void setVideoGame(List<VideoGame> videoGame) {
		this.videoGame = videoGame;
	}
	
	public void listaLivros() {
		for (Livro livro : livros) {
			System.out.println("Titulo: "+ livro.getNome() + ", Preço: " + livro.getPreco() + ", Quantidade: " + livro.getQnt() + "em estoque");
		}
		System.out.println("-----------------------------------------------------------------");
	}
	
	public void listaVideoGame() {
		
		for (VideoGame games: videoGame) {
			System.out.println();
		}
			
		
	}
	
	public void calculaPatrimonio() {
		
	}
	
}
