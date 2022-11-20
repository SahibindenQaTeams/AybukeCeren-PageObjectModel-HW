package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EmlakVitrinPage extends BasePage{

    @FindBy(xpath="/html/body/div[5]/div[2]/div[1]/div/div[2]/ul/li[1]/a")
    WebElement ilkVitrinEmlak;

    public EmlakVitrinPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickVitrinIlan() {

        wait.until(ExpectedConditions.visibilityOfAllElements(ilkVitrinEmlak));
        ilkVitrinEmlak.click();
    }

}
