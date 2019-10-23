package testrestassured.auth;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testrestassured.AbstractTest;

import testrestassured.RegisterFactory;



import javax.xml.ws.Response;



public class SingleUserTest extends AbstractTest {

    /*@Test
    @Tag("GET")
    @DisplayName("Получение информации о пользователе")
    public void singleUserGerInformation() {
        Response response = RestAssured.given(requestSpecification)
                .basePath("/api/users/2")
                .body(RegisterFactory.successfulRegister())
                .when()
                .get()
                .then()
                .statusCode(200)
                Assertions.assertEquals(response.toString(),  );



    }*/
}
