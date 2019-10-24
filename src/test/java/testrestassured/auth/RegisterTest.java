package testrestassured.auth;

import io.restassured.RestAssured;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testrestassured.AbstractTest;
import testrestassured.RegisterFactory;

import static org.hamcrest.Matchers.equalTo;

public class RegisterTest extends AbstractTest {


    @Test
    @Tag("POST")
    @DisplayName("Успешная регистрация")
    public void registerSuccess() {
        RestAssured.given(requestSpecification)
                .basePath("/api/register")
                .body(RegisterFactory.successfulRegister())
                .when()
                .post()
                .then()
                .statusCode(200)
                .body("id", equalTo(4))
                .body("token", equalTo("QpwL5tke4Pnpja7X4"));
    }


    @Test
    @Tag("POST")
    @DisplayName("Неуспешная регистрация")
    public void registerUnsuccess() {
        RestAssured.given(requestSpecification)
                .basePath("/api/register")
                .body(RegisterFactory.unsuccessfulRegister())
                .when()
                .post()
                .then()
                .statusCode(400)
                .body("error", equalTo("Missing password"));

    }
}
