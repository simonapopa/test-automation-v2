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

    @Step
    public void enterAndSubmitStartsWith(String value){
        submitButtonPage.completeStartsWithTab(value);
    }

    @Step
    public void enterAndSubmitEndsWith(String value){
        submitButtonPage.completeEndsWithTab(value);
    }

    @Step
    public void enterAndSubmitCompleteIdDynamic(String value){
        submitButtonPage.completeIdDynamicTab(value);
    }
}
