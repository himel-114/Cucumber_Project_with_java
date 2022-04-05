package Pages;

        import org.openqa.selenium.By;

        import static Core.WebConnector.driver;

public class New_Planning_SP_014 {


    private By clickThreeDot = By.xpath("//span[@id='dropdownMenuButton']");
    private By clickNewPlanningUnit = By.xpath("//span[contains(text(),'New Planning Unit')]");



    public New_Planning_SP_014(Page page) {

    }



    public void setClickThreeDot() throws InterruptedException {
        driver.findElement(clickThreeDot).click();
        Thread.sleep(5000);

    }
    public void setClickNewPlanningUnit() throws InterruptedException {
        driver.findElement(clickNewPlanningUnit).click();
        Thread.sleep(5000);

    }



}
