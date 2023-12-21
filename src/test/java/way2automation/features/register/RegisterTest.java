package way2automation.features.register;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import way2automation.steps.register.RegisterSteps;

@RunWith(SerenityRunner.class)
public class RegisterTest {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    RegisterSteps registerSteps;

    @Test
    public void submitEmptyRegistrationForm() {
        registerSteps.openRegisterPage();
        registerSteps.currentPageIsRegistration();
        // must add warning message validation in tests
        registerSteps.completeForm("", "", "", "", "India", "", "", "", "", "", "", "", "", "");
    }

    @Test
    public void submitValidDataForAllFields() {
        registerSteps.openRegisterPage();
        registerSteps.currentPageIsRegistration();
        registerSteps.completeForm("firstname", "lastname", "Divorced", "Reading", "India", "1", "1", "2014", "01232656974", "test", "test@example.com", "test", "test", "test");
    }

    @Test
    public void submitTwoHobbiesAndMandatoryFields() {
        registerSteps.openRegisterPage();
        registerSteps.currentPageIsRegistration();
        registerSteps.completeFormWithTwoHobbies("firstname", "lastname", "Divorced", "Reading", "Dance", "India", "1", "1", "2014", "01232656974", "test", "test@example.com", "description text", "test", "test");
    }

    @Test
    public void submitRegistrationWithInvalidEmailAddress(){
        registerSteps.openRegisterPage();
        registerSteps.currentPageIsRegistration();
        registerSteps.completeForm("firstname", "lastname", "Divorced", "Reading", "India", "1", "1", "2014", "01232656974", "test", "test#example,com", "test", "test", "test");
        registerSteps.validateField();
    }


    //negative
}
