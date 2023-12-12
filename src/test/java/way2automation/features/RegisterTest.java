package way2automation.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import way2automation.steps.RegisterSteps;

@RunWith(SerenityRunner.class)
public class RegisterTest {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    LoginThroughModalTest login;

    @Steps
    RegisterSteps registerSteps;

    @Test
    public void submitEmptyRegistrationForm() {
        login.loginWithExistingAccount();
        registerSteps.currentPageIsRegistration();
        // must add warning message validation in tests
        registerSteps.completeForm("", "", "", "", "India", "", "", "", "", "", "", "", "", "");
    }

    @Test
    public void submitValidDataForAllFields() {
        login.loginWithExistingAccount();
        registerSteps.currentPageIsRegistration();
        registerSteps.completeForm("firstname", "lastname", "Divorced", "Reading", "India", "1", "1", "2014", "01232656974", "test", "test@example.com", "test", "test", "test");
    }

    @Test
    public void submitTwoHobbiesAndRestOfFields() {
    }

}
