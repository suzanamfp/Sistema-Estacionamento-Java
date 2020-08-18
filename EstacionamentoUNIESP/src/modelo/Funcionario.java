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
		return "Nome do funcionário =" + this.nome + ", Matrícula do funcionário=" + this.matricula + ", Permissão par Área Especial=" + this.areaEspecial
				+ ", Veículo =" + this.veiculo;
	}


	

	}

	

