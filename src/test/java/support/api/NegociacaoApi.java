package support.api;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.apache.http.HttpStatus;
import static io.restassured.RestAssured.given;
import static io.restassured.module.jsv.JsonSchemaValidator.*;
import static org.hamcrest.Matchers.is;

public class NegociacaoApi {

    RequestSpecification request;
    Response response;
    NegociacaoApi negociacaoApi;

    public NegociacaoApi (){

    }

    public void realizarConsultaDaOperacao() {
        response = request
                    .when()
                        .get("/operation");
    }

    public void validarContratonegociacao(){
        response
                .then()
                .assertThat()
                .body(matchesJsonSchemaInClasspath("schemas/Negociacao.json"));
    }

    public void validarInformaçõesDeNegociacao(){
        response
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .body("items[0].cdOperationContract", is(474861));

    }

    public  void validarStatusSucesso(){

        response
                .then()
                .assertThat()
                .statusCode(HttpStatus.SC_OK);
    }


    public void prepararDadosDaOperacaoParametrizado(String nuEc, String nuOperacao, String dataInicio, String dataFim) {

        request = given()
                    .header("nuEC",nuEc)
                    .queryParam("cdOperationContract", nuOperacao)
                    .queryParam("startDate", dataInicio)
                    .queryParam("endDate", dataFim)
                    .log().all();

    }
}