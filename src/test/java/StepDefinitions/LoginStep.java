package StepDefinitions;

import Pages.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep extends Page {


    @Given("user Enter username {string}")
    public void user_Enter_username(String username) {
        getLoginPage().setInputUsername(username);
    }

    @And("user Enter password {string}")
    public void user_enter_password(String password) {
       getLoginPage().setInputPassword(password);
    }

    @And("click on login button")
    public void click_on_login_button() {
        getLoginPage().clickSignIn();
    }

    @Then("Home page visible")
    public void home_page_visible() {


    }

}
