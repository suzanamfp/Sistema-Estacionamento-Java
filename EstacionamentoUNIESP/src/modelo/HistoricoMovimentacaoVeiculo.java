package modelo;

import java.util.Date;

public class HistoricoMovimentacaoVeiculo {
	
	private Date horaEntrada;
	private Date horaSaida;
	private Date dataEntrada;
	private Date dataSaida;
	
	public HistoricoMovimentacaoVeiculo ( ) {
		
	}

	public Date getHoraEntrada() {
		return horaEntrada;			
	}
	public Date getHoraSaida() {
		return horaSaida;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public Date getDataSaida() {
		return dataSaida;
	}

	public void setHoraEntrada(Date horaEntrada) {
		this.horaEntrada = horaEntrada;
	}
	public void setHoraSaida(Date horaSaida) {
		this.horaSaida = horaSaida;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public void setDataSaida(Date dataSaida) {
		this.dataSaida = dataSaida;
	}
	
	
	public String toString() {
		return "\n Data de entrada do ve�culo:" + this.dataEntrada + ",\n Data de sa�da do ve�culo:" + this.dataSaida + ",\n Hora de entrada do ve�culo:" + this.horaEntrada + ",\n Hora de sa�da do ve�culo:" + this.horaSaida;
	}
	




}

