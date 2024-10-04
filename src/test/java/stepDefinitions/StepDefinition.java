package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {

    @Given("Add Place payload")
    public void add_place_payload() {
        System.out.println("first method");
    }
    @When("user calls {string} with Post http request")
    public void user_calls_with_post_http_request(String string) {
        System.out.println("second method");
    }
    @Then("the API call is success with status code {int}")
    public void the_api_call_is_success_with_status_code(Integer int1) {

    }
    @Then("{string} in response body is {string}")
    public void in_response_body_is(String string, String string2) {

    }
}
