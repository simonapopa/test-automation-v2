package way2automation.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import way2automation.Constants;
import way2automation.steps.LoginThroughModalSteps;

@RunWith(SerenityRunner.class)
public class LoginThroughModalTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    LoginThroughModalSteps user;

    @Test
    public void loginWithNoCredentials() {
        user.openLogin();
        user.submitLoginForm("", "");
    }

    @Test
    public void loginWithInvalidCredentials() {
        user.openLogin();
        user.submitLoginForm("invalid", "invalid");
    }

    @Test
    public void loginWithExistingAccount() {
        user.openLogin();
        user.submitLoginForm("test", "test");
    }
}
