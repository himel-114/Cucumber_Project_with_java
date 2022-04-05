package StepDefinitions;

        import Pages.Page;
        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;

public class New_Planning_SP_013_Step extends Page {



    @And("click all ViewUnit button")
    public void click_all_ViewUnit_button() throws InterruptedException {
        getPlanning_unit_sp_013().setAllUnits();
        Thread.sleep(5000);
    }



}
