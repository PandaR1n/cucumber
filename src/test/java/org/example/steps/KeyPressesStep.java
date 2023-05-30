package org.example.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class KeyPressesStep {
    @Given("^Перехожу на страинцу '(.*)'$")
    public void TheKeyPressesPage(String btnKeyPress) {
        $(byText(btnKeyPress)).click();
    }

    @When("^нажимаю клавишу '(.*)'$")
    public void PressTheKey(String key) {
        $("input[type='text']").sendKeys(key);
    }

    @Then("^должен увидеть результат '(.*)'$")
    public void iShouldSeeTheResult(String result) {
        $("#result").shouldHave(text(result));
    }
}
