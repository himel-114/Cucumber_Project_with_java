package Pages;

        import org.openqa.selenium.By;

        import java.util.concurrent.TimeUnit;

        import static Core.WebConnector.driver;

public class New_Planning_SP_016 {


    private By clickPlanningUnitManager = By.xpath("//planningunit-subheader-tab/div[2]/app-new-planning-unit[1]/kendo-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/lazy-dropdown[1]/button[1]/i[1]");
    private By clickPlanningUnitManagerSearch = By.xpath("//planningunit-subheader-tab/div[2]/app-new-planning-unit[1]/kendo-window[1]/div[1]/div[1]/div[2]/div[1]/div[1]/lazy-dropdown[1]/div[1]/div[1]/input[1]");


//2050, SNDI

    public New_Planning_SP_016(Page page) {

    }


    public void setClickPlanningUnitManager() throws InterruptedException {
        driver.findElement(clickPlanningUnitManager).click();
        Thread.sleep(5000);

    }
    public void setClickPlanningUnitManagerSearch(String search) throws InterruptedException {
        driver.findElement(clickPlanningUnitManagerSearch).sendKeys(search);
        Thread.sleep(5000);

    }


}
