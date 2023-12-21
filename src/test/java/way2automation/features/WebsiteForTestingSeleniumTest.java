package way2automation.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import way2automation.steps.WebsiteForTestingSeleniumSteps;

@RunWith(SerenityRunner.class)
public class WebsiteForTestingSeleniumTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    WebsiteForTestingSeleniumSteps user;

    @Steps
    LoginThroughModalTest login;

    @Test
//    Assignment 2: Count total number of boxes from below page
    public void countTotalNumberOfBoxes() {
        login.loginWithExistingAccount();
        user.countBoxes();
    }

    @Test
//    Assignment 3: Count total number of boxes under WIDGET section
    public void countTotalNumberOfBoxesUnderWidgetSection() {
        login.loginWithExistingAccount();
        user.countBoxesHeaderDependent();
    }
}
