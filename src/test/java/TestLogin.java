import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.Reader;

import java.time.Duration;

public class TestLogin extends TestBase {


    @Test
    public void checkLogin(){
        app.login.FillLoginForm();

        app.search.SearchMusic();
        app.search.ClickOnResultOfSeach();

        app.search.PlayMusic();


    }



}
