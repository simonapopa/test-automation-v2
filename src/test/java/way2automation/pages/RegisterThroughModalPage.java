package way2automation.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import way2automation.Constants;

import java.util.List;

@DefaultUrl(Constants.URL)
public class RegisterThroughModalPage extends AbstractPage {

    @FindBy(css = ".fancybox-inner h3")
    WebElementFacade titleText;

    @FindBy(css = ".fancybox-inner [name=name]")
    WebElementFacade nameField;

    @FindBy(css = ".fancybox-inner [name=phone]")
    WebElementFacade phoneField;

    @FindBy(css = ".fancybox-inner [name=email]")
    WebElementFacade emailField;

    @FindBy(css = ".fancybox-inner [name=country]")
    WebElementFacade countryField;

    @FindBy(css = ".fancybox-inner [name=city]")
    WebElementFacade cityField;

    @FindBy(css = ".fancybox-inner [name=username]")
    WebElementFacade usernameField;

    @FindBy(css = ".fancybox-inner [name=password]")
    WebElementFacade passwordField;

    @FindBy(css = ".fancybox-inner [value=Submit]")
    WebElementFacade submitButton;

    @FindBy(css = ".fancybox-inner #alert")
    WebElementFacade messageText;

    public void findFormTitle() {
        String registerText = "registration form";
//        System.out.println("searchTitle = " + searchTitle.getText() + "\n" + "title = " + title);
        Assert.assertTrue("This is not the registration form!", titleText.containsText(registerText.toUpperCase()));
    }

    public void enterName(String name) {
        nameField.type(name);
    }

    public void enterPhone(String phone) {
        phoneField.type(phone);
    }

    public void enterEmail(String email) {
        emailField.type(email);
    }

    public void enterCountry(String country) {
        countryField.selectByValue(country);
        Assert.assertEquals(countryField.getSelectedValue(), country);
    }

    public void enterCity(String city) {
        cityField.type(city);
    }

    public void enterUsername(String username) {
        usernameField.type(username);
    }

    public void enterPassword(String password) {
        passwordField.type(password);
    }

    public void clickSubmitButton() {
        submitButton.click();
    }

    public boolean isModalDisplayed() {
        boolean isDisplayed = false;
        List<WebElement> modal = getDriver().findElements(By.cssSelector(".fancybox-outer"));
//        System.out.println("modal size -> " + modal.size());
        if (modal.size() == 1) {
            isDisplayed = true;
        }

        return isDisplayed;
    }

    public void verifyWarningMessage() {
        String existingMessage = "This is just a dummy form, you just clicked SUBMIT BUTTON";
        waitABit(5000);
        boolean isModalDisplayed = isModalDisplayed();

        if (isModalDisplayed) {
            String s = messageText.getText();
            Assert.assertEquals(s, existingMessage);
        } else {
            Assert.assertFalse(isModalDisplayed);
        }
    }
}

