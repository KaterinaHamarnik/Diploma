package pages;

import baseEntities.BasePage;
import configuration.ReadProperties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    private final By emailInputLocator = By.id("name");
    private final By pswInputLocator = By.id("password");
    private final By loginButtonLocator = By.id("button_primary");
    private final By errorTextLocator = By.className("error-text");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    protected By getPageIdentifier() {
        return loginButtonLocator;
    }

    public WebElement getEmailInput() {
        return waitsService.waitForVisibilityBy(emailInputLocator);
    }

    public WebElement getPswInput() {
        return driver.findElement(pswInputLocator);
    }

    public WebElement getLoginButton() {
        return driver.findElement(loginButtonLocator);
    }

    public void setEmail(String value) {
        getEmailInput().sendKeys(value);
    }

    public void setPsw(String value) {
        getPswInput().sendKeys(value);
    }

    public void clickLoginButton() {
        getLoginButton().click();
    }

    public WebElement getErrorTextElement() {
        return driver.findElement(errorTextLocator);
    }
}