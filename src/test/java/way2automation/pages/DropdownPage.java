package way2automation.pages;

import com.pages.AbstractPage;
import io.vavr.API;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static org.hamcrest.Matchers.is;

@DefaultUrl("http://way2automation.com/way2auto_jquery/index.php")
public class DropdownPage extends AbstractPage {

    @FindBy(css = "#wrapper > div > h1")
    WebElementFacade findTitle;

    @FindBy(css = ".internal_navi ul li a[href*=\"#example-1-tab-1\"]")
    WebElementFacade findTabSelectCountry;

    @FindBy(css = ".internal_navi ul li a[href*=\"#example-1-tab-2\"]")
    WebElementFacade findTabEnterCountry;

    @FindBy(css = "body > select")
    WebElementFacade countryDropdown;

    @FindBy(css = "#example-1-tab-1 iframe")
    WebElementFacade firstTabIframe;

    @FindBy(css = "#example-1-tab-2 iframe")
    WebElementFacade secondTabIframe;

    @FindBy(css = ".custom-combobox .custom-combobox-input")
    WebElementFacade inputFieldCountry;

    @FindBy(css = ".custom-combobox .ui-button")
    WebElementFacade arrowElement;

    @FindBy(css = "#ui-id-1 li")
    List<WebElementFacade> listCountries;

    @FindBy(css = ".ui-menu-item")
    WebElementFacade dropdownList;

    public void checkTitleInPage() {
        String text = "Dropdown";
        if (text == findTitle.getValue()) {
            Assert.assertTrue("Title is Dropdown", findTitle.containsText(text));
        } else {
            Assert.assertTrue("Different values.", findTitle.containsText(text));
        }
    }

    public void clickSelectCountryTab() {
        findTabSelectCountry.click();
    }

    public void clickEnterCountryTab() {
        findTabEnterCountry.click();
    }

    // select country from
    public void selectCountryDropdown(String country) {
        getDriver().switchTo().frame(firstTabIframe);
        countryDropdown.selectByValue(country);
        Assert.assertThat(countryDropdown.getSelectedValue(), is(country));
    }

    // check if country entered is a number or not
    public boolean isCountryNumeric(String country) {
        try {
            double d = Double.parseDouble(country);
        } catch (NumberFormatException | NullPointerException e) {
            return false;
        }
        return true;
    }

    // enter country in 2nd tab and compare value with list
    public void enterCountryInputAndCompareWithList(String country) {
        boolean flag = false;
        getDriver().switchTo().frame(secondTabIframe);
        arrowElement.click();

        // if country is not numeric
        if (!isCountryNumeric(country)) {
            country = country.substring(0, 1).toUpperCase() + country.substring(1);
        }

        inputFieldCountry.type(country);

        if (!dropdownList.isVisible() || !dropdownList.isPresent()) {
            arrowElement.click();
        }

        for (WebElementFacade e : listCountries) {
            if (e.getText().contains(country)) {
                e.click();
                flag = true;
                Assert.assertTrue("Is not in the list", flag);
                break;
            }
            if (!e.getText().contains(country)) {
                Assert.assertFalse("Is in the list", flag);
                break;
            }
        }
    }
}
