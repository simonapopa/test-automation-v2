package com.steps.serenity;

import com.pages.LoginPage;
import net.thucydides.core.annotations.Step;

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

}
