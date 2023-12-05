import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseHelper {

WebDriver wd;

    public BaseHelper(WebDriver wd) {
        this.wd = wd;
    }

    public void type(By locator, String text){
        WebElement element = wd.findElement(locator);
        element.click();
        element.clear();
        element.sendKeys(text);
    }

    public void click(By locator){
        wd.findElement(locator).click();
    }

    public boolean isELement(By locator){
        return wd.findElements(locator).size()>0;
    }

    private WebElement findElementBase(By locator) {
        WebDriverWait wait = new WebDriverWait(wd, Duration.ofMillis(30000));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return wd.findElement(locator);
    }




}
