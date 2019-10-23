package testrestassured.auth;

import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testrestassured.AbstractTest;
import testrestassured.AuthUserFactory;

import static org.hamcrest.Matchers.equalTo;

public class AuthTest extends AbstractTest {


    @Test
    @Tag("POST")
    @DisplayName("Авторизация с валидными данными")
    public void loginSuccess() {
        RestAssured.given(requestSpecification)
                .basePath("/api/login")
                .body(AuthUserFactory.createSuccedUser())
                .when()
                .post()
                .then()
                .statusCode(200)
                .body("token", equalTo("QpwL5tke4Pnpja7X4"));


    }

    @Test
    @Tag("POST")
    @DisplayName("Авторизация с невалидными данными")
    public void loginError() {
        RestAssured.given(requestSpecification)
                .basePath("/api/login")
                .body(AuthUserFactory.creatUserIncorrectPassword())
                .when()
                .post()
                .then()
                .statusCode(400)
                .body("error", equalTo("Missing password"));
    }

    @Test
    @Tag("POST")
    @DisplayName("Авторизация с невалидным email")
    public void invalidEmail() {
        RestAssured.given(requestSpecification)
                .basePath("/api/login")
                .body(AuthUserFactory.creatUserIncorrectEmail())
                .when()
                .post()
                .then()
                .statusCode(400)
                .body("error", equalTo("user not found"));
    }
}
