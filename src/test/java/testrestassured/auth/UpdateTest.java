package testrestassured.auth;

import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testrestassured.AbstractTest;
import testrestassured.url.user.UserResource;

import static org.hamcrest.collection.IsMapContaining.hasKey;
import static org.hamcrest.core.IsEqual.equalTo;

public class UpdateTest extends AbstractTest {

    @Test
    @Tag("PUT")
    @DisplayName("Обновление данных PUT")
    public void updatePut() {
        RestAssured.given(requestSpecification)
                .basePath(UserResource.UPDATE_USER_PATH)
                .body("{\"name\":\"morpheus\", \"job\": \"zion resident\"}")
                .when()
                .put()
                .then()
                .statusCode(200)
                .body("$", hasKey("updatedAt"));

    }

    @Test
    @Tag("PUT")
    @DisplayName("Обновление данных PATCH")
    public void updatePatch() {
        RestAssured.given(requestSpecification)
                .basePath(UserResource.UPDATE_USER_PATH)
                .body("{\"name\":\"morpheus\", \"job\": \"zion resident\"}")
                .when()
                .patch()
                .then()
                .statusCode(200)
                .body("$", hasKey("updatedAt"));

    }
}
