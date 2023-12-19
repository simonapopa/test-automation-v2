package way2automation.steps.register;

import net.thucydides.core.annotations.Step;
import way2automation.pages.register.RegisterPage;
import way2automation.pages.WebsiteForTestingSeleniumPage;

public class RegisterSteps {
    WebsiteForTestingSeleniumPage initialPage;
    RegisterPage registerPage;

    @Step
    public void currentPageIsRegistration() {
        initialPage.clickOnBoxRegistration();
        registerPage.checkTitleInPage();
    }

    @Step
    public void completeForm(String firstname, String lastname, String status, String hobby, String country, String month, String day, String year, String phone, String username, String email, String description, String password, String confirm) {
        registerPage.enterFirstname(firstname);
        registerPage.enterLastname(lastname);
        registerPage.selectMaritalStatus(status);
        registerPage.selectHobby(hobby);
        registerPage.selectCountry(country);
        registerPage.selectDOB(month, day, year);

        registerPage.enterPhone(phone);
        registerPage.enterUsername(username);
        registerPage.enterEmail(email);
//        registerPage.clickChooseFile();
        registerPage.enterAboutYourself(description);
        registerPage.enterPassword(password);
        registerPage.enterConfirmPassword(confirm);
        registerPage.clickSubmit();
    }
}
