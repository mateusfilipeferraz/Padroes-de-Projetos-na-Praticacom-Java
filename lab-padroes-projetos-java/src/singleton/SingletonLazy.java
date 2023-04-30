package one.digitalinovation.gof;

/**
 * Singleton"Preguiçoso".
 *
 * @author Mateus Ferraz
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();

        }
        return instancia;
    }
}
