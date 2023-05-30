package org.example.steps;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class HoversStep {
    @Given("^Перехожу на страницу Hover$")
    public void iAmOnTheHoverPage() {
        $("a[href='/hovers']").click();
    }

    @When("^Навожу курсор на аватар пользователя 1$")
    public void iHoverOverUserAvatar1() {
        $("div[class='figure']").click();
    }

    @Then("^Должен увидеть имя пользователя '(.*)'$")
    public void iShouldSeeUserName(String userName) {
        $(".figcaption h5").shouldHave(text(userName));
    }
}
