package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class IlanVer extends BasePage {

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[1]/header/div[1]/ul/li[6]/a")
    WebElement ucretsizIlan;


    public IlanVer(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickUcretsizIlan() {
        wait.until(ExpectedConditions.visibilityOfAllElements(ucretsizIlan));
        wait.until(ExpectedConditions.elementToBeClickable(ucretsizIlan));
        ucretsizIlan.click();
    }
}
