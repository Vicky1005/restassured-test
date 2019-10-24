package testrestassured.auth;

import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testrestassured.AbstractTest;

import static org.hamcrest.Matchers.hasKey;
import static org.hamcrest.core.IsEqual.equalTo;

public class SingleResourceTest extends AbstractTest {

    @Test
    @Tag("GET")
    @DisplayName("Получение информации о ресурсе")
    public void singleUserGerInformation() {
        RestAssured.given(requestSpecification)
                .basePath("/api/unknown/2")
                .when()
                .get()
                .then()
                .statusCode(200)
                .body("data.id", equalTo(2))
                .body("data.name", equalTo("fuchsia rose"))
                .body("data.year", equalTo(2001))
                .body("data.color", equalTo("#C74375"))
                .body("data", hasKey("pantone_value"))
                .body("data.pantone_value", equalTo("17-2031"));
    }
}
