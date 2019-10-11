package way2automation.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import way2automation.steps.DropdownSteps;
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
    public void searchForAnExistingCountryInDropdownInFrameOne() {
        login.loginWithExistingAccount();
        user.currentPageIsDropdown();
        user.chooseCountryFromDropdown("Albania");
    }

    @Test
    public void enterAnExistingCountryInFrameTwo() {
//        login.loginWithExistingAccount();
//        user.currentPageIsDropdown();
        user.enterCountryInInputField("Albania");
    }

    @Test
    public void enterLowerCaseExistingCountryInFrameTwo() {
//        login.loginWithExistingAccount();
//        user.currentPageIsDropdown();
        user.enterCountryInInputField("albania");
    }

    @Test
    public void enterCapitalLettersExistingCountryInFrameTwo() {
//        login.loginWithExistingAccount();
//        user.currentPageIsDropdown();
        user.enterCountryInInputField("ALBANIA");
    }

    @Test
    public void enterNumbersForCountryInputInFrameTwo() {
//        login.loginWithExistingAccount();
//        user.currentPageIsDropdown();
        user.enterCountryInInputField("0123456789");
    }

    @Test
    public void enterSpecialCharactersForCountryInputInFrameTwo() {
//        login.loginWithExistingAccount();
//        user.currentPageIsDropdown();
        user.enterCountryInInputField("#!@%^&*");
    }

    @Test
    public void enterAlphaNumericCountryInFrameTwo() {
//        login.loginWithExistingAccount();
//        user.currentPageIsDropdown();
        user.enterCountryInInputField("ABC123");
    }

    @Test
    public void enterLastValueFromCountryInFrameTwo(){
//        login.loginWithExistingAccount();
//        user.currentPageIsDropdown();
        user.chooseCountryFromDropdown("Zimbabwe");
    }

    @Test
    public void enterUpperLowerCharactersExistingCountryInFrameTwo() {
//        login.loginWithExistingAccount();
//        user.currentPageIsDropdown();
        user.enterCountryInInputField("AlBaNiA");
    }

    @Test
    public void enterSpaceInCountryInputInFrameTwo(){
//        login.loginWithExistingAccount();
//        user.currentPageIsDropdown();
        user.enterCountryInInputField(" ");
    }

    @Test
    public void enterSpaceThenAnExistingCountryInFrameTwo(){
//        login.loginWithExistingAccount();
//        user.currentPageIsDropdown();
        user.enterCountryInInputField(" Albania");
    }


}
