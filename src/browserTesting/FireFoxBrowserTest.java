package browserTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FireFoxBrowserTest {


    public static void main(String[] args) {

        String baseUrl = "https://www.barclays.co.uk/";
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println(title);

      //  driver.close();


    }
}
