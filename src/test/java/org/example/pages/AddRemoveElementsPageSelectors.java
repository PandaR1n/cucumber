package org.example.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;


public class AddRemoveElementsPageSelectors {
    public static final SelenideElement addElementBtn = $("button[onclick='addElement()']");
    public static final ElementsCollection deleteBtns = $$(".added-manually");
}