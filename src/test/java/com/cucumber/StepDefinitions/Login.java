package com.cucumber.StepDefinitions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.deps.com.thoughtworks.xstream.mapper.SystemAttributeAliasingMapper;

/**
 * Created by IEUser on 6/17/2017.
 */
public class Login {
    @Given("^: User Name and Password$")
    public void user_Name_and_Password()   {
            // Write code here that turns the phrase above into concrete actions
        System.out.println("Given Scenario");
    }

    @When("^: Credential Matches$")
    public void credential_Matches()   {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Whwn" );
        System.out.println(1/0);
    }

    @Then("^: Log in$")
    public void log_in()   {
        System.out.println("Then Scenario");
    }
}
