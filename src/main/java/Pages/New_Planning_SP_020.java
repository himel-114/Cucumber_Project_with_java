package Pages;

        import org.openqa.selenium.By;

        import java.util.concurrent.TimeUnit;

        import static Core.WebConnector.driver;

public class New_Planning_SP_020 {



    private By clickSaveButton = By.xpath("//planningunit-subheader-tab/div[2]/app-new-planning-unit[1]/kendo-window[2]/div[1]/div[1]/app-planning-unit-type-edit[1]/div[1]/div[1]/div[1]/button[2]");




    public New_Planning_SP_020(Page page) {

    }


    public void setClickSaveButton() throws InterruptedException {
        driver.findElement(clickSaveButton).click();
        Thread.sleep(5000);

    }

}
