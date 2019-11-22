package way2automation.features;

import com.pages.AbstractPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import way2automation.pages.RegisterPage;
import way2automation.steps.RegisterSteps;

@RunWith(SerenityRunner.class)
public class RegisterTest {
    @Managed(uniqueSession = true)
    public WebDriver webdriver;

    @Steps
    LoginThroughModalTest login;

    @Steps
    RegisterSteps registerSteps;

}
