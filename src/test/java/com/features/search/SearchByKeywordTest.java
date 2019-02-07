package com.features.search;

import com.pages.HomePage;
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

    @Test
    public void searchForReligionForKeyword() {
        user.openHomepage();
        user.beginSearch("religion");
        user.checkResults("religion");
    }

//    @Test
//    public void searchForTestingForKeyword() {
//        user.openHomepage();
//        user.beginSearch("testing");
//        user.checkResults("testing");
//    }
}
