package Pages;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

import static Core.WebConnector.driver;

public class New_Planning_SP_019 {



    private By clickPlanningUnitTitle = By.xpath("//input[@id='planningUnitTypeTitle']");




    public New_Planning_SP_019(Page page) {

    }


    public void setClickPlanningUnitTitle(String Title) throws InterruptedException {
        driver.findElement(clickPlanningUnitTitle).sendKeys(Title);
        Thread.sleep(5000);

    }

}
