package testrestassured;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpec {

    private static RequestSpecification requestSpecification;

    private static RequestSpecification create() {
        return new RequestSpecBuilder()
                .setBaseUri("https://reqres.in/")
                .setAccept(ContentType.JSON)
                .setContentType(ContentType.JSON)
                .build();
    }

    public static RequestSpecification getInstance() {
        if (requestSpecification == null) {
            requestSpecification = create();
        }
        return requestSpecification;
    }

}
