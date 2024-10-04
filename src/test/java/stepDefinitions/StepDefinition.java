package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

public class StepDefinition {
    String base=RestAssured.baseURI = "https://rahulshettyacademy.com";
    RequestSpecification request;
    Response response;
    @Given("Add Place API request is prepared")
    public void add_place_api_request_is_prepared() throws IOException {
        request = given().log().all().queryParam("key", "qaclick123").header("Content-Type", "application/json")
                .body(new String(Files.readAllBytes(Paths.get("src\\test\\java\\files\\AddPlaceJson.json"))));

    }
    @When("user calls {string} with Post http request")
    public void user_calls_with_post_http_request(String endpointURL) {
        response = request.when().post(endpointURL);

    }
    @Then("the API call is success with status code {int}")
    public void the_api_call_is_success_with_status_code(Integer status) {
         response.then().log().all().assertThat().statusCode(status);

    }
    @Then("{string} in response body is {string}")
    public void in_response_body_is(String key, String value) {
        response.then().assertThat().body(key, equalTo(value));

    }
}
