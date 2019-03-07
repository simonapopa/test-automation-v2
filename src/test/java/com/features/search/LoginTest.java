package com.features.search;

import com.pages.AbstractPage;
import com.steps.serenity.LoginSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class LoginTest {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    LoginSteps user;

    @Test
    public void accessLoginPageForAnUnauthenticatedUser() {
        user.openHomepage();
        user.checkUserStatus();
        user.goToLoginPageByLoginLink();
        user.confirmCurrentPageIsLogin();
    }

    @Test
    public void submitEmptyForm() {
        user.submitForm();
    }

    @Test
    public void submitIncorrectCredentials() {
        user.enterInvalidCredentials();
        user.submitForm();
    }
}
