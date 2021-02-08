import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;

import java.io.IOException;
import java.io.InputStream;

import static io.restassured.RestAssured.given;

public class Ressert {
    public static void main(String[] args) throws IOException {
        RequestSpecBuilder req = new RequestSpecBuilder();
        Response res = given().get("http://www.baidu.com");
        System.out.println(res.asString());

    }
}
