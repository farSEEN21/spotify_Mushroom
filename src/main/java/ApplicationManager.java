import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utils.Reader;

import java.time.Duration;

public class ApplicationManager {


    WebDriver wd;
    LoginHelper login;
    BaseHelper base;
    SearchHelper search;
    public LoginHelper getLogin() {
        return login;
    }

    public BaseHelper getBase() {
        return base;
    }  public SearchHelper getSearch() {
        return search;
    }

    public void start() {
        wd = new ChromeDriver();

        wd.manage().window();
        wd.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        wd.get(String.valueOf(Reader.getProperty("URL")));
        login = new LoginHelper(wd);
        base = new BaseHelper(wd);
        search=new SearchHelper(wd);
    }

    public void teardown() {
        wd.quit();
    }

}
