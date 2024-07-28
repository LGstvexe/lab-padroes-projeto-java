package one.digitalinnovation.gof.Singleton;

/**
 * Singleton "Lazy Holder"
 *
 * @see <a href="https://stackoverflow.com/a/24018148">Referência Lazy Holder</a>
 *
 * @author LGstvexe
 */
public class LazyHolderSingleton {

    private static class InstanceHolder {
        public static LazyHolderSingleton instancia = new LazyHolderSingleton();
    }

    private LazyHolderSingleton() {
        super();
    }

    public static LazyHolderSingleton getInstancia() {
        return InstanceHolder.instancia;
    }


}
