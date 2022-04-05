package Pages;

        import org.openqa.selenium.By;

        import java.util.concurrent.TimeUnit;

        import static Core.WebConnector.driver;

public class New_Planning_SP_018 {



    private By clickEditButton = By.xpath("//planningunit-subheader-tab/div[2]/app-new-planning-unit[1]/kendo-window[1]/div[1]/div[1]/div[2]/div[2]/span[2]");




    public New_Planning_SP_018(Page page) {

    }


    public void setClickEditButton() throws InterruptedException {
        driver.findElement(clickEditButton).click();
        Thread.sleep(5000);

    }

}
