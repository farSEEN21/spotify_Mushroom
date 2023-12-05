import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import utils.Reader;

public class SearchHelper extends BaseHelper{


    public SearchHelper(WebDriver wd) {
        super(wd);
    }


public void SearchMusic(){
    click(By.xpath(Reader.getProperty("SearchLocator")));
        type(By.xpath(Reader.getProperty("SeachInput")),Reader.getProperty("TextSeach"));

    }

    public void ClickOnResultOfSeach(){
        click(By.xpath(Reader.getProperty("ResultOfSearch")));
    }

public void PlayMusic(){
        click(By.xpath(Reader.getProperty("PlayButton1")));
}


}
