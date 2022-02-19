package Steps;

import Pages.DesktopsPage;
import Pages.HomePage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

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
        String actualToolTip = page.ipod.getAttribute("title");
        String expectedToolTip = "iPod Nano";
        Assert.assertEquals(expectedToolTip,actualToolTip);
        return this;
    }

    @Step("click on ipod link")
    public DesktopSteps clickIpod() {
        page.ipodLink.click();
        return this;
    }

    @Step("add to cart")
    public DesktopSteps addCart() {
        page.cart.click();
        return this;
    }

    @Step("check by count item was added ")

    public DesktopSteps checkAddedBycount() {
        page.items.shouldBe(Condition.text("1"));
        String countText = page.items.getText().substring(0,1);
        int count = Integer.parseInt(countText);
        if(count > 0) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false,"item does not added");
        }
        return this;
    }

    @Step("check by price item was added")

    public DesktopSteps checkAddedByPrice() {
        String priceText = page.items.getText();
        int ind = priceText.indexOf("$");
        String prevPrice = priceText.substring(ind + 1);
        double price = Double.parseDouble(prevPrice);
        if(price > 0) {
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false,"item does not added");
        }
        return this;
    }
}
