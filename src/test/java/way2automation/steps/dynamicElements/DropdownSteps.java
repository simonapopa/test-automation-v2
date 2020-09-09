package way2automation.steps.dynamicElements;

import net.thucydides.core.annotations.Step;
import way2automation.pages.dynamicElements.DropdownPage;
import way2automation.pages.WebsiteForTestingSeleniumPage;

public class DropdownSteps {
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
        dropdownPage.enterCountryInputAndCompareWithList(country);
    }

}
