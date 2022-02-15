package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public SelenideElement
            myAccount = $(".fa.fa-user"),
            register = $(byText("Register"));

}
