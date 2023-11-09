package steps;

import io.cucumber.java.en.*;
import pages.MyAccountPage;

public class RegistrationStpes {
    MyAccountPage mp;

    public RegistrationStpes(){
        mp= new MyAccountPage();
    }


    @Given("I am on the registration page")
    public void i_am_on_the_registration_page() {
      mp.open_chrome_browser();
        System.out.println("Open Chrome Browser successfully");
    }
    @When("I enter a valid Username {string}")
    public void i_enter_a_valid_username(String un) {
    mp.enter_user_name(un);
        System.out.println("Enter user name successfully");
    }
    @When("I enter a valid Email address {string}")
    public void i_enter_a_valid_email_address(String em) {
        mp.enter_email(em);
        System.out.println("Enter Email address successfully");

    }
    @When("I enter a valid Password {string}")
    public void i_enter_a_valid_password(String pa) {
        mp.enter_password(pa);

    }
    @When("I submit the registration form")
    public void i_submit_the_registration_form() {
        mp.click_on_register_button();
        System.out.println("Click on Register button Successfully");

    }
    @Then("I should be automatically redirected to the customer login page")
    public void i_should_be_automatically_redirected_to_the_customer_login_page() {
        mp.i_Verify_dashboard_text_in_dashboard_page();
        System.out.println("Dashboard verify");

    }

}
