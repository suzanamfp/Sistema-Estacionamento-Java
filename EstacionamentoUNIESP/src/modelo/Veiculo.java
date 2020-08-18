package modelo;

public class Veiculo {
	
	//Abstraindo o objeto Aluno
	private String placa;
	private int id; //Representa��o de valor �nico para cada registro de cada ve�culo
	private TipoVeiculo tipoVeiculo; //O tipo do ve�culo � uma caracteristica de ve�culo.
	
	public Veiculo() {
		
	}
	
	public Veiculo(String placa, int id, TipoVeiculo tipoVeiculo) {
		this.placa = placa;
		this.id = id;
		this.tipoVeiculo = tipoVeiculo;
	}


	public String getPlaca() {
		return placa;		
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	
	
	public String toString() {
		return "\n Placa do ve�culo:" + this.placa +  ",\n Id do ve�culo:" + String.valueOf(this.id) + ",\n Tipo do ve�culo:" + this.tipoVeiculo.getDescricao();
	}

	
	
	
	
	
	
	

}
