package StepDefinitions;

        import Pages.Page;
        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;

public class New_Planning_SP_014_Step extends Page {



    @And("click Three dot")
    public void click_Three_dot() throws InterruptedException {
        getPlanning_unit_sp_014().setClickThreeDot();
        Thread.sleep(5000);
    }

    @And("click New Planning Unit")
    public void click_New_Planning_Unit() throws InterruptedException {
        getPlanning_unit_sp_014().setClickNewPlanningUnit();
        Thread.sleep(5000);
    }



}
