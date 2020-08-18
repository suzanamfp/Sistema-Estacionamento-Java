package modelo;

public enum TipoVeiculo {
	
	//Lista com quantidade fechada (5) de tipos de ve�culos, serve para determinar qual o tipo de ve�culos que irei cadastrar.
	CONVENCIONAL(1,"Convencional"), 
	MOTO(2, "Moto"), 
	PICKUP(3,"PickUp"),
	VAN(4, "Van"), 
	ONIBUS(5, "�nibus");
	
	private int codigo; //N�meros que representam cada tipo de ve�culo
	private String descricao; //Mostrar� ao usu�rio o tipo de ve�culo de forma mais apresent�vel. 
	
	private TipoVeiculo (int codigo, String descricao) {
		this.codigo = codigo;
		this.descricao= descricao;
	}

	// Neste caso n�o precisarei setar(apontar nenhum valor, pois eles j� tem seu pr�prio valor, quero apenas pegar(get) os valores de cada um.
	public int getCodigo() {
		return codigo;
	}

	public String getDescricao() {
		return descricao;
	}

	public String toString () {
		return "\n Codigo do tipo do ve�culo:" + this.codigo +  ",\n Tipo do ve�culo:" + this.descricao;
		
	}
	
}
