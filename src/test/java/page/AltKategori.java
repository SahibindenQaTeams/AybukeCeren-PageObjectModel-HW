package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AltKategori extends BasePage{

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/main/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div/section[2]/div/div[1]/ul/li[1]/span")
    WebElement evcilHayvanlar;

    @FindBy(xpath ="/html/body/div[1]/div[1]/div[2]/main/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div/section[3]/div/div[1]/ul/li[1]/span")
    WebElement kedi;

    @FindBy(xpath ="/html/body/div[1]/div[1]/div[2]/main/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div/section[4]/div/div[1]/ul/li[1]/span")
    WebElement americanShortHair;

    @FindBy(xpath="/html/body/div[1]/div[1]/div[2]/main/div[1]/div[2]/div[1]/div[3]/div[1]/div[2]/div/div[2]/button")
    WebElement devam;

    public AltKategori(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickEvcilHayvanlar(){

        wait.until(ExpectedConditions.visibilityOfAllElements(evcilHayvanlar));
        evcilHayvanlar.click();
    }

    public void clickKedi(){

        wait.until(ExpectedConditions.visibilityOfAllElements(kedi));
        kedi.click();
    }

    public void clickAmerican(){

        wait.until(ExpectedConditions.visibilityOfAllElements(americanShortHair));
        americanShortHair.click();
    }

    public void clickDevam(){

        wait.until(ExpectedConditions.visibilityOfAllElements(devam));
        devam.click();
    }

}
