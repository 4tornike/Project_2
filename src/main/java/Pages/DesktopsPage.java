package Pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.byTitle;
import static com.codeborne.selenide.Selenide.$;

public class DesktopsPage {

    public SelenideElement
            mp3Player = $(byText("MP3 Players (4)")),
            ipod = $(byTitle("iPod Shuffle"));


}
