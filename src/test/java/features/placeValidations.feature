@smoke
Feature: validating AddPlace API

  Scenario: verify if Place is being successfully added using AddPlaceAPI
    Given Add Place API request is prepared
    When user calls "maps/api/place/add/json" with Post http request
    Then the API call is success with status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"