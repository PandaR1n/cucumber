package org.example.steps;

import com.codeborne.selenide.Selenide;


import cucumber.api.java.en.Given;

public class CommonSteps {

    @Given("^Открываем сайт '(.+)'$")
    public void открываемСаит(String URL) {

        Selenide.open(URL);
    }
}
