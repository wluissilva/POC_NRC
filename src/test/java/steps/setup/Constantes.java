package steps.setup;

import io.restassured.http.ContentType;

public interface Constantes {

     String APP_BASE_URL = "http://localhost";
     Integer APP_PORT = 8080;
     String APP_BASE_PATH = "/api/v1/nrc";

    ContentType APP_CONTENT_TYPE = ContentType.JSON;
    Long MAX_TIME_OUT = 5000L;

}
