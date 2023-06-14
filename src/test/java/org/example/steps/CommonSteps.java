package org.example.steps;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class CommonSteps {

    @Given("^Открываем сайт '(.+)'$")
    public void openUrl(String URL) {
        Selenide.open(URL);
    }

    @And("^Переходим на страницу '(.+)'$")
    public void openPage(String textPage) {
        SelenideElement element = $(byText(textPage));
        element.click();


    }
}

