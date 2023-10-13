package one.digitalinnovation.gof.facadesigletonstrategy.strategy;
public class Robo {
	
	/**
	 * PADRAO COMPORTAMENTAL
	 * Simplifica a variacao de algoritmos para resolucao de um mesmo problema.
	 * 
	 * */
	
	
	private Comportamento comportamento;


	public void setStrategy(Comportamento comportamento) {
		this.comportamento = comportamento;
	}
		
	public void mover() {
		comportamento.mover();
	}
}