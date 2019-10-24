package testrestassured.auth;

import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testrestassured.AbstractTest;
import testrestassured.CreateFactory;


public class DeleteTest extends AbstractTest {
    @Test
    @Tag("DELETE")
    @DisplayName("Удаление пользователя")
    public void loginSuccess() {
        RestAssured.given(requestSpecification)
                .basePath("/api/users/2")
                .body(CreateFactory.createUser())
                .when()
                .delete()
                .then()
                .statusCode(204);
    }
}
