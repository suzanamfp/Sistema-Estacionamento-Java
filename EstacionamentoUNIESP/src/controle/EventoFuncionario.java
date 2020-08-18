package controle;

import java.util.List;
import modelo.Funcionario;


public class EventoFuncionario{
	
	public EventoFuncionario() {
	
	}
	
	public void cadastrarFuncionario(Funcionario funcionario){
		if(funcionario!= null) {
			funcionario.setMatricula(BaseDados.proximoFuncionario());
			BaseDados.listaFuncionario.add(funcionario);
		}
	}
	
	public List<Funcionario> listarAluno(){
		return BaseDados.listaFuncionario;

	}
}
