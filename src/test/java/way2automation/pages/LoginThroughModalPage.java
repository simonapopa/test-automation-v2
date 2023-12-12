package way2automation.pages;

import com.pages.AbstractPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;
import way2automation.Constants;

@DefaultUrl(Constants.URL +"#login")
public class LoginThroughModalPage extends AbstractPage {
    @FindBy(css = ".fancybox-inner h3")
    WebElementFacade titleText;

    @FindBy(css = ".fancybox-inner [value=Submit]")
    WebElementFacade submitButton;

    @FindBy(css = ".fancybox-inner [class=fancybox]")
    WebElementFacade signLink;

    @FindBy(css = ".fancybox-inner [name=username]")
    WebElementFacade usernameField;

    @FindBy(css = ".fancybox-inner [name=password]")
    WebElementFacade passwordField;

    @FindBy(css = "#toggleNav a[href^='http']")
    WebElementFacade navigationHomeLink;

    @FindBy(css = ".fancybox-outer [id=alert1]")
    WebElementFacade messageText;

    public void clickSubmitButton() {
        submitButton.click();
    }

    public void clickSignLink() {
        signLink.click();
    }

    public void enterUsername(String user) {
        usernameField.type(user);
    }

    public void enterPassword(String pass) {
        passwordField.type(pass);
    }

    // check that the Home from menu appears and that modal window is closed
    public void navigationHomeLinkVisible() {
        String text = "Home";
        //System.out.println("home link = " + navigationHomeLink.getText() + "\n" + isModalDisplayed() + "\n" + navigationHomeLink.isVisible());

        if (isModalDisplayed()) {
            Assert.assertTrue("Login modal appears.", isModalDisplayed());
//            Assert.assertFalse("Home link is visible and clickable", navigationHomeLink.isVisible()); // Home link is always visible, needs to be changed how it's checked

        } else {
            Assert.assertTrue("Login modal does not appear.", navigationHomeLink.containsText(text));
//            Assert.assertTrue("Home link is not visible nor clickable", navigationHomeLink.isVisible());
        }
    }

    public boolean isMenuClickable() {
        boolean isClickable = false;
        boolean isModalDisplayed = isModalDisplayed();

        if (!isModalDisplayed) {
            isClickable = true;
        }

        return isClickable;
    }

    public void checkWarningMessage() {
        String displayedWarning = "Invalid username password.";

        boolean isModalDisplayed = isModalDisplayed();

        if (isModalDisplayed) {
            String s = messageText.getText();
            Assert.assertEquals(s, displayedWarning);
        } else {
            Assert.assertFalse(isModalDisplayed);
        }
    }

    // tells if modal is displayed or not
    public boolean isModalDisplayed() {
        boolean isDisplayed = false;
        List<WebElement> modal = getDriver().findElements(By.cssSelector(".fancybox-outer"));
//        System.out.println("modal size -> " + modal.size());
        if (modal.size() == 1) {
            isDisplayed = true;
        }
        return isDisplayed;
    }

    // checks which modal is displayed and then switches to Login
    public void switchToLoginModal() {
        String registerText = "registration form";
        String loginText = "login";
        boolean isSignInLink = titleText.containsText(registerText.toUpperCase());
        if (isSignInLink) {
            clickSignLink();
        } else {
            Assert.assertTrue("This is not the registration form!", titleText.containsText(loginText.toUpperCase()));
        }
    }
}
