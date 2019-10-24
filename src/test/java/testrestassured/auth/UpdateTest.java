package testrestassured.auth;

import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testrestassured.AbstractTest;

import static org.hamcrest.collection.IsMapContaining.hasKey;
import static org.hamcrest.core.IsEqual.equalTo;

public class UpdateTest extends AbstractTest {


    @Test
    @Tag("PUT")
    @DisplayName("Обновление данных PUT")
    public void updatePut() {
        RestAssured.given(requestSpecification)
                .basePath("/api/users/2")
                .when()
                .put()
                .then()
                .statusCode(200)
                .body("name", equalTo("morpheus"))
                .body("job", equalTo("zion resident"))
                .body("$", hasKey("updatedAt"));

    }

    @Test
    @Tag("PUT")
    @DisplayName("Обновление данных PATCH")
    public void updatePatch() {
        RestAssured.given(requestSpecification)
                .basePath("/api/users/2")
                .when()
                .patch()
                .then()
                .statusCode(200)
                .body("name", equalTo("morpheus"))
                .body("job", equalTo("zion resident"))
                .body("$", hasKey("updatedAt"));

    }
}
