package way2automation.pages.register;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import way2automation.Constants;
import way2automation.pages.AbstractPage;

import java.util.List;

@DefaultUrl(Constants.REGISTRATION_URL)
public class RegisterPage extends AbstractPage {
    @FindBy(css = ".text_box .heading")
    WebElementFacade findTitle;
    @FindBy(css = ".fieldset > p input[name=name]")
    WebElementFacade inputFirstname;
    @FindBy(css = "#register_form > fieldset:nth-child(1) > p:nth-child(2) > input[type=text]")
    WebElementFacade inputLastname;
    @FindBy(css = "#register_form > fieldset:nth-child(2) > div > label")
    List<WebElementFacade> radioButtonMaritalStatus;
    @FindBy(css = "#register_form > fieldset:nth-child(3) > div > label")
    List<WebElementFacade> checkboxButtonsHobby;
    @FindBy(css = "#register_form > fieldset.fieldset.padding-bottom.error_p > div > label.relative > label")
    WebElementFacade hobbyMessageValidator;
    @FindBy(css = "fieldset > select")
    WebElementFacade dropdownCountry;
    @FindBy(css = ".time_feild:nth-child(2) select")
    WebElementFacade dropdownMonth;
    @FindBy(css = ".time_feild:nth-child(3) select")
    WebElementFacade dropdownDay;
    @FindBy(css = ".time_feild:nth-child(4) select")
    WebElementFacade dropdownYear;
    @FindBy(css = ".fieldset input[name=phone]")
    WebElementFacade inputPhone;
    @FindBy(css = "#register_form > fieldset:nth-child(6) > label.error_p")
    WebElementFacade phoneMessageValidator;
    @FindBy(css = ".fieldset input[name=username]")
    WebElementFacade inputUsername;
    @FindBy(css = ".fieldset input[name=email]")
    WebElementFacade inputEmail;
    @FindBy(css = "#register_form > fieldset:nth-child(8) > label.error_p")
    WebElementFacade emailMessageValidator;
    @FindBy(css = "fieldset input[type=file]")
    WebElementFacade buttonChooseFile;
    @FindBy(css = "fieldset > textarea")
    WebElementFacade inputAboutYourself;
    @FindBy(css = ".fieldset input[name=password]")
    WebElementFacade inputPassword;
    @FindBy(css = "#register_form > fieldset:nth-child(11) > label.error_p")
    WebElementFacade passwordMessageValidator;
    @FindBy(css = ".fieldset input[name=c_password]")
    WebElementFacade inputConfirmPassword;
    @FindBy(css = "#register_form > fieldset:nth-child(12) > label.error_p")
    WebElementFacade confirmPasswordMessageValidator;
    @FindBy(css = "fieldset input[type=submit]")
    WebElementFacade buttonSubmit;

    public void enterFirstname(String firstname) {
        inputFirstname.type(firstname);
    }

    public void enterLastname(String lastname) {
        inputLastname.type(lastname);
    }

    public void selectMaritalStatus(String status) {
        boolean flag;

        for (WebElementFacade e : radioButtonMaritalStatus) {
            if (e.getText().contentEquals(status)) {
                flag = true;
                e.click();
                Assert.assertTrue("No radio button.", flag);
                break;
            }
        }
    }

    public void selectHobby(String hobby) {
        boolean flag;

        for (WebElementFacade e : checkboxButtonsHobby) {
            if (e.getText().contentEquals(hobby)) {
                e.click();
                flag = true;
                Assert.assertTrue("no checkbox.", flag);
                break;
            }
        }
    }
    public void selectCountry(String country) {
        dropdownCountry.selectByValue(country);
    }

    public void selectDOB(String month, String day, String year) {
        if (!month.isEmpty() && !day.isEmpty() && !year.isEmpty()) {
            dropdownMonth.selectByValue(month);
            dropdownDay.selectByValue(day);
            dropdownYear.selectByValue(year);
        }
    }
    public void enterPhone(String phone) {
        inputPhone.type(phone);
    }

    public void enterUsername(String username) {
        inputUsername.type(username);
    }

    public void enterEmail(String email) {
        inputEmail.type(email);
    }

    public void clickChooseFile() {
        buttonChooseFile.click();
    }

    public void enterAboutYourself(String description) {
        inputAboutYourself.type(description);
    }

    public void enterPassword(String password) {
        inputPassword.type(password);
    }

    public void enterConfirmPassword(String confirm) {
        inputConfirmPassword.type(confirm);
    }

    public void clickSubmit() {
        buttonSubmit.click();
    }

    public void checkTitleInPage() {
        String text = "Registration";
        if (text.equals(findTitle.getText())) {
            Assert.assertTrue("Title is 'Registration'", findTitle.containsText(text));
        } else {
            Assert.assertFalse("Different values.", findTitle.containsText(text));
        }
    }
    public void checkMessage() {
        String message = "This field is required.";
        if (message.equals(hobbyMessageValidator)) {
            Assert.assertTrue(message, hobbyMessageValidator.containsText(message));
        } else {
            Assert.assertFalse(message, hobbyMessageValidator.containsText(message));
        }

        if (message.equals(phoneMessageValidator)) {
            Assert.assertTrue(message, phoneMessageValidator.containsText(message));
        } else {
            Assert.assertFalse(message, phoneMessageValidator.containsText(message));
        }

        if (message.equals(emailMessageValidator)) {
            Assert.assertTrue(message, emailMessageValidator.containsText(message));
        } else {
            Assert.assertFalse(message, emailMessageValidator.containsText(message));
        }

        if (message.equals(passwordMessageValidator)) {
            Assert.assertTrue(message, passwordMessageValidator.containsText(message));
        } else {
            Assert.assertFalse(message, passwordMessageValidator.containsText(message));
        }

        if (message.equals(confirmPasswordMessageValidator)) {
            Assert.assertTrue(message, confirmPasswordMessageValidator.containsText(message));
        } else {
            Assert.assertFalse(message, confirmPasswordMessageValidator.containsText(message));
        }
    }
}
