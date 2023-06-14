package org.example.steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.FormAuthenticationPageSelectors;

import static org.junit.Assert.assertTrue;


public class FormAuthenticationPageSteps {


    @When("ввожу '(.*)' в поле '(.*)'")
    public void enterTextInField(String text, String fieldId) {
        SelenideElement inputField = FormAuthenticationPageSelectors.getInputField(fieldId);
        inputField.setValue(text);
    }

        @When("нажимаю кнопку '(.*)'")
        public void clickButton (String buttonText){
            SelenideElement button = FormAuthenticationPageSelectors.getButton(buttonText);
            button.click();
        }

        @Then("вижу сообщение об успешном входе")
        public void verifySuccessMessage () {
            SelenideElement successMessage = FormAuthenticationPageSelectors.getSuccessMessage();
            assertTrue(successMessage.exists());
        }
    }

