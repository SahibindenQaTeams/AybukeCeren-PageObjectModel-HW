package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlisverisPage extends BasePage{

    //Ansayfada alışveriş kategorisi tıklandığında bu sayfa açılıyor.
    @FindBy(css = "[title='Tüm vitrin ilanlarını göster']")
    WebElement vitrin;

    public AlisverisPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickVitrin() {//tüm vitrin ilanlarını göster tıklanır.

        wait.until(ExpectedConditions.visibilityOfAllElements(vitrin));
        vitrin.click();
    }
}
