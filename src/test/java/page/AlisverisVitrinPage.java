package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlisverisVitrinPage extends BasePage{

    //alışveriş kategori vitrini sayfası ile ilgili page.
    @FindBy(className = "searchResultsGalleryContent")
    WebElement ilan;

    public AlisverisVitrinPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickIlkIlan(){//kategori vitrininde ilk ilana tıklanır.

        wait.until(ExpectedConditions.visibilityOfAllElements(ilan));
        ilan.click();
    }

}
