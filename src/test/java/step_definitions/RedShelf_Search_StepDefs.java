package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.RedShelfHomePage;
import pages.RedShelfSearchPage;
import utilities.Config;
import utilities.Driver;

public class RedShelf_Search_StepDefs {

    RedShelfHomePage redShelfHomePage = new RedShelfHomePage();
    RedShelfSearchPage redShelfSearchPage = new RedShelfSearchPage();

    @When("User searches for {string}")
    public void user_searches_for(String string) {

        redShelfHomePage.searchBox.sendKeys(string + Keys.ENTER);
    }

    @Then("User should see {string} in result list")
    public void User_should_see_in_result_list(String string) {
        String firstResult = redShelfSearchPage.firstSearchResult.getText();
        Assert.assertTrue(firstResult.contains(string));
    }

    @Then("User should see the {string} error message")
    public void user_should_see(String string) {
        String errorMessage = redShelfSearchPage.messageField.getText();
        Assert.assertTrue(errorMessage.contains(string));
    }
}
