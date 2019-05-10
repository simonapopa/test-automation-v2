package way2automation.features;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import way2automation.steps.LoginThroughModalSteps;

@RunWith(SerenityRunner.class)
public class LoginThroughModalTest {

    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    LoginThroughModalSteps user;
}
