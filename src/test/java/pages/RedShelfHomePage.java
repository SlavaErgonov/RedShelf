package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RedShelfHomePage {
    public RedShelfHomePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="search-catalog-home")
    public WebElement searchBox;

    @FindBy(xpath ="(//a[@class='rs-navbar-nav-item-link'])[2]")
    public WebElement mainLoginButton;

}
