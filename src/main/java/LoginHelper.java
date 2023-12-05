import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Reader;

public class LoginHelper extends BaseHelper {


    public LoginHelper(WebDriver wd) {
        super(wd);
    }

    public void FillLoginForm() {


      //  click(By.xpath("//button[@id='onetrust-accept-btn-handler']"));
        click(By.xpath("//span[@class='ButtonInner-sc-14ud5tc-0 bzuYkS encore-inverted-light-set']"));
        type(By.xpath(Reader.getProperty("InputEmail")), Reader.getProperty("Login"));
        type(By.xpath(Reader.getProperty("InputPSW")), Reader.getProperty("PSW"));
        click(By.xpath(Reader.getProperty("LoginWithEmailAndPSW")));


    }


}
