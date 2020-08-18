package modelo;

public class Funcionario {
	
	private String nome;
	private int matricula;
	private String areaEspecial;
	private Veiculo veiculo;
	
	
	public Funcionario(String nome, int matricula, String areaEspecial, Veiculo veiculo) {
		this.nome = nome;
		this.matricula = matricula;
		this.areaEspecial = areaEspecial;
		this.veiculo = veiculo;
	}
	public Funcionario() {
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getMatricula() {
		return matricula;
	}


	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}


	public String getAreaEspecial() {
		return areaEspecial;
	}


	public void setAreaEspecial(String areaEspecial) {
		this.areaEspecial = areaEspecial;
	}


	public Veiculo getVeiculo() {
		return veiculo;
	}


	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}


	public String toString() {
		return "Nome do funcion�rio =" + this.nome + ", Matr�cula do funcion�rio=" + this.matricula + ", Permiss�o par �rea Especial=" + this.areaEspecial
				+ ", Ve�culo =" + this.veiculo;
	}


	

	}

	

