package org.example.steps;

import com.codeborne.selenide.Condition;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.CheckBoxPageSelectors;


public class CheckBoxPageSteps {
    public final CheckBoxPageSelectors checkBoxPage = new CheckBoxPageSelectors();


    @When("Нажимаем на фалжок")
    public void i_toggle_the_checkbox() {
        checkBoxPage.CHECKBOX_SELECTOR.click();
    }

    @Then("Проверяем что флажок нажат")
    public void the_checkbox_should_be_checked() {
        checkBoxPage.CHECKBOX_SELECTOR.shouldBe(Condition.selected);
    }
}