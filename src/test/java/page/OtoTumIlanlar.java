package page;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class OtoTumIlanlar extends BasePage{

    //otomobil vitrin sayfasında "Bu kategorideki tüm ilanlar" tıklandığında bu sayfa açılıyor

    private static final Logger logger = LogManager.getLogger(OtoTumIlanlar.class);

    @FindBy(xpath = "/html/body/div[5]/div[4]/form/div/div[2]/div[3]/dl/dd/ul/li[1]/a")
    WebElement il;

    @FindBy(className = "searchResultsItem")//bu sayfadaki tüm ilanlar liste halinde bu elementte tutuluyor.
    List<WebElement> elements;

    //sağ taraftaki search menüsünde adres bölümündeki iller burada tutuuluyor.
    @FindBy(xpath = "/html/body/div[5]/div[4]/form/div/div[2]/div[3]/dl/dd/ul/li[1]/div/div[3]/div/div[1]/ul/div/ul")
    WebElement ilTablo;

    @FindBy(id="searchResultsTable")
    WebElement ilanTablosu;


    public OtoTumIlanlar(WebDriver webDriver) {
        super(webDriver);
    }

    public void checkIlanSayisi() throws IOException {

        int size = elements.size();
        boolean value = (size == 20) || (size == 21);//reklamdan dolayı ilan sayısı 1 fazla olabiliyor listede.
        System.out.println("Tüm otomobil ilanların 1. sayfadaki sayısı: " + size);

        try{
            Assertions.assertEquals(true,value); // ilan sayısının boş gelip gelmediği kontrol edildi.
            System.out.println("Test case1 passed :)");
        }catch (AssertionError e){

            File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File DestFile=new File("/Users/aybukeceren.duran/Desktop/test.png");

            FileUtils.copyFile(imageFile, DestFile);
            logger.error("test case1 failed");
        }

    }

    public void checkNull() throws IOException {

        List<WebElement> ilanOzellikleri = elements.get(0).findElements(By.className("searchResultsTagAttributeValue"));
        String marka = ilanOzellikleri.get(0).getText();
        String seri = ilanOzellikleri.get(1).getText();
        String model = ilanOzellikleri.get(2).getText();
        WebElement ilkilan_link = elements.get(0).findElement(By.className("classifiedTitle"));
        String baslik = ilkilan_link.getText();
        List<WebElement> ilanOzellikleri2 = elements.get(0).findElements(By.className("searchResultsAttributeValue"));
        String yil = ilanOzellikleri2.get(0).getText();
        String km  = ilanOzellikleri2.get(1).getText();
        String renk = ilanOzellikleri2.get(2).getText();

        try{
            Assertions.assertAll
                    (
                            () -> Assertions.assertNotNull(marka),
                            () -> Assertions.assertNotNull(seri),
                            () -> Assertions.assertNotNull(model),
                            () -> Assertions.assertNotNull(baslik),
                            () -> Assertions.assertNotNull(yil),
                            () -> Assertions.assertNotNull(km),
                            () -> Assertions.assertNotNull(renk)
                    );
            System.out.println();
            System.out.println("**************************");
            System.out.println("Tıklanan aracın markası, serisi, modeli, ilan başlığı, yılı, km'si ve rengi dolu geliyor ");
            System.out.println("Tıklanan ilk ilandaki aracın markası: " + marka);
            System.out.println("Tıklanan ilk ilandaki aracın serisi: " + seri);
            System.out.println("Tıklanan ilk ilandaki aracın modeli: " + model);
            System.out.println("Tıklanan ilk ilandaki aracın başlığı: " + baslik);
            System.out.println("Tıklanan ilk ilandaki aracın yılı: " + yil);
            System.out.println("Tıklanan ilk ilandaki aracın km'si: " + km);
            System.out.println("Tıklanan ilk ilandaki aracın rengi: " + renk);
            System.out.println("**************************");
            System.out.println();
            //WebElement ilkilan_link = ilkilan.findElement(By.className("classifiedTitle"));
            //ilkilan_link.click();
            System.out.println("Test case2 passed :)");
        }catch (AssertionError e){
            File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File DestFile=new File("/Users/aybukeceren.duran/Desktop/test.png");

            FileUtils.copyFile(imageFile, DestFile);
            logger.error("test case5 failed");
        }

    }

    public void checkIlSayisi() throws IOException {

        wait.until(ExpectedConditions.elementToBeClickable(il));
        il.click();//İl yazısına tıklanır.
        //illerin tutulduğu kısmın elementi beklenir.
        List<WebElement> items = ilTablo.findElements(By.tagName("li"));//iller listede tutulur.
        int size = items.size();

        System.out.println("İl sayısı: " + size);
        System.out.println("83 çünkü İstanbul'a ek olarak İstanbul(Anadolu) ve İstanbul(Avrupa) var");

        try{
            Assertions.assertNotEquals(0,size);
            System.out.println("Test case4 passed :)");
        }catch (AssertionError e){

            File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File DestFile=new File("/Users/aybukeceren.duran/Desktop/test.png");

            FileUtils.copyFile(imageFile, DestFile);
            logger.error("test case4 failed");
        }

    }

    public void ilkIlanClick(){//bu sayfadaki ilk ilandaki değerlerin boş gelip gelmediği bu metodla kontrol ediliyor.

        List<WebElement> elements = ilanTablosu.findElements(By.className("searchResultsItem"));//table'dan ilanlar çekilerek listte tutuldu.
        WebElement ilkilan = elements.get(0);//sayfadaki ilk ilan tutuldu.
        WebElement ilkilan_link = ilkilan.findElement(By.className("classifiedTitle"));
        ilkilan_link.click();//sayfadaki ilk ilana tıklanır.
    }

}
