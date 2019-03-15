package com.steps.serenity;

import com.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;

public class LoginSteps {
    LoginPage loginPage;

    @Step
    public void openHomepage() {
        loginPage.windowMaximize();
        loginPage.open();
    }

    @Step
    public void checkUserStatus() {
        loginPage.findUserStatus();
    }

    @Step
    public void goToLoginPageByLoginLink() {
        loginPage.pressLoginLink();
    }

    @Step
    public void confirmCurrentPageIsLogin() {
        loginPage.findPageTitle();
        loginPage.findSelectedTab();
    }

    @Step
    public void submitForm() {
        loginPage.pressLoginButton();
    }

    @Step
    public void enterInvalidCredentials() {
        loginPage.enterUsername("abc");
        loginPage.enterPassword("abc");
    }

    @Step
    public void checkDisplayedErrorMessage(){
        loginPage.validateCredentials();
    }

}
