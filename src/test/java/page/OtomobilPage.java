package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class OtomobilPage  extends BasePage{

    //anasayfada otomobil tıklandığında bu sayfa açılıyor, bu sayfada otomobil vitrini gösteriliyor.
    @FindBy(className= "all-classifieds-link")
    WebElement ilanlar;

    public OtomobilPage(WebDriver webDriver) {
        super(webDriver);

    }

    public void clickIlanlar(){//"bu kategorideki tüm ilanlar" tıklanır.

        wait.until(ExpectedConditions.visibilityOfAllElements(ilanlar));
        ilanlar.click();
    }


}
