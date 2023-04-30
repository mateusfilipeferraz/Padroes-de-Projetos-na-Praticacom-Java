
package one.digitalinovation.gof;

/**
 *Singleton "Apressado".
 * @author Mateus Ferraz
 */
public class SingletonEager {

    private static final SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        
    }

    public static SingletonEager getInstancia() {
        return instancia;
    }
}
