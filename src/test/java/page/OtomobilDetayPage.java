package page;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.io.File;
import java.io.IOException;

public class OtomobilDetayPage extends BasePage{

    private static final Logger logger = LogManager.getLogger(OtomobilDetayPage.class);

    @FindBy(id="classifiedId")
    WebElement ilanId;

    public OtomobilDetayPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void checkUrl() throws IOException {

        String strUrl = driver.getCurrentUrl();
        String ilanNo = ilanId.getText();

        boolean check = strUrl.contains(ilanNo);//url'de ilanın tutulup tutulmadığı kontrol edildi.

        try{
            Assertions.assertEquals(true,check);
            System.out.println("Test case6 passed :)");
        }catch (AssertionError e){

            File imageFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File DestFile=new File("/Users/aybukeceren.duran/Desktop/test.png");

            FileUtils.copyFile(imageFile, DestFile);
            logger.error("test case6 failed");
        }
    }


}
