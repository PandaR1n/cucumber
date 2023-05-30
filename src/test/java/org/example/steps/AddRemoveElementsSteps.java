package org.example.steps;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.CollectionCondition.size;

public class AddRemoveElementsSteps {
    SelenideElement getAddRemove = $("a[href='/add_remove_elements/']");
    SelenideElement addElementBtn = $("button[onclick='addElement()']");
    ElementsCollection deleteBtns = $$(".added-manually");

    @Given("^Переходим на страницу с добавлением и удалением элементов$")
    public void переходимНаСтраницуСДобавлениемИУдалениемЭлементов() {
        getAddRemove.click();
    }

    @When("^Нажимаем кнопку Add Element '(\\d+)' раз$")
    public void нажимаемКнопкуAddElementРаза(int clicks) {
        for (int c = 0; c < clicks; c++) {
            addElementBtn.click(); // нажали на кнопку 3 раза
        }
    }

    @Then("^На странице отображается новый элемент, проверяем что их количество равно '(\\d+)'$")
    public void наСтраницеОтображаетсяНовыиЭлементПроверяемКоличествоРавно(int expectedElements) {
        deleteBtns.shouldHave(size(expectedElements));  // проверили что она нажата 3 раза
    }

    @When("^Нажимаем кнопку Delete '(\\d+)' раз$")
    public void нажимаемКнопкуDelete(int clicks) {
        for (int i = 0; i < clicks; i++) {
            deleteBtns.filterBy(visible).first().click(); //  нажали 1 раз первый попавшийся  Delete ( проверили видимые )
        }
    }

    @Then("^Проверяем что элемент удален и осталось элементов '(\\d+)'$")
    public void проверяемЧтоЭлементУдаленИОсталосьЭлементов(int expectedRemainder) {
        deleteBtns.shouldHave(size(expectedRemainder)); // проверям что их осталось 2
    }
}