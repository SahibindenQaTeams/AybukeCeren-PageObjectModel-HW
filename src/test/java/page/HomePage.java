package page;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.IOException;


public class HomePage extends BasePage {


    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(css = "[title='Detaylı Arama']")
    private WebElement detayliArama;

    @FindBy(className = "login-text")
    private WebElement giris;

    @FindBy(css = "[title='Otomobil']")
    private WebElement otomobil;

    @FindBy(css = "[title='Emlak']")
    private WebElement emlak;

    @FindBy(css = "[title='İkinci El ve Sıfır Alışveriş']")
    private WebElement alisveris;

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement cookieAccept;

    @FindBy(xpath = "/html/body/gwd-google-ad/gwd-pagedeck/gwd-page/div/gwd-image/div/img")
    private WebElement image;

    @FindBy(css = "[title='iphone 12 mini']")
    private WebElement populer1;

    @FindBy(css = "[title='playstation 5']")
    private WebElement populer2;

    @FindBy(css = "[title='koşu bandı']")
    private WebElement populer3;

    @FindBy(css = "[title='elektrikli ısıtıcı']")
    private WebElement populer4;

    @FindBy(css = "[title='toyota fiyatları']")
    private WebElement populer5;

    public void clickEmlak() {//emlak kategorisi tıklanır.

       emlak.click();
    }

    public void clickGiris(){//sağ üstte giriş tıklanır.

        wait.until(ExpectedConditions.visibilityOfAllElements(giris));
        giris.click();
    }

    public void clickAlisveris() {//anasayfada alışveriş kategorisi tıklanır.
        wait.until(ExpectedConditions.visibilityOfAllElements(alisveris));
        alisveris.click();
    }

    public void clickDetayliArama() {//anasayfada detaylı arama tıklanır.
        wait.until(ExpectedConditions.visibilityOfAllElements(detayliArama));
        detayliArama.click();
    }

    public void clickOtomobil() {//otomobil kategorisine tıklanır.
        wait.until(ExpectedConditions.visibilityOfAllElements(otomobil));
        otomobil.click();
    }


    public void acceptCookie() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("onetrust-accept-btn-handler")));
        cookieAccept.click();
    }

    public void closeOnurBuldu(){//onur buldu youtube videosu kapatılır, eğer varsa o video. yoksa catch statementı çalışır.

        try{
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[2]/div[1]/iframe")));
            driver.switchTo().frame(driver.findElement(By.xpath("/html/body/div[2]/div[1]/iframe")));//switch to the frame
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/gwd-google-ad/gwd-pagedeck/gwd-page/div/gwd-image/div/img")));
            image.click();
            driver.switchTo().defaultContent();//return to original frame
        } catch(Exception e){

            System.out.println("Youtube videosu yüklenmedi.");
        }
    }

    public void clickPopuler1() {//popüler arama kategorisinde olan iphone12 mini tıklanır.

        wait.until(ExpectedConditions.visibilityOfAllElements(populer1));
        populer1.click();
    }

    public void clickPopuler2() {//popüler arama kategorisinde olan playstation5 tıklanır.

        wait.until(ExpectedConditions.visibilityOfAllElements(populer2));
        populer2.click();
    }

    public void clickPopuler3() {//popüler arama kategorisinde olan koşubandı tıklanır.

        wait.until(ExpectedConditions.visibilityOfAllElements(populer3));
        populer3.click();
    }

    public void clickPopuler4() {//popüler arama kategorisinde olan elektrikli ısıtıcı tıklanır.

        wait.until(ExpectedConditions.visibilityOfAllElements(populer4));
        populer4.click();
    }

    public void clickPopuler5() {//popüler arama kategorisinde olan toyota fiyatları tıklanır.

        wait.until(ExpectedConditions.visibilityOfAllElements(populer5));
        populer5.click();
    }

    //popüler arama kategorilerindeki title attributeları döndürülür.
    public String getTitle1(){

        return populer1.getAttribute("title");
    }
    public String getTitle2(){

        return populer2.getAttribute("title");
    }
    public String getTitle3(){

        return populer3.getAttribute("title");
    }
    public String getTitle4(){

        return populer4.getAttribute("title");
    }
    public String getTitle5(){

        return populer5.getAttribute("title");
    }
}
