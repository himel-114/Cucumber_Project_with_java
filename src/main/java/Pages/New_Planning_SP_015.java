package Pages;

        import org.openqa.selenium.By;

        import java.util.concurrent.TimeUnit;

        import static Core.WebConnector.driver;

public class New_Planning_SP_015 {


    private By clickPlanningUnitTitle = By.xpath("//planningunit-subheader-tab/div[2]/app-new-planning-unit[1]/kendo-window[1]/div[1]/div[1]/div[1]/div[2]/input[1]");




    public New_Planning_SP_015(Page page) {

    }


    public void setClickPlanningUnitTitle(String title) throws InterruptedException {
        driver.findElement(clickPlanningUnitTitle).sendKeys(title);
        Thread.sleep(5000);

    }



}
