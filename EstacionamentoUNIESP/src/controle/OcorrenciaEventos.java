package controle;

import modelo.Ocorrencia;
import java.util.List;

import modelo.Ocorrencia;
import modelo.Vaga;

public class OcorrenciaEventos {

	BaseDados base = new BaseDados();

	public void criarOcorrencia(String categoria, String titulo, String ocorrencia, String funcionario) {
		Ocorrencia novaOcorrencia = new Ocorrencia(categoria, titulo, ocorrencia, funcionario);
		base.adicionarOcorrencia(novaOcorrencia);
	}

	public String listarOcorrencias() {
		List<Ocorrencia> ocorrencias = base.retornaOcorrencias();
		String saida;
		saida = "";

		if (ocorrencias != null) {
			for (Ocorrencia ocorrencia : ocorrencias) {
				saida += ocorrencia.toString();

			}

		} else {
			throw new IllegalArgumentException("Ocorrencias inexistentes");
		}

		return saida;
	}
}
