package org.springframework.samples.petclinic;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class ApiSmokeTest {

    @Test
    public void testHomePageIsUp() {
        RestAssured.baseURI = "https://petclinic.onrender.com";

        given().
        when().
            get("/").
        then().
            statusCode(200).
            body(containsString("Welcome"));
    }
}
