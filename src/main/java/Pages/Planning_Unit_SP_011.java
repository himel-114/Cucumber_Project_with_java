package Pages;

        import org.openqa.selenium.By;

        import java.util.concurrent.TimeUnit;

        import static Core.WebConnector.driver;

public class Planning_Unit_SP_011 {

//    private By InputUsername = By.xpath("//input[@id='Username']");
//    private By InputPassword = By.xpath("//input[@id='Password']");
//    private By clickBtn = By.xpath("//button[contains(text(),'Login')]");
    private By clickallplanningButton = By.xpath("//body/app-root[1]/div[1]/app-nav-menu[1]/aside[1]/div[1]/nav[1]/ul[1]/li[2]");



    public Planning_Unit_SP_011(Page page) {

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

    public void setPlanningButton(){
        driver.findElement(clickallplanningButton).click();
    }


}
