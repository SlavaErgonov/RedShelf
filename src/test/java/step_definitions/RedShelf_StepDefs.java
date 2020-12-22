package step_definitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.RedShelfMainPage;
import utilities.Driver;

public class RedShelf_StepDefs {

    RedShelfMainPage redShelfMainPage = new RedShelfMainPage();

    @When("User is on RedShelf main page")
    public void user_is_on_Google_search_page() {
        Driver.getDriver().get("https://redshelf.com/");
    }

    @When("User searches for Mark Twain")
    public void user_searches_for_Mark_Twain() { redShelfMainPage.searchBox.sendKeys("Mark Twain" + Keys.ENTER);
    }

    @Then("User should see Mark Twain in result list")
    public void User_should_see_Mark_Twain_in_result_list() {
        WebElement firstSearchResult = Driver.getDriver().findElement(By.xpath(("(//a[@class='title text-book-title'])[1]")));
        String firstResult = firstSearchResult.getText();
        Assert.assertTrue(firstResult.contains("Mark Twain"));
    }
}
