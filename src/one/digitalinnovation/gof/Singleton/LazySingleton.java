package one.digitalinnovation.gof.Singleton;

/**
 * Singleton "preguiçoso"
 *
 * @author LGstvexe
 */
public class LazySingleton {

    private static LazySingleton instancia;

    private LazySingleton() {
        super();
    }

    public static LazySingleton getInstancia() {
        if (instancia == null) {
            instancia = new LazySingleton();
        }
        return instancia;
    }


}
