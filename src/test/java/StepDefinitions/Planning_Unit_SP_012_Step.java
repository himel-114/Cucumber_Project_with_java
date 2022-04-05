package StepDefinitions;

        import Pages.Page;
        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;

public class Planning_Unit_SP_012_Step extends Page {


//    @Given("user Enter username {string}")
//    public void user_Enter_username(String username) {
//        getLoginPage().setInputUsername(username);
//    }
//
//    @And("user Enter password {string}")
//    public void user_enter_password(String password) {
//        getLoginPage().setInputPassword(password);
//    }
//
//    @And("click on login button")
//    public void click_on_login_button() {
//        getLoginPage().clickSignIn();
//    }

    @And("click all planning button")
    public void click_all_planning_button() throws InterruptedException {
        getPlanning_unit_sp_012().setallPlanningButton();
        Thread.sleep(5000);
    }


//    @Then("Home page visible")
//    public void home_page_visible() {
//
//
//    }

}
