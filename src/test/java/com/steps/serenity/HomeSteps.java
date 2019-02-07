package com.steps.serenity;

import com.pages.HomePage;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.hasItem;

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
        homePage.open();
    }

    @Step
    public void beginSearch(String keyword) {
        enterKeyword(keyword);
        pressSubmit();
    }

    @Step
    public void checkResults(String keyword) {

        System.out.println("Keyword = " + keyword);
        System.out.println(homePage.findTitle(keyword));

        Assert.assertTrue("Failed because title is not as expected", homePage.findTitle(keyword));

    }

}
