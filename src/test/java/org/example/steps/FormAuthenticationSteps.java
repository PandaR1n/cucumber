package org.example.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.$;

public class FormAuthenticationSteps {
    SelenideElement FormAuthenticationPage = $("a[href='/login']");

    @Given("Перехожу на страницу для ввода логина и пароля")
    public void openLoginPage() {
        FormAuthenticationPage.click();
    }

    @When("ввожу '(.*)' в поле '(.*)'")
    public void enterTextInField(String text, String fieldId) {
        $(byCssSelector("input[name='"+fieldId+"']")).setValue(text);
    }


    @And("нажимаю кнопку '(.*)'")
    public void clickButton(String buttonText) {
        $(byText(buttonText)).click();
    }

    @Then("вижу сообщение об успешном входе")
    public void verifySuccessMessage() {
        $(".flash.success").should(Condition.exist);
    }
}
