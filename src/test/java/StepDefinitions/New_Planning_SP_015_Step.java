package StepDefinitions;

        import Pages.Page;
        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;

public class New_Planning_SP_015_Step extends Page {



//    @And("click Unit Title")
//    public void click_Unit_Title() throws InterruptedException {
//        getPlanning_unit_sp_015().setClickThreeDot();
//        Thread.sleep(5000);
//    }


    @And("click Unit Title {string}")
    public void user_enter_password(String Title) throws InterruptedException {
        getPlanning_unit_sp_015().setClickPlanningUnitTitle(Title);
        Thread.sleep(2000);
    }

}
