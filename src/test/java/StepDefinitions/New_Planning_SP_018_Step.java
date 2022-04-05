package StepDefinitions;

        import Pages.Page;
        import io.cucumber.java.en.And;
        import io.cucumber.java.en.Given;
        import io.cucumber.java.en.Then;
        import io.cucumber.java.en.When;

public class New_Planning_SP_018_Step extends Page {



    @And("click Edit Button")
    public void click_Edit_Button() throws InterruptedException {
        getPlanning_unit_sp_018().setClickEditButton();
        Thread.sleep(5000);
    }


}
