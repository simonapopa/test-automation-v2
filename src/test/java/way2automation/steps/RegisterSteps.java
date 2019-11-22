package way2automation.steps;

import net.thucydides.core.annotations.Step;
import way2automation.pages.RegisterPage;
import way2automation.pages.WebsiteForTestingSeleniumPage;
import way2automation.pages.dynamicElements.SubmitButtonPage;

public class RegisterSteps {
    WebsiteForTestingSeleniumPage initialPage;
    RegisterPage registerPage;

    @Step
    public void currentPageIsRegistration() {
        initialPage.clickOnRegistration();
        registerPage.checkTitleInPage();
    }

}
