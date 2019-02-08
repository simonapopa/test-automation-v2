package com.features.search;

import com.steps.serenity.HomeSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class SearchByKeywordTest {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    HomeSteps user;

//    @Test
//    //Do search for keyword, click on Discussion and Citation tab, then validate title in each page vs keyword
//    public void searchForAppleForKeyword() {
//        user.openHomepage();
//        user.beginSearch("apple");
//        user.checkResults("apple");
//        user.clickOnDiscussionTab();
//        user.checkResults("apple");
//        user.clickOnCitationTab();
//        user.checkResults("apple");
//    }

    @Test
    public void accessTabAndValidateTitleVsKeyword() {
        user.openHomepage();
        user.beginSearch("apple");
        user.checkResults("apple");
        user.clickOnDiscussionTab();
        user.checkTabTextInTab("apple");
        user.clickOnCitationTab();
        user.checkTabTextInTab("apple");
    }

//    @Test
//    public void checkLoginStatus() {
//
//    }

//    @Test
//    public void searchForTestingForKeyword() {
//        user.openHomepage();
//        user.beginSearch("testing");
//        user.checkResults("testing");
//    }


}
