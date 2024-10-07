package StepDefinitions;

import io.cucumber.java.en.*;

public class _01_LoginSteps {
    @Given("Navigate to Campus")
    public void navigate_to_campus() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Site açıldı");
        throw new io.cucumber.java.PendingException();
    }

    @When("Enter uername and password and click login button")
    public void enter_uername_and_password_and_click_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Username ve şifre gönderildi");
        throw new io.cucumber.java.PendingException();
    }

    @Then("User should login succesfully")
    public void user_should_login_succesfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("siteye girildiği doğrulandı");
        throw new io.cucumber.java.PendingException();
    }
}