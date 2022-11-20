package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SuccessPage extends BasePage{

    @FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/main/div[1]/div[2]/div/div[2]/div[2]/a")
    WebElement banaOzeleGit;

    public SuccessPage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickBanaOzeleGit(){

        wait.until(ExpectedConditions.visibilityOfAllElements(banaOzeleGit));
        banaOzeleGit.click();
    }


}
