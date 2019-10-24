package testrestassured.auth;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import testrestassured.*;

import static org.hamcrest.collection.IsMapContaining.hasKey;
import static org.hamcrest.core.IsEqual.equalTo;


public class ListResourceTest extends AbstractTest {
    @Test
    @Tag("GET")
    @DisplayName("Получение списка ресурсов")
    public void getListResources() {
        ResourceList resourceList = RestAssured.given(requestSpecification)
                .basePath("/api/unknown")
                .when()
                .get()
                .then()
                .statusCode(200)
                .body("page", equalTo(1))
                .body("per_page", equalTo(6))
                .body("total", equalTo(12))
                .body("total_pages", equalTo(2))
                .extract().as(ResourceList.class);
        Assertions.assertEquals(ResourceFactory.getResource1(), resourceList.getData().get(0));
        Assertions.assertEquals(ResourceFactory.getResource2(), resourceList.getData().get(1));
        Assertions.assertEquals(ResourceFactory.getResource3(), resourceList.getData().get(2));
        Assertions.assertEquals(ResourceFactory.getResource4(), resourceList.getData().get(3));
        Assertions.assertEquals(ResourceFactory.getResource5(), resourceList.getData().get(4));
        Assertions.assertEquals(ResourceFactory.getResource6(), resourceList.getData().get(5));

    }

    @Test
    @Tag("GET")
    @DisplayName("Получение одного ресурса")
    public void getResource() {
        RestAssured.given(requestSpecification)
                .basePath("/api/unknown/2")
                .when()
                .get()
                .then()
                .statusCode(200)
                .body("id", equalTo(2))
                .body("name", equalTo("fuchsia rose"))
                .body("year", equalTo(2001))
                .body("color", equalTo("#C74375"))
                .body("pantone_value", equalTo("17-2031"));


    }
}