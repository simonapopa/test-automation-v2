package way2automation.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import way2automation.steps.RegisterThroughModalSteps;

@RunWith(SerenityRunner.class)

public class RegisterThroughModalTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    RegisterThroughModalSteps user;

    @Test
    public void submitEmptyForm(){
        user.openRegistration();
        user.submitRegistrationForm();
    }

    @Test
    public void submitDefaultCountryAndUseExistingAccountToRegister(){
        user.openRegistration();
        user.submitRegistrationForm("test","123456789","test@test.com","","test","test","test");
    }

    @Test
    public void submitOtherThanDefaultCountryAndUseExistingAccountToRegister(){
        user.openRegistration();
        user.submitRegistrationForm("test","123456789","test@test.com","Albania","test","test","test");

    }

    @Test
    public void submitDefaultCountryAndNewAccountWithValidRequiredFields(){
        user.openRegistration();
        user.submitRegistrationForm("test","123456789","simonatretretrefdysjsdfedffkgfddfds@test.com","","test","test","test");
        // need to generate accounts randomly
    }
}
