package way2automation.features.dynamicElements;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import way2automation.features.LoginThroughModalTest;
import way2automation.steps.dynamicElements.DropdownSteps;
import way2automation.steps.WebsiteForTestingSeleniumSteps;

@RunWith(SerenityRunner.class)
public class DropdownStepGroupTest {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    DropdownSteps user;

    @Steps
    DropdownTest dropdownTest;

    @Steps
    WebsiteForTestingSeleniumSteps initialPage;

    @Steps
    LoginThroughModalTest login;

    @StepGroup
    public void testSuiteDropdownCountryTests() {
        login.loginWithExistingAccount();
        user.currentPageIsDropdown();

        //tests for first tab Select Country
        //positive scenarios
        dropdownTest.searchForAnExistingCountryInDropdownInFrameOne();
        webdriver.navigate().refresh();


        //negative scenarios
        dropdownTest.searchForAnInexistentCountryInDropdownInFrameOne();
        webdriver.navigate().refresh();
        dropdownTest.searchForNumberInDropdownInFrameOne();
    }

    @StepGroup
    public void testSuiteDropdownTests() {
        login.loginWithExistingAccount();
        user.currentPageIsDropdown();

        //tests for first tab Select Country
        //positive scenarios
        dropdownTest.searchForAnExistingCountryInDropdownInFrameOne();
        webdriver.navigate().refresh();

        //negative scenarios
        dropdownTest.searchForAnInexistentCountryInDropdownInFrameOne();
        webdriver.navigate().refresh();
        dropdownTest.searchForNumberInDropdownInFrameOne();

        // tests for second tab Enter Country
        //positive scenarios
        dropdownTest.enterAnExistingCountryInFrameTwo();
        webdriver.navigate().refresh();
        dropdownTest.enterCapitalLettersExistingCountryInFrameTwo();
        webdriver.navigate().refresh();
        dropdownTest.enterLowerCaseExistingCountryInFrameTwo();
        webdriver.navigate().refresh();
        dropdownTest.enterUpperLowerCharactersExistingCountryInFrameTwo();
        webdriver.navigate().refresh();
        dropdownTest.enterLastValueFromCountryInFrameTwo();
        webdriver.navigate().refresh();

        //negative scenarios
        dropdownTest.enterNumbersForCountryInputInFrameTwo();
        webdriver.navigate().refresh();
        dropdownTest.enterSpecialCharactersForCountryInputInFrameTwo();
        webdriver.navigate().refresh();
        dropdownTest.enterAlphaNumericCountryInFrameTwo();
        webdriver.navigate().refresh();
        dropdownTest.enterSpaceInCountryInputInFrameTwo();
        webdriver.navigate().refresh();
        dropdownTest.enterSpaceThenAnExistingCountryInFrameTwo();
    }

    @Test
    public void dropdownTests() {

//        testSuiteDropdownTests();
        testSuiteDropdownCountryTests();
    }
}
