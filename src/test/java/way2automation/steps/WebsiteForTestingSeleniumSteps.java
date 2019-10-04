package way2automation.steps;

import net.thucydides.core.annotations.Step;
import way2automation.pages.DropdownPage;
import way2automation.pages.LoginThroughModalPage;
import way2automation.pages.WebsiteForTestingSeleniumPage;

public class WebsiteForTestingSeleniumSteps {
    WebsiteForTestingSeleniumPage page;
    LoginThroughModalPage loginModal;
    DropdownPage dropdownPage;

    @Step
    public void countBoxes() {
        page.countAllBoxesPerHeader();
        page.countAllBoxesNonHeaderDependent();
    }

    @Step
    public void countBoxesHeaderDependent() {
        page.countAllBoxesBelowWidget();
    }

    @Step
    public void findBoxDropdownAndClickOnIt() {
        page.clickOnBoxDropdown();
        dropdownPage.checkTitleInPage();
    }

}
