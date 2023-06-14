package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byCssSelector;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class FormAuthenticationPageSelectors {
    public static SelenideElement getInputField(String fieldId) {
        return $(byCssSelector("input[name='" + fieldId + "']"));
    }

    public static SelenideElement getButton(String buttonText) {
        return $(byText(buttonText));
    }

    public static SelenideElement getSuccessMessage() {
        return $(".flash.success");
    }
}