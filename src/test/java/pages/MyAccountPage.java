package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MyAccountPage extends BaseClass{
    public void enter_user_name(String un){
        driver.findElement(By.xpath("//*[@id=\"reg_username\"]")).sendKeys(un);



    }
    public void enter_email(String email){
        driver.findElement(By.xpath("//*[@id=\"reg_email\"]")).sendKeys(email);

    }
    public void enter_password(String pwd){
        driver.findElement(By.xpath("//*[@id=\"reg_password\"]")).sendKeys(pwd);

    }
    public void click_on_register_button(){
        driver.findElement(By.xpath("//*[@id=\"customer_login\"]/div[2]/form/p[4]/button")).click();

    }

    public void i_Verify_dashboard_text_in_dashboard_page(){
        WebElement dashboardText = driver.findElement(By.linkText("Dashboard"));
        String dashboardTextValue = dashboardText.getText();

        if (dashboardTextValue.equals("Dashboard")) {
            System.out.println("Verification Passed: Dashboard text is displayed.");
        } else {
            System.out.println("Verification Failed: Dashboard text is not displayed.");
        }
    }


    public void click_on_login_button(){

    }






}
