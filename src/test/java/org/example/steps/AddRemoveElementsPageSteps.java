package org.example.steps;


import com.codeborne.selenide.CollectionCondition;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.example.pages.AddRemoveElementsPageSelectors;

import static com.codeborne.selenide.Condition.visible;

public class AddRemoveElementsPageSteps {



    @When("^Нажимаем кнопку Add Element '(\\d+)' раз$")
    public void clickAddElementButtonXTimes(int clicks) {
        for (int c = 0; c < clicks; c++) {
            AddRemoveElementsPageSelectors.addElementBtn.click();
        }
    }

    @Then("^На странице отображается новый элемент, проверяем что их количество равно '(\\d+)'$")
    public void verifyNumberOfElements(int expectedElements) {
        AddRemoveElementsPageSelectors.deleteBtns.shouldHave(CollectionCondition.size(expectedElements));
    }

    @When("^Нажимаем кнопку Delete '(\\d+)' раз$")
    public void clickDeleteButtonXTimes(int clicks) {
        for (int i = 0; i < clicks; i++) {
            AddRemoveElementsPageSelectors.deleteBtns.filterBy(visible).first().click();
        }
    }

    @Then("^Проверяем что элемент удален и осталось элементов '(\\d+)'$")
    public void verifyRemainingElements(int expectedRemainder) {
        AddRemoveElementsPageSelectors.deleteBtns.shouldHave(CollectionCondition.size(expectedRemainder));
    }
}

