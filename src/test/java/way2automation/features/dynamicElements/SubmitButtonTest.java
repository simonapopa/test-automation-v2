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
    public void startsWithEmptyValue(){
        login.loginWithExistingAccount();
        user.currentPageIsSubmitButton();
    }

    @Test
    public void startsWithAlphaNumericValue(){

    }
}
