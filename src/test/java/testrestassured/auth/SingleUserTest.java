package testrestassured.auth;

import io.restassured.RestAssured;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import testrestassured.AbstractTest;


import static org.hamcrest.core.IsEqual.equalTo;


public class SingleUserTest extends AbstractTest {

    @Test
    @Tag("GET")
    @DisplayName("Получение информации о пользователе")
    public void singleUserGerInformation() {
        RestAssured.given(requestSpecification)
                .basePath("/api/users/2")
                .when()
                .get()
                .then()
                .statusCode(200)
                .body("data.id", equalTo(2))
                .body("data.email", equalTo("janet.weaver@reqres.in"))
                .body("data.first_name", equalTo("Janet"))
                .body("data.last_name", equalTo("Weaver"))
                .body("data.avatar", equalTo("https://s3.amazonaws.com/uifaces/faces/twitter/josephstein/128.jpg"));
    }

    @Test
    @Tag("GET")
    @DisplayName("Пользователь не найден")
    public void singleUserNotFound() {
        RestAssured.given(requestSpecification)
                .basePath("/api/users/23")
                .when()
                .get()
                .then()
                .statusCode(404);

    }
}



