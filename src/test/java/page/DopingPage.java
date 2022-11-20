package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DopingPage extends BasePage{

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/main/div[1]/div[2]/p[1]/button")
    WebElement devam;

    public DopingPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickdevam(){

        wait.until(ExpectedConditions.visibilityOfAllElements(devam));
        devam.click();
    }
}
