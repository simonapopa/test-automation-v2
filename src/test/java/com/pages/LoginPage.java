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

    public void pressLoginLink() {
        searchLoginLink.click();
    }

}
