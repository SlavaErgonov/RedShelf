package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RedShelfLoginPage {
    public RedShelfLoginPage(){ PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(id="username")
    public WebElement emailField;

    @FindBy(id="password")
    public WebElement passwordField;

    @FindBy(xpath ="(//button[@class='btn btn-primary form-control'])[1]")
    public WebElement loginButton;
}
