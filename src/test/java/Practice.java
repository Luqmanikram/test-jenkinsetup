import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Practice {
    public static WebDriver driver;
    public static void main(String[] args) {

        String url="https://abc9262.sg-host.com/";
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\wordspace\\Selenium-jenkins\\chromedriver_119.exe");
        // Instantiate a ChromeDriver class.driver = new ChromeDriver();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS );

        driver.findElement(By.xpath("//*[@id=\"reg_username\"]")).sendKeys("abc");
    }

}
