package Steps;

import Pages.HomePage;
import Pages.LaptopsPage;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import io.qameta.allure.Step;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.reflect.Array;

public class LeptopSteps {

    HomePage homePage = new HomePage();
    LaptopsPage page = new LaptopsPage();

    @Step("i am gonna click on laptops section")
    public LeptopSteps laptopsClick() {
        homePage.laptops.hover();
        homePage.showLeptops.shouldBe(Condition.visible);
        homePage.showLeptops.click();
        return this;
    }

    @Step("sorting by hight > low here")
    public LeptopSteps sorting() {
        page.sortByPrice.click();
        return this;
    }

    @Step("check sorting hight > low here")
    public LeptopSteps checkSort() {
        for(int i = 0;i < page.prices.size() - 1;i++) {
            String Firsttext = page.prices.get(i).getText();
            int Firstsize = Firsttext.length();
            int FirstthousendsNum = Integer.parseInt(Firsttext.substring(1,2));
            String Secondtext = page.prices.get(i + 1).getText();
            int Secondsize = Secondtext.length();
            int SecondthousendsNum = Integer.parseInt(Secondtext.substring(1,2));
            if(Firstsize > Secondsize) {
                Assert.assertTrue(true, "sorted well");
            } else if(Firstsize == Secondsize) {
                if(FirstthousendsNum >= SecondthousendsNum) {
                    Assert.assertTrue(true, "sorted well");
                } else {
                    Assert.assertTrue(false,"not good sorted,second thousend number is greater than previous");
                }
            }
            else {
                Assert.assertTrue(false,"not good sorted");
            }
        }
        return this;
    }


}
