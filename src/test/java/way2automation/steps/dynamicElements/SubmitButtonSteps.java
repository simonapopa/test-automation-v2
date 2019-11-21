package way2automation.steps.dynamicElements;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import way2automation.pages.WebsiteForTestingSeleniumPage;
import way2automation.pages.dynamicElements.SubmitButtonPage;

public class SubmitButtonSteps {
    WebsiteForTestingSeleniumPage initialPage;
    SubmitButtonPage submitButtonPage;

    @Step
    public void currentPageIsSubmitButton() {
        initialPage.clickOnBoxSubmitButton();
        submitButtonPage.checkTitleInPage();
    }
}
