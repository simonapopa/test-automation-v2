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

    @FindBy(css = "#ui-id-1")
    WebElementFacade countryList;

    @FindBy(css = ".custom-combobox .ui-button")
    WebElementFacade arrowElement;

    @FindBy(css = "#ui-id-1 li")
    List<WebElementFacade> listCountries;

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
        System.out.println("clicked");
        findTabEnterCountry.click();
    }

    public void selectArrow() {
        System.out.println("1");
        if (arrowElement.isCurrentlyVisible()) {
            System.out.println("2");
            arrowElement.click();
        } else {
            System.out.println("3");
            waitABit(1000);
            arrowElement.click();
        }
    }

    // select country from
    public void selectCountryDropdown(String country) {
        getDriver().switchTo().frame(firstTabIframe);
        countryDropdown.selectByValue(country);
        Assert.assertThat(countryDropdown.getSelectedValue(), is(country));
    }

    // enter country in 2nd tab and compare value with list
    public void enterCountryInputAndCompareWithList(String country) {
        boolean flag = false;
        String countryToUpperCase = country.substring(0, 1).toUpperCase();

//        System.out.println("enterCountryInputAndCompareWithList");
        getDriver().switchTo().frame(secondTabIframe);
        inputFieldCountry.type(country);
        getDriver().findElement(By.cssSelector(".ui-menu-item"));

        for (WebElementFacade e : listCountries) {
            if (e.getText().contains(countryToUpperCase)) {
                System.out.println("e text");
                e.click();
                flag = true;
                break;
            }
            arrowElement.click();
            Assert.assertTrue("Is not in the list", flag);
        }
    }
}
