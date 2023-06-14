package org.example.steps;

import com.codeborne.selenide.SelenideElement;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.pages.HoversPageSelectors;
import static com.codeborne.selenide.Condition.text;
import static org.junit.Assert.assertEquals;

public class HoversPageSteps {
    @When("^Навожу курсор на аватар пользователя 1$")
    public void hoverOverUserAvatar() {
        HoversPageSelectors.userAvatar.hover();
    }

    @Then("^Должен увидеть имя пользователя '(.*)'$")
    public void verifyUserName(String expectedUserName) {
        SelenideElement userName = HoversPageSelectors.userName;
        String actualUserName = userName.text().replace("name: ", "");
        userName.shouldHave(text(expectedUserName));
        assertEquals(expectedUserName, actualUserName);
    }
}