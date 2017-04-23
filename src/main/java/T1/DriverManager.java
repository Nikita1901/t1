package T1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.util.concurrent.TimeUnit;

public class DriverManager {
    private static WebDriver driver;

    public static void main(String[] args) {


        {

            String browser = "ie";

            if (browser.equalsIgnoreCase("Chrome")) {
                System.setProperty("webdriver.chrome.driver", "src\\test\\Resources\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if (browser.equalsIgnoreCase("IE")) {
                System.setProperty("webdriver.ie.driver", "src\\test\\Resources\\IEDriverServer.exe");
                driver = new InternetExplorerDriver();
            } else {
                driver = new FirefoxDriver();
            }

            driver.get("http://demo.nopcommerce.com");
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }}

    public static void closeBrowser() {
//        driver.quit();

    }
}
