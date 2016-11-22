package br.com.esr;

@Frete(tipo = TipoFrete.AUTOMATICO)
public class CalculadoraFreteAutomatico implements CalculadoraFrete{

    @Override
    public Double calcula(Double valorTotal) {
        return valorTotal * 0.1;
    }
}
