package steps;


import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginSteps {
    public static  WebDriver driver;
    @Given("^I launch the chrome browser and enter orangehrm url$")
    public void i_launch_the_chrome_browser_and_enter_orangehrm_url() throws Throwable {
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\wordspace\\Selenium-jenkins\\chromedriver_118.exe");
        // Instantiate a ChromeDriver class.
        driver = new ChromeDriver();

        // Navigate to the webpage
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        System.out.println("Browser Open successfully");



    }

    @When("^I enter username and password$")
    public void i_enter_username_and_password() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
        System.out.println("User credential varified");

    }

    @When("^I click on login button$")
    public void i_click_on_login_button() throws Throwable {
        driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

        System.out.println("Click login buttton successfully");

    }

    @Then("^I should the dashboard$")
    public void i_should_the_dashboard() throws Throwable {
        driver.quit();
        System.out.println("Verify dasboard ");

    }
}
