package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class BaseClass {
    public static WebDriver driver;
    public static ChromeOptions options;
    public void open_chrome_browser(){
        String url="https://abc9262.sg-host.com/";
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\wordspace\\Selenium-jenkins\\chromedriver_119.exe");
         options =new ChromeOptions();
         options.addArguments("--headless");
        // Instantiate a ChromeDriver class.driver = new ChromeDriver();
        driver=new ChromeDriver(options);
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );


    }

}
