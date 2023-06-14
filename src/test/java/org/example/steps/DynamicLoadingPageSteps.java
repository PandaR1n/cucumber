package org.example.steps;


import com.codeborne.selenide.SelenideElement;
import org.example.pages.DynamicLoadingPageSelectors;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.time.Duration;

import static com.codeborne.selenide.Condition.text;
import static org.junit.Assert.assertEquals;

public class DynamicLoadingPageSteps {


    @When("^перехожу на страницу Example (\\d+) и нажимаю кнопку '(.*)'$")
    public void clickExampleLink(int exampleNumber, String buttonName) {
        SelenideElement exampleLink = DynamicLoadingPageSelectors.getExampleLink(exampleNumber);
        exampleLink.click();
        SelenideElement startButton = DynamicLoadingPageSelectors.getStartButton(buttonName);
        startButton.click();
    }

    @Then("^должен увидеть сообщение '(.*)'$")
    public void verifyMessage(String expectedMessage) {
        SelenideElement finishText = DynamicLoadingPageSelectors.getFinishText();
        finishText.shouldHave(text(expectedMessage), Duration.ofSeconds(18));
        assertEquals(expectedMessage, finishText.text());
    }
}