package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EmlakIlanPage extends BasePage {
    public EmlakIlanPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(id = "askQuestionLink")
    WebElement mesaj;

    public void clickMesaj() {

        wait.until(ExpectedConditions.visibilityOfAllElements(mesaj));
        mesaj.click();
    }
}

