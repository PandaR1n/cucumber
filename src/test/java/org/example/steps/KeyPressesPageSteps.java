package org.example.steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.KeyPressesPageSelectors;
import org.openqa.selenium.Keys;

import static org.junit.Assert.assertEquals;

public class KeyPressesPageSteps {



    @When("^нажимаю клавишу '(.*)'$")
    public void pressTheKey(String key) {
        Keys convertedKey = Keys.valueOf(key.toUpperCase());
        KeyPressesPageSelectors.inputTextSelector.sendKeys(convertedKey);
    }

    @Then("^должен увидеть результат '(.*)'$")
    public void verifyResultText(String expectedText) {
        String resultText = KeyPressesPageSelectors.resultSelector.getText();
        assertEquals(expectedText, resultText);
    }
}
