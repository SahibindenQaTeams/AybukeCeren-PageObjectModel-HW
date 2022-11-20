package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SearchPage extends BasePage {

    @FindBy(css = "[href='/arama/detayli?category=3518']")
    private WebElement emlak;

    @FindBy(className = "faceted-select")
    private WebElement il;

    @FindBy(css = "[data-label='istanbul (tumu)']")
    private WebElement istanbulTumu;

    @FindBy(css = "[name='price_min']")
    private WebElement minFiyat;

    @FindBy(css = "[name='price_max']")
    private WebElement maxFiyat;

    @FindBy(css = "[value='Arama Yap']")
    private WebElement arama;

    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickEmlak(){

        wait.until(ExpectedConditions.visibilityOfAllElements(emlak));
        emlak.click();
    }

    public void clickIl(){

        wait.until(ExpectedConditions.visibilityOfAllElements(il));
        il.click();
        wait.until(ExpectedConditions.visibilityOfAllElements(istanbulTumu));
        istanbulTumu.click();
    }

    public void enterMinFiyat(){

        wait.until(ExpectedConditions.visibilityOfAllElements(minFiyat));
        minFiyat.sendKeys("1000000");

    }

    public void enterMaxFiyat(){

        wait.until(ExpectedConditions.visibilityOfAllElements(maxFiyat));
        maxFiyat.sendKeys("10000000");
    }

    public void clickArama(){

        wait.until(ExpectedConditions.visibilityOfAllElements(arama));
        arama.click();
    }

}
