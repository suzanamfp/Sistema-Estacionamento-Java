package modelo;

public class Curso {
	
	private String nome;
	private int id; //Representa��o de valor �nico para cada registro de cada curso.
	
	public Curso() {
		 
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String toString () {
		return "\n Nome do curso:" + this.nome +  ",\n Id do curso:" + this.id;
		
	}
	
	
	
	
	
	
	
	
	
	
}
