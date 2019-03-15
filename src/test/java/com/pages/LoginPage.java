package com.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

@DefaultUrl("http://en.wiktionary.org/wiki/Wiktionary")
public class LoginPage extends AbstractPage {

    @FindBy(css = "#p-namespaces ul li")
    WebElementFacade searchTab;

    @FindBy(css = "#firstHeading")
    WebElementFacade searchPageTitle;

    @FindBy(css = "#p-personal ul li#pt-anonuserpage")
    WebElementFacade searchUserStatus;

    @FindBy(css = "#pt-login")
    WebElementFacade searchLoginLink;

    @FindBy(css = ".mw-input #wpName1")
    WebElementFacade searchInputFieldUsername;

    @FindBy(css = ".mw-input #wpPassword1")
    WebElementFacade searchInputFieldPassword;

    @FindBy(css = "#wpLoginAttempt")
    WebElementFacade searchLoginButton;

    @FindBy(css = ".error")
    WebElementFacade searchErrorMessage;

    public void findSelectedTab() {
//        System.out.println("searchtab = " + searchTab.getText() + " searchpagetitle = " + searchPageTitle.getText());
        Assert.assertTrue("This is not the login page!", searchTab.containsText("Special page"));
    }

    public void findPageTitle() {
        Assert.assertTrue("This is not the login page!", searchPageTitle.containsText("Log in"));
    }

    public void findUserStatus() {
        Assert.assertEquals("User is logged in", false, searchUserStatus.containsValue("Not logged in"));
    }

    public void validateCredentials() {
        Assert.assertTrue(searchErrorMessage.containsText("Incorrect username or password entered. Please try again."));
    }

    public void enterUsername(String username) {
        searchInputFieldUsername.type(username);
    }

    public void enterPassword(String password) {
        searchInputFieldPassword.type(password);
    }


    public void pressLoginButton() {
        searchLoginButton.click();
    }

    public void pressLoginLink() {
        searchLoginLink.click();
    }


}
