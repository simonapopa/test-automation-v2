package com.steps.serenity;

import com.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class HomeSteps {
    HomePage homePage;

    @Step
    public void enterKeyword(String keyword) {
        homePage.enterKeyInSearchField(keyword);
    }

    @Step
    public void pressSubmit() {
        homePage.pressGoButton();
    }

    @Step
    public void openHomepage() {
        homePage.windowMaximize();
        homePage.open();

    }

    @Step
    public void beginSearch(String keyword) {
        enterKeyword(keyword);
        pressSubmit();
    }

    @Step
    public void clickOnDiscussionTab() {
        homePage.selectDiscussionTab();
    }

    @Step
    public void clickOnCitationTab() {
        homePage.selectCitationTab();
    }

    @Step
    public void checkTabTextInTab(String keyword) {
        homePage.compareTabTextWithKeyword(keyword);
    }

    @Step
    public void checkResults(String keyword) {
        homePage.compareTitleInPage(keyword);
    }
}
