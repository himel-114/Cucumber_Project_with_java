package Pages;

        import org.openqa.selenium.By;

        import static Core.WebConnector.driver;

public class New_Planning_SP_013 {


    private By clickallUnits = By.xpath("//span[normalize-space()='View All Units']");



    public New_Planning_SP_013(Page page) {

    }



    public void setAllUnits() throws InterruptedException {
        driver.findElement(clickallUnits).click();
        Thread.sleep(5000);

    }


}
