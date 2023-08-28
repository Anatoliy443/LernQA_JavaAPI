package src.test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.junit.jupiter.api.Test;
import java.util.List;
public class ex5 {
    @Test
    public void ex5() {
        JsonPath response = RestAssured.get("https://playground.learnqa.ru/api/get_json_homework").jsonPath();
        List<String> messages = response.getList("messages");
        String message= response.getString("messages[1].message");
            System.out.println(message);
        }
    }

