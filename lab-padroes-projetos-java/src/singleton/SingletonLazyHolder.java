package one.digitalinovation.gof;

/**
 * Singleton "Lazy Holder". 
 * @author falvojr
 */
public class SingletonLazyHolder {

	private static class InstanceHolder {
		public static SingletonLazyHolder instancia = new SingletonLazyHolder();
	}
	
	private SingletonLazyHolder() {
		
	}
	
	public static SingletonLazyHolder getInstancia() {
		return InstanceHolder.instancia;
	}
}
