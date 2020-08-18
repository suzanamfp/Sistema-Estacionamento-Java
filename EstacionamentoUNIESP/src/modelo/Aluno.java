package modelo;

public class Aluno {
	
	//Abstraindo o objeto Aluno
	
	private String alunoNome;
	private int alunoMatricula;
	private Curso curso; //Este atributo � essencial para ser aluno, cada aluno pertence a um curso. A classe Curso foi criada para se fazer a lista de cursos aos quais os alunos pertencem.
	private String areaEspecial;
	private Veiculo veiculo; //Cada aluno poder� ter um ve�culo para ser cadastrado. A classe Veiculo foi criada para listar todos os ve�culos que ser�o cadastrados.
	
	public Aluno () {
		
	}
	
	public Aluno(String alunoNome, int alunoMatricula, Curso curso, String areaEspecial, Veiculo veiculo) {
		super();
		this.alunoNome = alunoNome;
		this.alunoMatricula = alunoMatricula;
		this.curso = curso;
		this.areaEspecial = areaEspecial;
		this.veiculo = veiculo;
	}




	public String getAlunoNome() {
		return alunoNome;			
	}
	public void setAlunoNome(String alunoNome) {
		this.alunoNome = alunoNome;
	}
	public int getAlunoMatricula() {
		return alunoMatricula;
	}
	public void setAlunoMatricula(int alunoMatricula) {
		this.alunoMatricula = alunoMatricula;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
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
		return "\n Nome do aluno:" + this.alunoNome + ",\n Matricula do aluno:" + this.alunoMatricula + ",\n Curso:" + this.curso + ",\n �rea Especial:" + this.areaEspecial + ", \n  Ve�culo do aluno:" + this.veiculo;
	}

	


}


