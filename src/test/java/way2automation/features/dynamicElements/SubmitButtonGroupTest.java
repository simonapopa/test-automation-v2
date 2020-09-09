package way2automation.features.dynamicElements;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.StepGroup;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import way2automation.features.LoginThroughModalTest;
import way2automation.steps.WebsiteForTestingSeleniumSteps;
import way2automation.steps.dynamicElements.SubmitButtonSteps;

@RunWith(SerenityRunner.class)
public class SubmitButtonGroupTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    SubmitButtonSteps user;

    @Steps
    SubmitButtonTest submitTest;

    @Steps
    WebsiteForTestingSeleniumSteps initialPage;

    @Steps
    LoginThroughModalTest login;

    @StepGroup
    //test starts with tab
    public void testSuiteStartsWithTest() {
        login.loginWithExistingAccount();
        user.currentPageIsSubmitButton();

        submitTest.startsWithEmptyValue();
        webdriver.navigate().refresh();

        submitTest.startsWithAlphaNumericValue();
        webdriver.navigate().refresh();

        submitTest.startsWithLetters();
    }

    @StepGroup
    //test ends with tab
    public void testSuiteEndsWithTest() {
        login.loginWithExistingAccount();
        user.currentPageIsSubmitButton();

        submitTest.endsWithEmptyValue();
        webdriver.navigate().refresh();

        submitTest.endsWithLetters();
        webdriver.navigate().refresh();

        submitTest.endsWithAlphaNumericValue();
    }

    @StepGroup
    //test complete id dynamic
    public void testSuiteCompleteIdDynamicTest() {
        login.loginWithExistingAccount();
        user.currentPageIsSubmitButton();

        submitTest.completeIdDynamicEmptyValue();
        webdriver.navigate().refresh();

        submitTest.completeIdDynamicLetters();
        webdriver.navigate().refresh();

        submitTest.completeIdDynamicAlphaNumericValue();
    }

    @Test
    public void submitTest() {
//        testSuiteStartsWithTest();
//        testSuiteEndsWithTest();
        testSuiteCompleteIdDynamicTest();
    }
}
