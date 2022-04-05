package StepDefinitions;

        import Pages.Page;
        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;

public class New_Planning_SP_020_Step extends Page {



    @And("click save Button")
    public void click_save_Button() throws InterruptedException {
        getPlanning_unit_sp_020().setClickSaveButton();
        Thread.sleep(5000);
    }



}
