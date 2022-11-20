package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class KategoryPage extends BasePage{

    @FindBy(css = "[icon-id='3520']")
    WebElement hayvanlarAlemi;

    public KategoryPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickKategori(){

        wait.until(ExpectedConditions.visibilityOfAllElements(hayvanlarAlemi));
        hayvanlarAlemi.click();
    }

}
