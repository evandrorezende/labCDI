package br.com.esr;


import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/fluxo")
public class FluxoCompraServlet extends HttpServlet {

    @Inject
    private MeuLogger logger;

    @Inject @Frete(tipo = TipoFrete.AUTOMATICO)
    private CalculadoraFrete calculadoraFrete;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Iniciando o fluxo de compra...");

        Double valorTotal = 1000.0;
        Double frete = calculadoraFrete.calcula(valorTotal);
    }

}
