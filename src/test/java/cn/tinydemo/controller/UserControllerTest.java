package cn.tinydemo.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;

@QuarkusTest
public class UserControllerTest {
    @Test
    public void testCount() {
        given()
                .when().get("/users/count")
                .then()
                .statusCode(200);
    }

    @Test
    public void testAdd() {
        given()
                .when().post("/users/add")
                .then()
                .statusCode(200);
    }
}
