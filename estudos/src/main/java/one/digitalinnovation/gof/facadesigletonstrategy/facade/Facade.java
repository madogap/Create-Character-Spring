package one.digitalinnovation.gof.facadesigletonstrategy.facade;

import one.digitalinnovation.gof.subsistema.crm.CrmService;
import one.digitalinnovation.gof.subsistemacep.cep.CepApi;

/**
 * PADRAO ESTRUTURAL
 * Prover uma interface que reduza a complexidade nas integracoes com subsistemas
 * 
 * 
 * 
 * */

public class Facade {
	public void migrarCliente(String nome, String cep) {
		String cidade = CepApi.getInstancia().recuperarCidade(cep);
		String estado = CepApi.getInstancia().recuperarEstado(cep); 
		CrmService.gravarCliente(nome, cep, cidade, estado);
	}
}
