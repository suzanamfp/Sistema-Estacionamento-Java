package modelo;

import java.util.Date;



public class Evento {
	
	private String nome;
	private Date data;
	
	
	public Evento() {		
	}
	
	public Evento(String nome, Date data) {
		super();
		this.nome = nome;
		this.data = data;
	}


	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public String toString() {
		return "Nome do evento= " + this.nome + ", data do evento = " + this.data;
	}

}
