package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class IlanVermeDetay extends BasePage{

    @FindBy(css = "[name='addClassifiedTitle']")
    WebElement ilanBaslik;

    @FindBy(css = "[name='Açıklama']")
    WebElement aciklama;

    @FindBy(css = "[for='postRulesCheck']")
    WebElement ilanVermeKurallari;

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/main/div[1]/div[2]/form/div[23]/button")
    WebElement devam;


    public IlanVermeDetay(WebDriver webDriver) {
        super(webDriver);
    }

    public void enterBaslik(){

        wait.until(ExpectedConditions.visibilityOfAllElements(ilanBaslik));
        ilanBaslik.sendKeys("Hayvanlar alemi kategorisinde ilan verme testi");
    }

    public void enterAciklama(){

        wait.until(ExpectedConditions.visibilityOfAllElements(aciklama));
        aciklama.sendKeys("test test test test test test test test test test test");
    }

    public void selectYas() throws InterruptedException {

        Select se = new Select(driver.findElement(By.name("a2105")));
        Thread.sleep(3000);
        se.selectByVisibleText("1");
    }

    public void selectCinsiyet() throws InterruptedException {

        Select se = new Select(driver.findElement(By.name("a1846")));
        Thread.sleep(3000);
        se.selectByVisibleText("Dişi");
    }

    public void selectSehir() throws InterruptedException {

        Select se = new Select(driver.findElement(By.name("city")));
        Thread.sleep(3000);
        se.selectByVisibleText("İzmir");
    }

    public void selectIlce() throws InterruptedException {

        Select se = new Select(driver.findElement(By.name("town")));
        Thread.sleep(3000);
        se.selectByVisibleText("Bergama");
    }

    public void selectMahalle() throws InterruptedException {

        Select se = new Select(driver.findElement(By.name("quarter")));
        Thread.sleep(3000);
        se.selectByVisibleText("Ayaskent");
    }

    public void clickIlanVerme() throws InterruptedException {

        Thread.sleep(3000);
        ilanVermeKurallari.click();
    }

    public void clickDevam(){

        wait.until(ExpectedConditions.visibilityOfAllElements(devam));
        devam.click();
    }

}
