package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary")
public class HomePage extends AbstractPage {

    @FindBy(css = "input#searchInput")
    WebElementFacade searchTerm;

    @FindBy(css = "input#searchButton")
    WebElementFacade searchButton;

    @FindBy(css = "#firstHeading")
    WebElementFacade searchTitle;

    @FindBy(css = "#p-namespaces ul li#ca-talk")
    WebElementFacade searchDiscussionTab;

    @FindBy(css = "#p-namespaces ul li#ca-nstab-citations")
    WebElementFacade searchCitationTab;

    public void enterKeyInSearchField(String keyword) {
        searchTerm.type(keyword);
    }

    public void pressGoButton() {
        searchButton.click();
    }

    public void selectDiscussionTab() {
        searchDiscussionTab.click();
    }

    public void selectCitationTab() {
        searchCitationTab.click();
    }

    public void compareTitleInPage(String keyword) {
        //     System.out.println("Keyword = " + keyword);
        Assert.assertTrue("Failed because title is not as expected", searchTitle.containsText(keyword));
    }

    public void compareTabTextWithKeyword(String keyword) {
//        System.out.println("Discussion title text = " + searchDiscussionTab.getText());
//        System.out.println("Citation title text = " + searchCitationTab.getText());

        Assert.assertTrue("Same titles in both tabs.", !searchDiscussionTab.getText().equals(searchCitationTab.getText()));
    }
}