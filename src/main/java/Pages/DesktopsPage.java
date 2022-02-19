package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class DesktopsPage {

    public SelenideElement
            mp3Player = $(byText("MP3 Players (4)")),
            ipod = $(byTitle("iPod Nano")),
            ipodLink = $(byXpath("//a[text()='iPod Nano']")),
            cart = $("#button-cart"),
            items = $("#cart-total"),
            checkout = $("strong .fa-share");


}
