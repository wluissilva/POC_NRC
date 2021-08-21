package steps.Negociação;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class NegociacaoStepsDefinitions {

    RequestSpecification request;
    Response response;

    @Dado("que existe uma operação NRC")
    public void queExisteUmaOperaçãoNRC() {

    request = given()
                .header("nuEC", "2005190360")
                .queryParam("cdOperationContract", "474861")
                .queryParam("startDate", "2021-04-24")
                .queryParam("endDate", "2021-04-30")
                .log().all();
    }

    @Quando("eu realizar uma consulta desta operação")
    public void euRealizarUmaConsultaDestaOperação() {
    response = request
                .when()
                    .get("/operation");
    }
    @Entao("os dados da operação devem ser exibidos")
    public void osDadosDaOperaçãoDevemSerExibidos() {
        response
            .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .body("items[0].cdOperationContract", is(474861))
                .body("items[0].nuCpfCnpjTitular", is("85008288"));

    }

    @Entao("deve ser retornado o status code duzentos")
    public void deveSerRetornadoOStatusCodeDuzentos() {
        response
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK);
    }

    @Entao("os dados do contrato foram retornados com sucesso")
    public void osDadosDoContratoForamRetornadosComSucesso() {
        response
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("schemas/Negociacao.json"));
    }
}