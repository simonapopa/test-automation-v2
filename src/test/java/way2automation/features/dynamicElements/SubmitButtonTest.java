package way2automation.features.dynamicElements;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import way2automation.features.LoginThroughModalTest;
import way2automation.steps.WebsiteForTestingSeleniumSteps;
import way2automation.steps.dynamicElements.SubmitButtonSteps;

@RunWith(SerenityRunner.class)
public class SubmitButtonTest {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    SubmitButtonSteps user;

    @Steps
    LoginThroughModalTest login;

    @Test
    public void startsWithEmptyValue() {
//        login.loginWithExistingAccount();
//        user.currentPageIsSubmitButton();
        user.enterAndSubmitStartsWith("");
    }

    @Test
    public void startsWithLetters() {
//        login.loginWithExistingAccount();
//        user.currentPageIsSubmitButton();
        user.enterAndSubmitStartsWith("test");
    }

    @Test
    public void startsWithAlphaNumericValue() {
//        login.loginWithExistingAccount();
//        user.currentPageIsSubmitButton();
        user.enterAndSubmitStartsWith("test1234");
    }

    @Test
    public void endsWithEmptyValue() {
//        login.loginWithExistingAccount();
//        user.currentPageIsSubmitButton();
        user.enterAndSubmitEndsWith("");
    }

    @Test
    public void endsWithAlphaNumericValue() {
//        login.loginWithExistingAccount();
//        user.currentPageIsSubmitButton();
        user.enterAndSubmitEndsWith("test");
    }

    @Test
    public void endsWithLetters() {
//        login.loginWithExistingAccount();
//        user.currentPageIsSubmitButton();
        user.enterAndSubmitEndsWith("test1234");
    }

    @Test
    public void completeIdDynamicEmptyValue() {
//        login.loginWithExistingAccount();
//        user.currentPageIsSubmitButton();
        user.enterAndSubmitCompleteIdDynamic("");
    }

    @Test
    public void completeIdDynamicLetters() {
//        login.loginWithExistingAccount();
//        user.currentPageIsSubmitButton();
        user.enterAndSubmitCompleteIdDynamic("test");
    }

    @Test
    public void completeIdDynamicAlphaNumericValue() {
//        login.loginWithExistingAccount();
//        user.currentPageIsSubmitButton();
        user.enterAndSubmitCompleteIdDynamic("test1234");
    }
}
