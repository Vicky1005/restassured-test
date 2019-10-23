package testrestassured.auth;

import io.qameta.allure.Attachment;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testrestassured.AbstractTest;
import testrestassured.CreateFactory;


import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasKey;

public class CreateTest extends AbstractTest {

    @Test
    @Tag("POST")
    @DisplayName("Успешное создание пользователя")
    public void loginSuccess() {
        RestAssured.given(requestSpecification)
                .basePath("/api/users")
                .body(CreateFactory.createUser())
                .when()
                .post()
                .then()
                .statusCode(201)
                .body("name", equalTo("morpheus"))
                .body("job", equalTo("leader"))
                .body("$", hasKey("id"))
                .body("$", hasKey("createdAt"));

    }
}
