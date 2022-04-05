package StepDefinitions;

        import Pages.Page;
        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;

public class New_Planning_SP_016_Step extends Page {



    @And("click Planning Unit Manager")
    public void click_Planning_Unit_Manager() throws InterruptedException {
        getPlanning_unit_sp_016().setClickPlanningUnitManager();
        Thread.sleep(5000);
    }


    @And("user enter search value {string}")
    public void user_enter_search_value(String search) throws InterruptedException {
        getPlanning_unit_sp_016().setClickPlanningUnitManagerSearch(search);
        Thread.sleep(2000);
    }

}
