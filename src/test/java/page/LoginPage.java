package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends BasePage{

    @FindBy(id = "username")
    WebElement username;

    @FindBy(id = "password")
    WebElement password;

    @FindBy(id = "userLoginSubmitButton")
    WebElement giris;

    public LoginPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterName() {

        wait.until(ExpectedConditions.visibilityOfAllElements(username));
        username.sendKeys("esrakosee");
    }

    public void enterPassword() {

        wait.until(ExpectedConditions.visibilityOfAllElements(password));
        password.sendKeys("password");
    }

    public void clickGiris(){

        wait.until(ExpectedConditions.visibilityOfAllElements(giris));
        wait.until(ExpectedConditions.elementToBeClickable(giris));
        giris.click();
    }


}
