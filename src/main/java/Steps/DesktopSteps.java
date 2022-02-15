package Steps;

import Pages.DesktopsPage;
import Pages.HomePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class DesktopSteps {

    HomePage homePage = new HomePage();
    DesktopsPage page = new DesktopsPage();

    @Step("go to desktops section")
    public DesktopSteps clickDesktops() {
        homePage.desktop.hover();
        homePage.showDesktops.shouldBe(Condition.visible);
        homePage.showDesktops.click();
        return this;
    }

    @Step("go to mp3 player")
    public DesktopSteps clickMp3Player() {
        page.mp3Player.click();
        return this;
    }

    @Step("move to ipod shuffle")
    public DesktopSteps moveToIpod() {
        page.ipod.scrollIntoView(true);
        System.out.println(page.ipod.hover().text());
        return this;
    }
}
