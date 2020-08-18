package visao;

import java.util.Scanner;

import controle.AlunoEventos;
import controle.CursoEventos;
import controle.VagaEventos;
import controle.VeiculoEventos;
import modelo.Login;
import modelo.Aluno;
import modelo.Curso;
import modelo.TipoVeiculo;
import modelo.Veiculo;
import modelo.Evento;
import modelo.Funcionario;
import controle.EventoEvento;
import controle.LoginEvento;
import controle.EventoFuncionario;

import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;



public class Principal {
	
	static VagaEventos controleVagas = new VagaEventos();

	private static void principalVagas() {
		
		
		Scanner teclado = new Scanner(System.in);
		String tipoVeiculo, placa;
		int numeroVaga, opcao, quantVagas;
		boolean executar = true;
		
		while(executar) {
			System.out.println("1. Ocupar vaga ");
			System.out.println("2. Liberar vaga ");
			System.out.println("3. Criar vagas ");
			System.out.println("4. Listar vagas ");
			System.out.println("5. Sair ");
			
			System.out.print("Escolha uma op��o: " );
			opcao = Integer.valueOf(teclado.nextLine().trim());
			
			VeiculoEventos ve = new VeiculoEventos();
			EventoEvento ee = new EventoEvento();
			
			switch(opcao) {
				case 1:
					System.out.print("Informe o tipo de ve�culo: ");
					tipoVeiculo = teclado.nextLine();
					System.out.print("Informe a placa do ve�culo: ");
					placa = teclado.nextLine();
					System.out.print("Informe o n�mero da vaga: ");
					numeroVaga = Integer.valueOf(teclado.nextLine().trim());
					if ((!ee. entradaLivreVeiculo()) && (!ve.consultaVeiculoPorPlaca(placa)) ) { //"!" serve para negar o que � verdadeiro
						System.out.println("Ve�culo n�o cadastrado!");	
					}
					else{
						try {
							controleVagas.ocupaVaga(placa, numeroVaga, tipoVeiculo);
							System.out.println("Vaga ocupada");
						}  catch(Exception e) {
							System.out.println(e); 
						}
					}
						
					break;
				case 2: 
					System.out.print("Informe o tipo de ve�culo: ");
					tipoVeiculo = teclado.nextLine();
					System.out.print("Informe o n�mero da vaga: ");
					numeroVaga = Integer.valueOf(teclado.nextLine().trim());
					
					try {
						controleVagas.liberarVaga(numeroVaga, tipoVeiculo);
						System.out.println("Vaga liberada");
					}  catch(Exception e) {
						System.out.println(e);
					}
					break;
				case 3:
					System.out.print("Criar quantas vagas: ");
					quantVagas = Integer.valueOf(teclado.nextLine().trim());
					System.out.print("Qual tipo de vaga: ");
					tipoVeiculo = teclado.nextLine();
					
					try {
						controleVagas.criarVagas(tipoVeiculo, quantVagas);
						System.out.println("Vagas criadas");
					}  catch(Exception e) {
						System.out.println(e);
					}
					break;
					
				case 4:
					System.out.print("Tipo de vagas: ");
					tipoVeiculo = teclado.nextLine();
					
					try {
						String saida;
						saida = controleVagas.listarVagas(tipoVeiculo);
						System.out.println(saida);
					}  catch(Exception e) {
						System.out.println(e);
					}
					break;
					
					
				case 5:
					executar = false;
					break;
				default:
					System.out.print("op��o invalida");
					break;
			 }
		}
	}	
		
		private static void principalAluno() {
			Scanner teclado = new Scanner(System.in);
			
			while(true) {

			System.out.println("1. Cadastrar um Aluno");
			System.out.println("2. Sair");

			System.out.print("Escolha uma op��o: " );
			int opcao = Integer.valueOf(teclado.nextLine().trim());
			
			AlunoEventos ae = new AlunoEventos();
			CursoEventos ce = new CursoEventos();
			VeiculoEventos ve = new VeiculoEventos();
			
			if (opcao == 1) {
			System.out.println("Nome do Aluno: ");//Campo do nome do aluno
			String nomeAluno = teclado.nextLine().trim();
			System.out.print("Matricula do Aluno: " );//Campo da matricula do aluno 
			int alunoMatricula = Integer.valueOf(teclado.nextLine().trim());
			System.out.println("");
			System.out.print("Vaga especial: " ); //Campo para identifica��o de vaga especial
			String areaEspecial = teclado.nextLine().trim();
			System.out.print("Curso do Aluno: " );//Campo para escolha do curso
			Aluno aluno = new Aluno ();
			for(Curso curso: ce.listarCurso()) {
				System.out.println("Id: " + String.valueOf(curso.getId()) + " Nome: " + curso.getNome());
			}
			System.out.print("Digite o Id do curso: " );//Campo do Id do curso digitado 
			int id = Integer.valueOf(teclado.nextLine().trim());
			Curso curso = new Curso ();
			for(Curso curso2: ce.listarCurso()) {//Varrendo a lista curso para comprar se o Id digitado corresponde ao Id do curso ja cadastrado anteriormente.
				if(id == curso.getId()){
					curso.setId(id);
				}
			}
			System.out.print("Digite a placa do carro: " );//Campo para escolha do curso
			String placa = teclado.nextLine().trim();
			for(Veiculo veiculo: ve.listarVeiculo()) {//Varrendo a lista veiculo para saber se o ve�culo j� est� cadastrado.
				if(placa == veiculo.getPlaca()){
					aluno.setVeiculo(veiculo);
					break;
				}
			}

			aluno.setAlunoNome(nomeAluno);
			aluno.setAlunoMatricula(alunoMatricula);
			aluno.setAreaEspecial(areaEspecial);
			ae.cadastrarAluno(aluno);
			System.out.println("Aluno Cadastrado!");
		
		}else if (opcao == 2) {
			System.out.println("Sair!");
			}
		}	
		}
		
		private static void principalLogin() {
			Scanner teclado = new Scanner(System.in);
			
			while(true) {

			System.out.println("1. Realizar Login");
			System.out.println("2. Sair");
			
			System.out.print("Escolha uma op��o: " );
			int opcao = Integer.valueOf(teclado.nextLine().trim());
			
			LoginEvento le = new LoginEvento();
			
			if(opcao==1) { 
				System.out.println("");
				System.out.print("Usu�rio: " );
				String nomeUsuario = teclado.nextLine().trim();
				System.out.print("Senha: " );
				int senha = Integer.valueOf(teclado.nextLine().trim());
				Login login = new Login();
				login.setUsuario(nomeUsuario);
				login.setSenha(senha);
				le.cadastrarLogin(login);
				
				System.out.println("Acesso permitido!");
			} else if(opcao==2) {
				System.out.println("Sair!");
				break;
				}
		    }
			}
			
		private static void principalCurso() {
			Scanner teclado = new Scanner(System.in);

				while(true) {

				System.out.println("1. Cadastrar um Curso");
				System.out.println("2. Listar curso");
				System.out.println("2. Sair");
				
				System.out.print("Escolha uma op��o: " );
				int opcao = Integer.valueOf(teclado.nextLine().trim());
				
				CursoEventos ce = new CursoEventos();
				if(opcao==1) {
					System.out.println("");
					System.out.print("Nome do Curso: " );
					String nomeCurso = teclado.nextLine().trim();
					Curso  curso     = new Curso();
					curso.setNome(nomeCurso);
					ce.cadastrarCurso(curso);
					System.out.println("Curso Cadastrado!");
						
				} else if(opcao==2) {
					System.out.println("");
					for(Curso curso: ce.listarCurso()) {
						System.out.println("Id: " + String.valueOf(curso.getId()) + " Nome: " + curso.getNome());
					}
					
				} else if(opcao==3) {
					System.out.println("Sair!");
					break;
					}	
				}
				}
		
		private static void principalFuncionario() {
			Scanner teclado = new Scanner(System.in);
			
			while(true) {

			System.out.println("1. Cadastrar um Funcionario");
			System.out.println("2. Sair");
			
			System.out.print("Escolha uma op��o: " );
			int opcao = Integer.valueOf(teclado.nextLine().trim());
			
			EventoFuncionario fu = new EventoFuncionario();
			
			
			if (opcao==1) {
			System.out.println("");
			System.out.println("Nome do Funcion�rio: "); 
			String nomeFuncionario = teclado.nextLine().trim();
			System.out.print("Matricula do Funcion�rio: " );
			int matriculaFuncionario = Integer.valueOf(teclado.nextLine().trim());
			System.out.println("");
			Funcionario funcionario = new Funcionario();
			funcionario.setNome(nomeFuncionario);
			funcionario.setMatricula(matriculaFuncionario);
			fu.cadastrarFuncionario(funcionario);
			
			System.out.println("Funcion�rio cadastrado!");
			
			}else if(opcao==2) {
				System.out.println("Sair!");
				break;
				}
			}
		    }
		
		private static void principalVeiculo() {
			Scanner teclado = new Scanner(System.in);
			
			while(true) {

			System.out.println("1. Cadastrar um Ve�culo");
			System.out.println("2. Listar ve�culo");
			System.out.println("3. Sair!");
			
			System.out.print("Escolha uma op��o: " );
			int opcao = Integer.valueOf(teclado.nextLine().trim());
			
			VeiculoEventos  ve = new VeiculoEventos();
			
			if(opcao==1) {
				System.out.println("");
				System.out.println("Digite a placa do ve�culo: ");//Campo para placa do ve�culo
				String placa = teclado.nextLine().trim();
				Veiculo veiculo     = new Veiculo();
				veiculo.setPlaca(placa);
				ve.cadastrarVeiculo(veiculo);
				System.out.println("Escolha o tipo do ve�culo: ");
				for (TipoVeiculo tipoVeiculo : TipoVeiculo.values()) {// la�o para chamar a lista dos tipos de ve�culo
					System.out.println(String.valueOf(tipoVeiculo.getCodigo()) + ". "  + tipoVeiculo.getDescricao());
				}			
				System.out.print("Digite o Codigo do tipo do ve�culo: " );//Campo para digitar o c�digo do tipo do ve�culo.
				int cod = Integer.valueOf(teclado.nextLine().trim());

				for (TipoVeiculo tipoVeiculo: TipoVeiculo.values()) { //Varrendo a lista TipoVe�culo
					if(cod == tipoVeiculo.getCodigo()){
						veiculo.setTipoVeiculo(tipoVeiculo);
					}
				}
			}else if(opcao==2) {
				System.out.println("");
				for(Veiculo veiculo: ve.listarVeiculo()) {
					System.out.println("Placa: " + String.valueOf(veiculo.getPlaca()) + " Tipo: " + veiculo.getTipoVeiculo().getDescricao());
					}
					
				System.out.println("Ve�culo Cadastrado!");
				
			}else if(opcao==3) {
				System.out.println("Sair!");
				break;
				}
			}
			}
		
		private static void removerVeiculoPrincipal() {
			Scanner teclado = new Scanner(System.in);
			
			while(true) {

			System.out.println("1. Remover um Ve�culo");
			System.out.println("2. Sair!");
			
			System.out.print("Escolha uma op��o: " );
			int opcao = Integer.valueOf(teclado.nextLine().trim());
			
			VeiculoEventos ve = new VeiculoEventos();
			
			if (opcao==1) {
			System.out.println("");
			System.out.println("Digite a placa do ve�culo que voc� que remover: ");
			String placa = teclado.nextLine().trim();
				if(!ve.removerVeiculo(placa)){
					System.out.println("Ve�culo n�o encontrado!");
				}else {
					System.out.println("Ve�culo removido com sucesso!");
		    }
			}else if(opcao==2) {
				System.out.println("Sair!");
				}	
			}
		    }
		
		private static void principalEvento() {
			Scanner teclado = new Scanner(System.in);
			
			while(true) {

			System.out.println("1. Cadastrar um Evento");
			System.out.println("2. Listar um Evento");
			System.out.println("3. Sair");
			
			System.out.print("Escolha uma op��o: " );
			int opcao = Integer.valueOf(teclado.nextLine().trim());
			
			EventoEvento ee = new EventoEvento();
			
			if(opcao==1) {
				System.out.println("");
				System.out.println("Nome do Evento: ");//Campo para o nome do evento
				String nomeEvento = teclado.nextLine().trim();
				System.out.print("Data do Evento: " );//Campo para a data do evento
				String data = teclado.nextLine().trim();
				Evento evento = new Evento ();
				SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy"); 
				Date dataFormatada;
				try {
					dataFormatada = formatoData.parse(data);
					evento.setData(dataFormatada);
				} catch (ParseException e) {
					System.out.print("Data inv�lida");
				}
				System.out.print("Hora do Evento: " );//Campo para hora do evento
				String hora = teclado.nextLine().trim();
				SimpleDateFormat formatoHora = new SimpleDateFormat( "HH:mm" );
				Calendar horaFormatada = Calendar.getInstance();
				try {
					horaFormatada.setTime(formatoHora.parse(hora));
					
					Calendar c = Calendar.getInstance();
					c.setTime(evento.getData());
					c.set(Calendar.HOUR_OF_DAY, horaFormatada.get(Calendar.HOUR_OF_DAY));
					c.set(Calendar.MINUTE, horaFormatada.get(Calendar.MINUTE));
					c.set(Calendar.SECOND, 0);
					c.set(Calendar.MILLISECOND, 0);
					
					evento.setData(c.getTime());
					
				} catch (ParseException e) {
					System.out.print("Hora inv�lida");
				}
				
				evento.setNome(nomeEvento);
				ee.cadastrarEvento(evento);
				System.out.println("Evento Cadastrado!");
				System.out.println("");
				
			}else if(opcao==2){
				System.out.println("");
					for(Evento evento: ee.listarEventos()) {
						System.out.println("Nome do evento: " + String.valueOf(evento.getNome()) + " Data: " + evento.getData());
						}
			} else if (opcao==3){
				System.out.println("Sair!");
					break;
				} 
			}
		    }
		
 

	public static void main (String[] args)  {

		////////////////////////////Menu de acesso ////////////////////////////////
		
		Scanner teclado = new Scanner(System.in);

		while(true) {
			
		
			System.out.println("1. Gestor");
			System.out.println("2. Funcionario RH");
			System.out.println("3. Funcion�rio Estacionamento");
			System.out.println("4. Sair");

			System.out.print("Escolha uma op��o: " );
			int opcaoAcesso = Integer.valueOf(teclado.nextLine().trim());

			String voltar = ("");
			
			if (opcaoAcesso == 1) {// op��es para o gestor
				 while(true) {
					 
				System.out.println("1. Fazer login");
				System.out.println("2. Monitorar estacionamento");
				System.out.println("3. Visualizar relat�rios");
				System.out.println("4. Criar �reas especiais");
				System.out.println("5. Cadastrar Evento");
				System.out.println("6. Sair");

				System.out.print("Escolha uma op��o: " );
				int gestor = Integer.valueOf(teclado.nextLine().trim());


				if(gestor==1) { // Fun��o do Login 
					principalLogin();	
				}else if(gestor==2) {//Fun��o para Monitorar vagas do estacionamento
					principalVagas();
				}else if (gestor==3) {//Fun��o para vizualizar relat�rios 
					//(FALTA)
				}else if (gestor==4) {//Fun��o para criar �reas especiais
					//(FALTA)
				}else if (gestor==5) {//Fun��o para cadastrar eventos
					principalEvento();
				}else if(gestor==6){
					System.out.println("Sair!");
					break;
				}
				}
			} else if (opcaoAcesso == 2) {// op��es para o Funcion�rio do RH
				 while(true) {
					System.out.println("1. Fazer login");
					System.out.println("2. Cadastrar Funcion�rio");
					System.out.println("3. Permitir acesso de �reas especiais");
					System.out.println("4. Sair");

					System.out.print("Escolha uma op��o: " );
					int funRH = Integer.valueOf(teclado.nextLine().trim());
					

					if(funRH==1) { //Login do Login 
						principalLogin();	
					}else if(funRH==2) {//Cadastro de Funcion�rio
						principalFuncionario();
					}else if(funRH==3) {//Acesso a �reas especiais
						//(FALTA)	
					} else if(funRH==4){
						System.out.println("Sair!");
						break;
					}		
				}
			} else if (opcaoAcesso == 3) {// op��es para o Funcion�rio do Estacionamento
				   while(true) {
				
					System.out.println("1. Fazer Login");
					System.out.println("2. Cadastrar Ve�culo");
					System.out.println("3. Remover Ve�culo");
					System.out.println("4. Cadastar Aluno");
					System.out.println("5. Cadastrar Curso");
					System.out.println("6. Monitorar Estacionamento");
					System.out.println("7. Cadastrar Ocorrencia");
					System.out.println("8. Cadastrar Eventos");
					
					System.out.println("9. Sair");
					

					System.out.print("Escolha uma op��o: " );
					int funEstacionamento = Integer.valueOf(teclado.nextLine().trim());
					
					if(funEstacionamento==1) { //Fun��o do Login 
						principalLogin();	
					}else if(funEstacionamento==2) { //Fun��o para cadastrar Ve�culo
						principalVeiculo();
					}else if(funEstacionamento==3) { //Fun��o para remover Ve�culo
						removerVeiculoPrincipal();	
					}else if(funEstacionamento==4) { //Fun��o para Cadastrar Aluno
						principalAluno();
					}else if(funEstacionamento==5) { //Fun��o para Cadastrar Curso
						principalCurso();
					}else if(funEstacionamento==6) {//Fun��o para Monitorar vagas do estacionamento
						principalVagas();
					}else if(funEstacionamento==7) { //Fun��o para Cadastrar Ocorr�ncia
						//(FALTA)
					}else if(funEstacionamento==8) {//Fun��o para Cadastrar Eventos
						principalEvento();
					}else if(funEstacionamento==9){
						System.out.println("Sair!");
						break;
					}		
						
				}	
			}	
		}				
	}					
}				
						
						
						
						
						
						
					
					
				   
			
	 		
	