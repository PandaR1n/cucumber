package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class HoversPageSelectors {
    public static final SelenideElement userAvatar = $("div[class='figure']");
    public static final SelenideElement userName = $(".figcaption h5");
}