package steps.Negociação;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import support.api.NegociacaoApi;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class NegociacaoStepsDefinitions {

    RequestSpecification request;
    Response response;
    NegociacaoApi negociacaoApi;


    @Quando("eu realizar uma consulta desta operação")
    public void euRealizarUmaConsultaDestaOperação() {

        negociacaoApi.realizarConsultaDaOperacao();
    }

    @Entao("os dados da operação devem ser exibidos")
    public void osDadosDaOperaçãoDevemSerExibidos() {

        negociacaoApi.validarInformaçõesDeNegociacao();
    }

    @Entao("deve ser retornado o status code duzentos")
    public void deveSerRetornadoOStatusCodeDuzentos() {

        negociacaoApi.validarStatusSucesso();
    }

    @Entao("os dados do contrato foram retornados com sucesso")
    public void osDadosDoContratoForamRetornadosComSucesso() {

       negociacaoApi.validarContratonegociacao();
    }

    @Dado("que existe uma operação com os dados {string}, {string}, {string}, {string}")
    public void queExisteUmaOperaçãoComOsDados (String nuEc, String nuOperacao, String dataInicio, String dataFim) {
        negociacaoApi  = new NegociacaoApi();
        negociacaoApi.prepararDadosDaOperacaoParametrizado(nuEc,nuOperacao,dataInicio, dataFim);

    }
}