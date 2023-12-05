import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase extends ApplicationManager {

static ApplicationManager app=new ApplicationManager();

    @BeforeTest
    public void start1(){
        app.start();
    }





}
