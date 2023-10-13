package one.digitalinnovation.gof.facadesigletonstrategy.singleton;

/**
 * PADRAO CRIACIONAL
 * @Author mado devagar Lazy Holder
 * 
 * Permite a criacao de uma unica instancia de uma classe 
 * e fornecer um modo para recupera-la
 * 
 * 
 * */

public class SingletonLazyHolder {
	private static class IntanceHolder{
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	public SingletonLazyHolder() {
		super();
	}
	public static SingletonLazyHolder getInstancia() {
		return IntanceHolder.instancia;
	}
}