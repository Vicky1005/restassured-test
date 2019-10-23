package testrestassured.auth;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testrestassured.AbstractTest;
import testrestassured.CreateFactory;
import testrestassured.ListUsers;
import testrestassured.UserFactory;

import static org.hamcrest.Matchers.*;

public class ListUserTest extends AbstractTest {


    @Test
    @Tag("GET")
    @DisplayName("Получение списка пользователей")
    public void getListUser() {
        int page=1;
        ListUsers listUsers = RestAssured.given(requestSpecification)
                .basePath("/api/users?page=" + page)
                .when()
                .get()
                .then()
                .statusCode(200)
                .body("page", equalTo(page))
                .body("per_page", equalTo(6))
                .body("total", equalTo(12))
                .body("total_pages", equalTo(2))
                .extract().as(ListUsers.class);
        Assertions.assertEquals(UserFactory.createUser1(), listUsers.getData().get(0));
    }

}
