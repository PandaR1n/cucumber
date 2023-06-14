package org.example.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DynamicLoadingPageSelectors {
    public static SelenideElement getExampleLink(int exampleNumber) {
        return $("a[href='/dynamic_loading/" + exampleNumber + "']");
    }

    public static SelenideElement getStartButton(String buttonName) {
        return $(byText(buttonName));
    }

    public static SelenideElement getFinishText() {
        return $("div[id='finish'] h4");
    }
}