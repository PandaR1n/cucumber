package org.example.pages;


import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$x;

public class CheckBoxPageSelectors {

    public static SelenideElement CHECKBOX_SELECTOR = $x("//*[text()=' checkbox 1']/input");

}