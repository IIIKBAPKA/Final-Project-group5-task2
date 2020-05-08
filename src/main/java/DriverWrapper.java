import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Selenide.$;

public class DriverWrapper {
    private WebDriver driver;

    public DriverWrapper() {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+ "\\src\\main\\resources\\geckodriver.exe");
        driver = new FirefoxDriver();
        WebDriverRunner.setWebDriver(driver);
    }
    public Dialog setUp(){
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://ru.akinator.com/");
        $("div.btn-play").click();
        driver.manage().window().setSize(new Dimension(0,0));
        return new Dialog(driver);
    }
}
