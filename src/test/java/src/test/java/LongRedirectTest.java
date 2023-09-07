package src.test.java;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class LongRedirectTest {
    @Test
    public void redirect() {
        Response response = RestAssured
                .given()
                .redirects()
                .follow(true)
                .when()
                .get("https://playground.learnqa.ru/api/long_redirect")
                .andReturn();
        int statusCode = response.getStatusCode();
        System.out.println(statusCode);

    }
}
