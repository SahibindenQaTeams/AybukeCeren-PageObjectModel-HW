package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.SessionStorage;
import org.openqa.selenium.html5.WebStorage;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    WebDriver driver;

    @BeforeAll
    public static void beforeall() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void beforeTest() {
        driver = new ChromeDriver();

        driver.get("https://www.sahibinden.com/testbox.html"); //direct to  https://www.sahibinden.com/testbox.html
        //tb 182 bulundu. //*[@id="testBoxContainer"]/div[3]/div[45]/div[1]
        WebElement element = driver.findElement(By.xpath("//*[@id=\"testBoxContainer\"]/div[3]/div[38]"));
        element.click();
        driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
        driver.navigate().to("https://www.sahibinden.com/");

        /*driver.get("http://sahibinden.com/");
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();*/

        /*LocalStorage localStorage = ((WebStorage) driver).getLocalStorage();
        localStorage.setItem("feature_discovery_data",
                "{\"add-to-favorites\":{\"count\":1,\"displayedAt\":1666694107010},\"extended\":true}");

        SessionStorage sessionStorage = ((WebStorage) driver).getSessionStorage();
        sessionStorage.setItem("feature_discovery_displayed", "true");*/
    }

    @AfterEach
    public void afterTest() {
        driver.quit();
    }
}
