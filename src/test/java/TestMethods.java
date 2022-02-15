import Data.DBInsert;
import Data.GetData;
import Steps.HomeSteps;
import Steps.RegisterSteps;
import com.codeborne.selenide.Configuration;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestMethods {

    HomeSteps homeSteps = new HomeSteps();
    RegisterSteps registerSteps = new RegisterSteps();

    @BeforeMethod

    public void setUp() {
        Configuration.timeout = 7000;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        Configuration.browserCapabilities = options;
//        Configuration.holdBrowserOpen = true;
        open("http://tutorialsninja.com/demo/");
    }

    @Test

    public void register() {

        homeSteps.accountClick()
                .registerClick();
        registerSteps.generateData()
                .fillName()
                .fillLastName()
                .fillEmail()
                .fillPhone()
                .fillPassword()
                .ConfirmPassword();

    }
}
