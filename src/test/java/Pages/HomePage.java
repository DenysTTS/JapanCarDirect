package Pages;

import Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@value='Login']")
    public WebElement LoginButton;

    @FindBy(linkText = " Home ")
    public WebElement HomeButton;

    @FindBy(xpath = "//a[@href='/logout']")
    public WebElement LogoutButton;

    @FindBy(id = "g71")
    public WebElement JapaneseAuctionsButton;

    @FindBy(xpath="//input[@tabindex='1']")
    public WebElement LoginBoxUsername;

    @FindBy(xpath="//input[@tabindex='2']")
    public WebElement LoginBoxPassword;

    @FindBy(xpath="//input[@value='login']")
    public WebElement LoginBoxLoginButton;

    @FindBy(linkText = "Password reminder")
    public WebElement LoginBoxPasswordReminderButton;

    @FindBy(id ="aj_id_register_orange")
    public WebElement LoginBoxRegistrationButton;

    @FindBy(xpath="//a[@class='aj_modalL']")
    public WebElement LoginBoxCloseButton;





}
