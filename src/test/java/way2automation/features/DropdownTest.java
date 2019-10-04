package way2automation.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import way2automation.pages.LoginThroughModalPage;
import way2automation.steps.DropdownSteps;
import way2automation.steps.LoginThroughModalSteps;
import way2automation.steps.WebsiteForTestingSeleniumSteps;

@RunWith(SerenityRunner.class)
public class DropdownTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    DropdownSteps user;

    @Steps
    WebsiteForTestingSeleniumSteps initialPage;

    @Steps
    LoginThroughModalTest login;

    @Test
    public void searchForAnExistingCountryInDropdown() {
        login.loginWithExistingAccount();
        user.currentPageIsDropdown();
        user.chooseCountryFromDropdown("Albania");
    }

    @Test
    public void enterAnExistingCountry() {
        login.loginWithExistingAccount();
        user.currentPageIsDropdown();
        user.enterCountryInInputField("Albania");
    }

    @Test
    public void enterLowerCaseExistingCountry(){
        login.loginWithExistingAccount();
        user.currentPageIsDropdown();
        user.enterCountryInInputField("albania");
    }

    @Test
    public void enterCapitalLettersExistingCountry(){
        login.loginWithExistingAccount();
        user.currentPageIsDropdown();
        user.enterCountryInInputField("ALBANIA");
    }

    @Test
    public void enterNumbersForCountryInput() {
        login.loginWithExistingAccount();
        user.currentPageIsDropdown();
        user.enterCountryInInputField("0123456789");
    }

    @Test
    public void enterSpecialCharactersForCountryInput() {
        login.loginWithExistingAccount();
        user.currentPageIsDropdown();
        user.enterCountryInInputField("#!@%^&*");
    }
}
