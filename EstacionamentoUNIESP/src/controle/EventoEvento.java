package controle;

import java.util.List; 
import modelo.Evento;
import modelo.Veiculo;

import java.util.Calendar;
import java.util.Date;

public class EventoEvento {
	
	public EventoEvento() {
		
	}
	
	public void cadastrarEvento(Evento evento) {
		if (evento != null);
			evento.setNome(BaseDados.proximoNomeEvento());
			BaseDados.listaEventos.add(evento);
	}
	
	public List<Evento> listarEventos(){
		return BaseDados.listaEventos;
	}
	
	public boolean entradaLivreVeiculo() {
		Date data = new Date(System.currentTimeMillis());//Insere a data atual sem precisar informar
		if(data!= null) {
			// Zerar a hora para garantir que os veículos só tenham acesso ao estacionamento na data exata do evento 
			Calendar c = Calendar.getInstance(); 
			c.setTime(data);
			c.set(Calendar.HOUR_OF_DAY, 0);
			c.set(Calendar.MINUTE, 0);
			c.set(Calendar.SECOND, 0);
			c.set(Calendar.MILLISECOND, 0);
			
			for(Evento evento: BaseDados.listaEventos) {
				Calendar ce = Calendar.getInstance();
				ce.setTime(evento.getData());
				ce.set(Calendar.HOUR_OF_DAY, 0);
				ce.set(Calendar.MINUTE, 0);
				ce.set(Calendar.SECOND, 0);
				ce.set(Calendar.MILLISECOND, 0);
				
				
				/*
				 * se a data for a mesma e se a hora da data de entrada for maior 
				 * que a do evento
				 */
				if (BaseDados.INOVAIESP.equals(evento.getNome()) && 
					ce.getTime().compareTo(c.getTime())==0 &&
					evento.getData().compareTo(data)<0) {// Compara a data atual com a data do evento
					return true;
				}
			}
		}
		
		return false;
		
	}
}
