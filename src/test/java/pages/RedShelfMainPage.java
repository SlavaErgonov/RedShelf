package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RedShelfMainPage {
    public RedShelfMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="search-catalog-home")
    public WebElement searchBox;
}
