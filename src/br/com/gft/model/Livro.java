package br.com.gft.model;

import java.util.Set;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
	
	private String autor;
	private String tema;
	private int qntPag;
	
	public Livro(String nome, double preco, int qnt, String autor, String tema, int qntPag) {
		super(nome, preco, qnt);
		
		this.autor = autor;
		this.tema = tema;
		this.qntPag = qntPag;
	}

	public String getAutor() {
		return autor;
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

	public int getQntPag() {
		return qntPag;
	}

	public void setQntPag(int qntPag) {
		this.qntPag = qntPag;
	}

	public double calculaImposto() {
		if(this.tema == "educativo") {
			int imp =0;
			//imp = this.setPreco(getPreco()*0,1);
			
		}
		return 0;
	}
	

}
