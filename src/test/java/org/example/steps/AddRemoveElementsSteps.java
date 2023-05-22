package org.example.steps;

 import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

    public class AddRemoveElementsSteps {
        SelenideElement getAddRemove = $("a[href='/add_remove_elements/']");
        SelenideElement addElementBtn = $("button[onclick='addElement()']");
        SelenideElement deleteBtn = $(".added-manually");

        @Given("^Переходим на страницу с добавлением и удалением элементов$")
        public void переходимНаСтраницуСДобавлениемИУдалениемЭлементов() {
            getAddRemove.click();
        }

        @When("^Нажимаем кнопку Add Element '(\\d+)' раза$")
        public void нажимаемКнопкуAddElementРаза(int clicks) {
            for (int c = 0; c < clicks; c++) {
                addElementBtn.click();
            }
            deleteBtn.shouldHave(CollectionCondition.size(clicks));
            for (int d = 0; d < clicks; d++) {
                deleteBtn.click();
            }
            deleteBtn.shouldBe(visible);
            deleteBtn.shouldHave(CollectionCondition.size(0));
        }
    }