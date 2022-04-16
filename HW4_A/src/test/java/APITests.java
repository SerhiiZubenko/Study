import io.restassured.RestAssured;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.core.IsEqual.equalTo;

public class APITests {

    @BeforeSuite
    public void setUp(){
        RestAssured.baseURI = "https://petstore.swagger.io/v2";  // For 4-10 tests
       //  RestAssured.baseURI = "https://swapi.dev/api/";       // For 1-3 tests
    }

    /**
    For second baseURL
    */

    @Test
    public void getUserName(){
        given()
                .when().contentType("application/json")
                .get("/people/1/")
                .then().body("birth_year", equalTo("19BBY"));
    }

    @Test
    public void getCheckRequest(){
        given()
                .when().contentType("application/json")
                .get("/people/1/")
                .then().statusCode(200);
    }

    @Test
    public void getCheckNegativeRequest(){
        given()
                .when().contentType("application/json")
                .get("/people/100/")
                .then().statusCode(404);
    }

    /**
     For first baseURL
     */

    @Test
    public void deleteRequest(){
        given()
                .when().contentType("application/json")
                .delete("/store/order/1")
                .then().statusCode(404);
    }

    @Test
    public void checkCreatePost(){
        Helper post = new Helper();
        post.setId(1);
        post.setPetId(2);
        post.setQuantity(10);
        post.setShipDate("2022-04-15T13:22:13.604Z");
        post.setStatus("placed");
        post.setComplete(true);
        given().contentType("application/json")
                .body(post)
                .when().post("/store/order")
                .then().statusCode(200);
    }

    @Test
    public void getOrderIdPositiveRequest(){
        given().contentType("application/json")
                .when().get("/store/order/1")
                .then().statusCode(200);
    }

    @Test
    public void getOrderIdNegativeRequest(){
        given().contentType("application/json")
                .when().get("/store/order/10000000")
                .then().statusCode(404);
    }

    @Test
    public void deleteOrder(){
        given().contentType("application/json")
                .when().delete("/store/order/1")
                .then().statusCode(404);
    }

    @Test
    public void putUserLastName(){
        Helper user = new Helper();
        user.setLastName("Zubenko");
        given().contentType("application/json")
                .body(user)
                .when().put("/user/string")
                .then().statusCode(200);
    }


}
