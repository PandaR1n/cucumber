package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;

public class KeyPressesPageSelectors {
    public static final SelenideElement inputTextSelector = $("input[type='text']");
    public static final SelenideElement resultSelector = $("#result");
}