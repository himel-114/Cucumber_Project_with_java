package Pages;

        import org.openqa.selenium.By;

        import java.util.concurrent.TimeUnit;

        import static Core.WebConnector.driver;

public class New_Planning_SP_017 {


    private By clickPlanningUnitType = By.xpath("//planningunit-subheader-tab/div[2]/app-new-planning-unit[1]/kendo-window[1]/div[1]/div[1]/div[2]/div[2]/kendo-dropdownlist[1]/span[1]/span[2]/span[1]");
    private By clickTesting = By.cssSelector("body > app-root:nth-child(1) > kendo-popup:nth-child(3) > div:nth-child(1) > kendo-list:nth-child(2) > div:nth-child(1) > ul:nth-child(1) > li:nth-child(3)");




    public New_Planning_SP_017(Page page) {

    }


    public void setClickPlanningUnitType() throws InterruptedException {
        driver.findElement(clickPlanningUnitType).click();
        Thread.sleep(5000);

    }
    public void setClickTesting() throws InterruptedException {
        driver.findElement(clickTesting).click();
        Thread.sleep(5000);

    }


}
