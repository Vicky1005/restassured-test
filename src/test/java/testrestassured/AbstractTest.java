package testrestassured;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.BeforeAll;

public abstract class AbstractTest {

   static protected RequestSpecification requestSpecification;

    @BeforeAll
    public static void setUp() {
        requestSpecification=RequestSpec.getInstance();
    }

}
