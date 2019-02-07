package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary")

public class HomePage extends PageObject {

    @FindBy(css = "input#searchInput")
    WebElementFacade searchTerm;

    @FindBy(css = "input#searchButton")
    WebElementFacade searchButton;

    @FindBy(css = "#firstHeading")
    WebElementFacade searchTitle;

    @FindBy(css = "#p-namespaces ul li#ca-talk")
    WebElementFacade searchTab;

    public void enterKeyInSearchField(String keyword) {
        searchTerm.type(keyword);
    }

    public void pressGoButton() {
        searchButton.click();
    }

    public boolean findTitle(String keyword) {
        return searchTitle.containsText(keyword);
    }

    public void selectPageHeaderTab() {
    }
}
