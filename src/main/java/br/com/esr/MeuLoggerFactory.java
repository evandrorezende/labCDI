package br.com.esr;


import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

public class MeuLoggerFactory {

    @Produces
    public MeuLogger criaMeuLogger(InjectionPoint ip){
        Class<?> classeComInjecao = ip.getMember().getDeclaringClass();
        return new MeuLogger(classeComInjecao);
    }
}
