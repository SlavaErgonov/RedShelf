package step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.RedShelfHomePage;
import pages.RedShelfLoginPage;
import utilities.Config;
import utilities.Driver;

public class RedShelf_Login_StepDefs {
    RedShelfLoginPage redShelfLoginPage = new RedShelfLoginPage();
    RedShelfHomePage redShelfHomePage = new RedShelfHomePage();

    @Given("User navigates to RedShelf home page")
    public void user_navigates_to_RedShelf_home_page() {
        Driver.getDriver().get(Config.get("redshelfURL"));
    }

    @When("User clicks on LogIn button")
    public void user_clicks_on_LogIn_button() {
        redShelfHomePage.mainLoginButton.click();
    }

    @When("User enters valid credentials on login page and clicks on Log In button")
    public void user_enters_valid_credentials_on_login_page_and_clicks_on_Log_In_button() {
        redShelfLoginPage.emailField.sendKeys(Config.get("validEmail"));
        redShelfLoginPage.passwordField.sendKeys(Config.get("validPassword"));
        redShelfLoginPage.loginButton.click();
    }

    @Then("User lands on My Library page")
    public void user_lands_on_My_Shelf_page() {
        String expectedInTitle = "My Library";
        String actualTitle = Driver.getDriver().getTitle();
        Assert.assertTrue(actualTitle.contains(expectedInTitle));

    }

    @When("User enters invalid credentials on login page and clicks on Log In button")
    public void user_enters_invalid_credentials_on_login_page_and_clicks_on_Log_In_button() {
        redShelfLoginPage.emailField.sendKeys(Config.get("validEmail"));
        redShelfLoginPage.passwordField.sendKeys(Config.get("invalidPassword"));
        redShelfLoginPage.loginButton.click();
    }

    @Then("User stays on Log In page")
    public void user_stays_on_Log_In_page() {

        Assert.assertTrue(Driver.getDriver().getTitle().contains("Log In"));
    }

}
