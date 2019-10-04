package way2automation.steps;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import way2automation.pages.DropdownPage;
import way2automation.pages.LoginThroughModalPage;
import way2automation.pages.WebsiteForTestingSeleniumPage;

public class DropdownSteps {
    LoginThroughModalPage loginPage;
    WebsiteForTestingSeleniumPage initialPage;
    DropdownPage dropdownPage;

    @Step
    public void currentPageIsDropdown() {
        initialPage.clickOnBoxDropdown();
        dropdownPage.checkTitleInPage();
    }

    @Step
    public void chooseCountryFromDropdown(String country) {
        // dropdownPage.checkTitleInPage();
        dropdownPage.selectCountryDropdown(country);
    }

    @Step
    public void enterCountryInInputField(String country) {
        dropdownPage.clickEnterCountryTab();
//        dropdownPage.selectArrow();
        dropdownPage.enterCountryInputAndCompareWithList(country);
    }

}
