package controle;

import java.util.ArrayList;//ArrayLista � uma extens�o de List (tem algo a mais)
import java.util.List;

import modelo.Aluno;
import modelo.Curso;
import modelo.Evento;
import modelo.Funcionario;
import modelo.Login;
import modelo.Ocorrencia;
import modelo.Vaga;
import modelo.Veiculo;

public class BaseDados {

	private List<Vaga> vagasCarro = new ArrayList<Vaga>(); 
	private List<Vaga> vagasMoto = new ArrayList<Vaga>(); 
	private List<Vaga> vagasOnibus = new ArrayList<Vaga>(); 
	private List<Ocorrencia> ocorrencias = new ArrayList<Ocorrencia>();
	public static final String INOVAIESP = "INOVA IESP";
	
	public static List<Curso> listaCurso = new ArrayList<Curso> (); //static por que os dados ser�o guardados em mem�ria e poder�o ser acessados depois. Esta List serve para armazenar(guardar) os cursos(objeto) na classe BancoDados.
	private static int idCurso = 0;
	
	// Construtor vazio, porque so serve para representar os dados desta classe, ele � inacess�vel.
	public BaseDados() {	
	}
	
	//m�todo simples para id curso
	public static int proximoIdCurso() {
		idCurso = idCurso + 1;
		return idCurso;
	}
	
	//Criando lista de alunos
	public static List<Aluno> listaAluno = new ArrayList<Aluno> (); 
	private static int alunoMatricula=0;
	
	
	public static int proximaMatriculaAluno() {
		alunoMatricula = alunoMatricula +1;
		return alunoMatricula;	
	}
	
	//Criando lista de ve�culos
		public static List<Veiculo> listaVeiculo = new ArrayList<Veiculo> (); 
		private static int idVeiculo=0;
		
		
		public static int proximoIdVeiculo() {
			idVeiculo = idVeiculo +1;
			return idVeiculo;	
		}
		
		// Criando vagas
		public List<Vaga> retornaLista(String tipoVaga) {
			String tipoVagaMinusculo = tipoVaga.toLowerCase();
			if (tipoVagaMinusculo.equals("c")) {
				return vagasCarro;
			}
			
			
			else if (tipoVagaMinusculo.equals("m")) {
				return vagasMoto;
			}
			
			else if (tipoVagaMinusculo.equals("o")) {
				return vagasOnibus;
			}
			
			else {
				return null;
			}
		}
		
		public void adicionarVagas(String tipoVaga, int numeroVagas) {
			
			List<Vaga> lista = retornaLista(tipoVaga);
			int numeroElementos = lista.size();
			for (int i = 0; i < numeroVagas; i++ ) {
				Vaga vaga = new Vaga(numeroElementos); 
				lista.add(numeroElementos++, vaga);
			}
		}
		
		public void alteraVaga(int numeroVaga, Vaga vaga, String tipoVaga) {
			
			List<Vaga> lista = retornaLista(tipoVaga);
			lista.set(numeroVaga, vaga);
			
		}
		
		public Vaga retornaVaga(int numeroVaga, String tipoVaga) {
			
			List<Vaga> lista = retornaLista(tipoVaga);
			Vaga retorno = lista.get(numeroVaga);
			return retorno;
		}
		
		
		public void adicionarOcorrencia(Ocorrencia ocorrencia) {
			
			
			int numeroElementos = ocorrencias.size();
			ocorrencia.setId(numeroElementos);
			ocorrencias.add(ocorrencia);
		}
		
		
		public List<Ocorrencia> retornaOcorrencias(){
			return ocorrencias;
		}
	
		// Criando lista para eventos
		public static List<Evento> listaEventos = new ArrayList<Evento> (); 
			private static String nomeEvento;
			
			
		public static String proximoNomeEvento() {
				nomeEvento = nomeEvento +1;
				return nomeEvento;
			}
			
		// Registrando logins
		public static List<Login> listaLogin = new ArrayList<Login> (); 
		private static String usuarioEvento;
		
		
		public static String proximoLogin() {
			usuarioEvento = usuarioEvento +1;
			return usuarioEvento;
		}
		
		// Criando lista de Funcion�rios
		public static List<Funcionario> listaFuncionario = new ArrayList<Funcionario> (); 
		private static int matriculaEvento=0;
		
		
		public static int proximoFuncionario() {
			matriculaEvento = matriculaEvento +1;
			return matriculaEvento;
		}
		
		

		
	}

