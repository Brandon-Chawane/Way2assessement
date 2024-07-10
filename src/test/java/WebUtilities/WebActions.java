package WebUtilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import java.time.Duration;

import static WebUtilities.BrowserFactory.driver;


public class WebActions {


    private static void wait(WebElement element) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void click(WebElement element) {

        try {
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            wait.until(ExpectedConditions.elementToBeClickable(element));
            element.click();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void dropDownMenuSelect( WebElement element, String vValue) {
        Select select = new Select(element);
        try {
            wait(element);
            select.selectByVisibleText(vValue);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    public static void enterValue(WebElement element, String vValue) {
        try {
            wait(element);
            element.clear();
            element.sendKeys(vValue);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


}
