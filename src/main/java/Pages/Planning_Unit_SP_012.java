package Pages;

        import org.openqa.selenium.By;

        import java.util.concurrent.TimeUnit;

        import static Core.WebConnector.driver;

public class Planning_Unit_SP_012 {

    //    private By InputUsername = By.xpath("//input[@id='Username']");
//    private By InputPassword = By.xpath("//input[@id='Password']");
//    private By clickBtn = By.xpath("//button[contains(text(),'Login')]");
    private By clickallplanning = By.xpath("//a[contains(text(),'All Planning')]");



    public Planning_Unit_SP_012(Page page) {

    }


//    public void setInputUsername(String username)  {
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(InputUsername).sendKeys(username);
//    }
//    public void setInputPassword(String password){
//        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        driver.findElement(InputPassword).sendKeys(password);
//    }
//    public void clickSignIn(){
//        driver.findElement(clickBtn).click();
//    }

    public void setallPlanningButton() throws InterruptedException {
        driver.findElement(clickallplanning).click();
        Thread.sleep(5000);
    }


}
