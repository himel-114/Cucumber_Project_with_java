package Pages;

import Core.ConfigUtil;
import Core.WebConnector;
import org.openqa.selenium.WebDriver;

import java.util.Properties;

public class Page {

    public static Properties myProp = ConfigUtil.getConfig("config");
    public WebDriver driver = WebConnector.driver;

    LoginPage loginPage = new LoginPage(this);
    protected LoginPage getLoginPage() { return loginPage; }

    Planning_Unit_SP_011 planning_Unit_SP_011 = new Planning_Unit_SP_011(this);
    protected Planning_Unit_SP_011 getPlanning_Unit_SP_011(){return planning_Unit_SP_011;}


    Planning_Unit_SP_012 planning_unit_sp_012 = new Planning_Unit_SP_012(this);
    protected Planning_Unit_SP_012 getPlanning_unit_sp_012(){return planning_unit_sp_012;}

    New_Planning_SP_013 new_Planning_SP_013 = new New_Planning_SP_013(this);
    protected New_Planning_SP_013 getPlanning_unit_sp_013(){return new_Planning_SP_013;}

    New_Planning_SP_014 new_Planning_SP_014 = new New_Planning_SP_014(this);
    protected New_Planning_SP_014 getPlanning_unit_sp_014(){return new_Planning_SP_014;}

    New_Planning_SP_015 new_planning_sp_015 = new New_Planning_SP_015(this);
    protected New_Planning_SP_015 getPlanning_unit_sp_015(){return new_planning_sp_015;}

    New_Planning_SP_016 new_planning_sp_016 = new New_Planning_SP_016(this);
    protected New_Planning_SP_016 getPlanning_unit_sp_016(){return new_planning_sp_016;}

    New_Planning_SP_017 new_planning_sp_017 = new New_Planning_SP_017(this);
    protected New_Planning_SP_017 getPlanning_unit_sp_017(){return new_planning_sp_017;}

    New_Planning_SP_018 new_planning_sp_018 = new New_Planning_SP_018(this);
    protected New_Planning_SP_018 getPlanning_unit_sp_018(){return new_planning_sp_018;}

    New_Planning_SP_019 new_planning_sp_019 = new New_Planning_SP_019(this);
    protected New_Planning_SP_019 getPlanning_unit_sp_019(){return new_planning_sp_019;}

    New_Planning_SP_020 new_planning_sp_020 = new New_Planning_SP_020(this);
    protected New_Planning_SP_020 getPlanning_unit_sp_020(){return new_planning_sp_020;}
}
