package one.dio.gof;

import one.dio.gof.facade.Facade;
import one.dio.gof.singleton.SingletonEager;
import one.dio.gof.singleton.SingletonLazy;
import one.dio.gof.singleton.SingletonLazyHolder;
import one.dio.gof.strategy.*;

public class Test {
    public static void main(String[] args) {

        // Singleton:
        System.out.println("=== Singleton ===");

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        // Strategy
        System.out.println("\n=== Strategy ===");

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facade
        System.out.println("\n=== Facade ===");

        Facade facade = new Facade();
        facade.migrarCliente("Michele", "14801788");
    }
}
