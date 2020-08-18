package modelo;

import java.util.Date;

public class Ocorrencia {
	
	private String categoria;
	private Date data;
	private String titulo;
	private String ocorrencia;
	private String funcionario;
	private int id;
	
	
	public Ocorrencia(String categoria, String titulo,String ocorrencia, String funcionario) {
		this.categoria = categoria;
		this.titulo = titulo;
		this.ocorrencia = ocorrencia;
		this.funcionario = funcionario;
		this.data = new Date();
		
	}


	public String getCategoria() {
		return categoria;
	}


	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}


	public Date getData() {
		return data;
	}


	public void setData(Date data) {
		this.data = data;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getOcorrencia() {
		return ocorrencia;
	}


	public void setOcorrencia(String ocorrencia) {
		this.ocorrencia = ocorrencia;
	}


	public String getFuncionario() {
		return funcionario;
	}


	public void setFuncionario(String funcionario) {
		this.funcionario = funcionario;
	}
	
	
	public int getId() {
		return id;
		
	}
	
	public void setId(int id) {
		this.id = id;
	}


	
	public String toString() {
		return "\nTitulo: " + titulo + " \ndata: " + data +  "\nOcorrência: "
				+ ocorrencia + "\nFuncionario: " + funcionario;
	}
	
	
	
	


}
