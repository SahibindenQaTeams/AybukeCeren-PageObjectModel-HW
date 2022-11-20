package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AlisverisIlanPage extends BasePage {//alışveriş ilan sayfası

    @FindBy(className = "classifiedAddFavorite")
    WebElement favori;

    public AlisverisIlanPage(WebDriver webDriver) {
        super(webDriver);
    }


    public void clickFavori() {//favorilere ekle tıklanır.

        wait.until(ExpectedConditions.visibilityOfAllElements(favori));
        favori.click();
    }
}
