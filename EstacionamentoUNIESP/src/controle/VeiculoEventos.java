package controle;

import java.util.List;

import controle.BaseDados;

import modelo.Veiculo;


public class VeiculoEventos {
	
	//Esta classe contempla todos os métodos que envolverão a classe Veiculo.
	
	
	
	public VeiculoEventos () {
		
	}
	
	public void cadastrarVeiculo(Veiculo veiculo) {
		if(veiculo!= null) {
			veiculo.setId(BaseDados.proximoIdVeiculo());
			BaseDados.listaVeiculo.add(veiculo);
		}
	}
	
	public List<Veiculo> listarVeiculo(){
		return BaseDados.listaVeiculo;
	}
	
	public void removerVeiculo(Veiculo veiculo) {
		if(veiculo!= null) {
			//veiculo.setPlaca(BaseDados.excluirProximoVeiculo());
			BaseDados.listaVeiculo.remove(veiculo);
		}
	}

	public boolean removerVeiculo(String placa) {
		if(placa!= null && !placa.isEmpty()) {
			for(Veiculo veiculo: BaseDados.listaVeiculo) {
				if (placa.equals(veiculo.getPlaca())) {
					BaseDados.listaVeiculo.remove(veiculo);
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean consultaVeiculoPorPlaca(String placa) {
		if(placa!= null && !placa.isEmpty()) {
			for(Veiculo veiculo: BaseDados.listaVeiculo) {
				if (placa.equals(veiculo.getPlaca())) {
					return true;
				}
			}
		}
		return false;
	
		
		
	}
		
}	
	
