package testrestassured.auth;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
import testrestassured.AbstractTest;
import testrestassured.AuthUserFactory;

import static org.hamcrest.Matchers.equalTo;

public class AuthTest extends AbstractTest {


    @Test
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
