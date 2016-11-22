package br.com.esr;


@Frete(tipo = TipoFrete.MANUAL)
public class CalculadoraFreteManual implements CalculadoraFrete{

    @Override
    public Double calcula(Double valorTotal) {
        return valorTotal * 0.2;
    }
}
