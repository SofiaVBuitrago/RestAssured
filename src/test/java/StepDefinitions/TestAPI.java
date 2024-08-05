package StepDefinitions;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class TestAPI {

    @Test
    public void get (){
        Response response;
        response = given().get("https://swapi.dev/api/people/2");
        ResponseBody body = response.getBody();
        String bodyString = body.asString();
        JsonPath bodyJson = response.jsonPath();
        String skin = bodyJson.get("skin_color");
        System.out.println(skin);
        Assert.assertEquals(skin,"gold");



    }

}
