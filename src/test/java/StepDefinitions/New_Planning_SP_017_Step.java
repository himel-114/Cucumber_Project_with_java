package StepDefinitions;

        import Pages.Page;
        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;

public class New_Planning_SP_017_Step extends Page {



    @And("click Planning Unit Type")
    public void click_Planning_Unit_Type() throws InterruptedException {
        getPlanning_unit_sp_017().setClickPlanningUnitType();
        Thread.sleep(5000);
    }

    @And("click Planning Unit Testing")
    public void click_Planning_Unit_Testing() throws InterruptedException {
        getPlanning_unit_sp_017().setClickTesting();
        Thread.sleep(5000);
    }

}
