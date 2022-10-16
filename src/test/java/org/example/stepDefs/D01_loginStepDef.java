package org.example.stepDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P01_login;

public class D01_loginStepDef extends P01_login {


    @Given("user click signIn button")
        public void click_signIn_button() {
        click_on_signIn();
        }


        // Write code here that turns the phrase above into concrete actions


    @When("user enter valid username {string}")
    public void userEnterValidUsername(String name) {
            enter_your_name(name);
    }
    @And("click on next button")
    public void click_on_next() {
        clickNext();
    }

    @When("enter password {string}")
    public void enter_password(String pass) {
        enter_your_pass(pass);
    }

    @When("Click on login button.")
    public void click_on_login_button() {
        click_signIn();
    }

    @Then("Validate that user login successfully.")
    public void validate_that_user_login_successfully() {
        validate_login();
    }



}
