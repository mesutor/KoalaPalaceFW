package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.KoalaPalacePage;
import utilities.ConfigReader;
import utilities.Driver;

public class KoalaStepDefinitions {

    KoalaPalacePage koalaPalacePage = new KoalaPalacePage();

    @Given("user is on the koalapalace page")
    public void user_is_on_the_koalapalace_page() {
        Driver.getDriver().get(ConfigReader.getProperty("kaola_url"));
    }

    @Given("user clicks on the login button")
    public void user_clicks_on_the_login_button() {
        koalaPalacePage.homeLogin.click();

    }

    @When("user enters username")
    public void user_enters_username() {
         koalaPalacePage.usernameBox.sendKeys("manager2");
    }

    @When("user enters password")
    public void user_enters_password() {
         koalaPalacePage.passwordBox.sendKeys("Man1Ager2!");
    }

    @When("user clicks login button")
    public void user_clicks_login_button() {
         koalaPalacePage.loginButton.click();
    }

    @Then("Verify login welcome message")
    public void verify_login_welcome_message() {

    }


}
