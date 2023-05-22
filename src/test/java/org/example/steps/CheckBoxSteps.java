package org.example.steps;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import static com.codeborne.selenide.Selenide.*;


public class CheckBoxSteps {
    SelenideElement getCHECKBOX_SELECTOR = $("a[href='/checkboxes']");
    SelenideElement CHECKBOX_SELECTOR = $x("//*[text()=' checkbox 1']/input");

    @Given("^Переходим на страницу с флажками$")
    public void goToPageFlags() {

        getCHECKBOX_SELECTOR.click();
    }

    @When("Нажимаем на фалжок")
    public void i_toggle_the_checkbox() {
        CHECKBOX_SELECTOR.click();
        System.out.println("Флажок установлен");
    }

    @Then("Проверяем что флажок нажат")
    public void the_checkbox_should_be_checked() {
        CHECKBOX_SELECTOR.shouldBe(Condition.selected);
        System.out.println("Проверяю что нажат");
    }


}