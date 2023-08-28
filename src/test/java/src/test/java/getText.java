package src.test.java;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.Test;


public class getText {
    @Test
    public void testHelloWorld() {
        Response response = RestAssured
                .get("https://playground.learnqa.ru/api/get_text")
                .andReturn();
        response.prettyPrint();
    }
}
