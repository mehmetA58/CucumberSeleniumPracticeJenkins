package com.vytrack.step_definitions;

import io.cucumber.java.en.*;


public class LoginStepDefinitions {

    @Given("user is on the login page")
    public void user_is_on_the_login_page() {
        System.out.println("I m on the Login page");
    }

    @Then("user logs in as a store manager")
    public void user_logs_in_as_a_store_manager() {
        System.out.println("Login as store manager");
    }

    @Then("user verify that {string} page subtitle is displayed")
    public void user_verify_that_page_subtitle_is_displayed(String string) {
        System.out.println("page subtitle is displayed");

    }


}
