package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RedShelfSearchPage {
    public RedShelfSearchPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@class='title text-book-title'])[1]")
    public WebElement firstSearchResult;

    @FindBy(xpath = "//h1[@class='text-center']")
    public WebElement messageField;

}
