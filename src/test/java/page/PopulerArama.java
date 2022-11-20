package page;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class PopulerArama extends BasePage{

    private static final Logger logger = LogManager.getLogger(PopulerArama.class);

    @FindBy(className = "search-result-bc")
    WebElement breadcrumb;//breadcrumb elementlerinin listesi

    public PopulerArama(WebDriver webDriver) {
        super(webDriver);
    }

    public void checkEslesme(String title1) throws IOException {

        List<WebElement> elements = breadcrumb.findElements(By.className("bc-item"));
        int size = elements.size();//popüler arama kategorisi breadcrumbın en sonki elementi.
        WebElement breadCrumbElement = driver.findElement(By.xpath("//*[@id=\"searchContainer\"]/div[2]/ul/li["+size+"]"+"/a"));//breadcrumbın en sonki elementi bulunur.
        String title2 = breadCrumbElement.getAttribute("title");//breadcrumbın en sonki elementinin yazısı stringte tutulur.

        if(title2.contains("fiyatları")  ||  title2.contains("watch"))//breadcrumbta Toyota fiyatları popüler arama kategorisi toyota olarak gözüküyor
        {//bu yüzden fiyatları yazısı atılıp kontrol yapılır. Aynı şekilde Oppo Watch popüler araması breadcrumbta Oppo olarak gözüküyor.
            System.out.println(title1);
            String arr[] = title2.split(" ", 2);
            String firstWord = arr[0];
            System.out.println(firstWord);

            try{
                Assertions.assertTrue(title1.equalsIgnoreCase(firstWord));
                System.out.println("Popular Search Category test passed");
            }catch (AssertionError e){

                File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                File DestFile=new File("/Users/aybukeceren.duran/Desktop/test.png");

                FileUtils.copyFile(imageFile, DestFile);
                logger.error("Popular Search Category test failed");
            }

        }

        else
        {
            System.out.println(title1);
            System.out.println(title2);
            // Assertions.assertTrue(title1.equalsIgnoreCase(title2));
            try{
                Assertions.assertTrue(title1.equalsIgnoreCase(title2));
                System.out.println("Popular Search Category test passed");
            }catch (AssertionError e){

                File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
                File DestFile=new File("/Users/aybukeceren.duran/Desktop/test.png");

                FileUtils.copyFile(imageFile, DestFile);
                logger.error("Popular Search Category  test failed");
            }
        }
    }

    public void back(){

        driver.navigate().back();
    }
}
