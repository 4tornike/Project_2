import Steps.DesktopSteps;
import Steps.HomeSteps;
import Steps.LeptopSteps;
import Steps.RegisterSteps;
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Description;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;

public class TestMethods {

    HomeSteps homeSteps = new HomeSteps();
    RegisterSteps registerSteps = new RegisterSteps();
    LeptopSteps leptopSteps = new LeptopSteps();
    DesktopSteps desktopSteps = new DesktopSteps();

    @BeforeMethod

    public void setUp() {
        Configuration.timeout = 7000;
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        Configuration.browserCapabilities = options;
        Configuration.holdBrowserOpen = true;
        open("http://tutorialsninja.com/demo/");
    }

    @Test(description = "register on page")
    @Description("i will register with driven data from database")
    public void register() {
        homeSteps.accountClick()
                .registerClick();
        registerSteps.generateData()
                .fillName()
                .fillLastName()
                .fillEmail()
                .fillPhone()
                .fillPassword()
                .ConfirmPassword()
                .acceptPolicy()
                .submit();
    }

    @Test(description = "checking laptops page sorted")
    @Description("i will go to laptops section and check sort hight > low")
    public void checkLaptopsSort() {
        leptopSteps.laptopsClick()
                .sorting()
                .checkSort();
    }

    @Test(description = "")
    @Description("")
    public void test3() {
        desktopSteps.clickDesktops()
                .clickMp3Player()
                .moveToIpod();
    }
}
