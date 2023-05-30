package org.example.steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class DynamicLoadingSteps {
    public SelenideElement startButton;
    SelenideElement dynamicLoadingLink = $("a[href='/dynamic_loading']");
    SelenideElement finishText = $("div[id='finish'] h4");


    @Given("^Перехожу на страницу динамической загрузки$")
    public void goToDynamicLoadingPage() {
        dynamicLoadingLink.click();
    }

    @When("^перехожу на страницу Example (\\d+) и нажимаю кнопку '(.*)'$")
    public void clickExampleLink(int exampleNumber, String buttonName) {
        SelenideElement exampleLink = $("a[href='/dynamic_loading/" + exampleNumber + "']");
        exampleLink.click();
        startButton = $(byText(buttonName));
        startButton.click();
    }

    @Then("^должен увидеть сообщение '(.*)'$")
    public void verifyMessage(String expectedMessage) {
        finishText.shouldHave(text(expectedMessage), Duration.ofSeconds(18));
    }
}
