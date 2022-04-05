package StepDefinitions;

import Pages.Page;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class New_Planning_SP_019_Step extends Page {



    @And("click Planning Unit Titles {string}")
    public void click_Planning_Unit_Titles(String Title) throws InterruptedException {
        getPlanning_unit_sp_019().setClickPlanningUnitTitle(Title);
        Thread.sleep(5000);

    }


}
