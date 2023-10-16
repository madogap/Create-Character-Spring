package one.digitalinnovation.gof.subsistemacep.cep;

public class CepApi {
    private static CepApi instancia = new CepApi();
	
	public CepApi() {
		super();
	}
	public static CepApi getInstancia() {
		return instancia;
	}
	public String recuperarCidade(String cep) {
		return "Olinda";
	}
	public String recuperarEstado(String cep) {
		return "Pernambuco";
	}	
}

