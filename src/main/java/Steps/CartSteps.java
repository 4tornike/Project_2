package Steps;

import Data.GetData;
import Pages.CartPage;
import Pages.DesktopsPage;
import io.qameta.allure.Step;

public class CartSteps {

    DesktopsPage desktopsPage = new DesktopsPage();
    CartPage page = new CartPage();
    GetData data = new GetData();
    @Step("go for checkout")
    public CartSteps clickCheckout() {
        desktopsPage.items.click();
        desktopsPage.checkout.click();
        return this;
    }

    @Step("input name")
    public CartSteps fillName() {
        page.firstName.sendKeys(data.name);
        return this;
    }

    @Step("input lastName")
    public CartSteps fillLastName() {
        page.lastName.sendKeys(data.lastName);
        return this;
    }

    @Step("input company")
    public CartSteps fillCompany() {
        page.company.sendKeys("tbc-it-academy");
        return this;
    }

    @Step("input address 1")
    public CartSteps fillAddress1() {
        page.address1.sendKeys(data.address);
        return this;
    }

    @Step("input address 2")
    public CartSteps fillAddress2() {
        page.address2.sendKeys(data.address);
        return this;
    }


    @Step("input city")
    public CartSteps fillCity() {
        page.city.sendKeys(data.city);
        return this;
    }

    @Step("input post code")
    public CartSteps fillPostCode() {
        page.post.sendKeys("995");
        return this;
    }

    @Step("select country georgea")
    public CartSteps selectCountry() {
        page.country.selectOption(data.country);
        return this;
    }

    @Step("Selecting State tbilisi")
    public CartSteps selectState() {
        page.state.selectOption(data.state);
        return this;
    }

    @Step("click continue btn")
    public CartSteps clickContinue() {
        page.continueBtn.click();
        return this;
    }

}
