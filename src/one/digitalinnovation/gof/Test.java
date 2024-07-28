package one.digitalinnovation.gof;

import one.digitalinnovation.gof.Facade.Facade;
import one.digitalinnovation.gof.Singleton.EagerSingleton;
import one.digitalinnovation.gof.Singleton.LazyHolderSingleton;
import one.digitalinnovation.gof.Singleton.LazySingleton;
import one.digitalinnovation.gof.Strategy.*;

public class Test {

    public static void main(String[] args) {

        // Singleton

        LazySingleton lazy = LazySingleton.getInstancia();
        System.out.println(lazy);
        lazy = LazySingleton.getInstancia();
        System.out.println(lazy);

        EagerSingleton eager = EagerSingleton.getInstancia();
        System.out.println(eager);
        eager = EagerSingleton.getInstancia();
        System.out.println(eager);

        LazyHolderSingleton lazyHolder = LazyHolderSingleton.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = LazyHolderSingleton.getInstancia();
        System.out.println(lazyHolder);

        // Strategy

        Comportamento padrão = new ComportamentoPadrão();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(padrão);

        robo.mover();
        robo.mover();

        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        robo.setComportamento(defensivo);
        robo.mover();

        // Facade

        Facade facade = new Facade();
        facade.migrarCliente("Gustavo", "60430372");

    }
}
