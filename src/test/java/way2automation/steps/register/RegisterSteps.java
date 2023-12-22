package way2automation.steps.register;

import net.thucydides.core.annotations.Step;
import way2automation.pages.register.RegisterPage;

public class RegisterSteps {
    RegisterPage registerPage;

    @Step
    public void openRegisterPage() {
        registerPage.windowMaximize();
        registerPage.open();
    }

    @Step
    public void currentPageIsRegistration() {
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

    @Step
    public void completeFormWithTwoHobbies(String firstname, String lastname, String status, String firstHobby, String secondHobby, String country, String month, String day, String year, String phone, String username, String email, String description, String password, String confirm) {
        registerPage.enterFirstname(firstname);
        registerPage.enterLastname(lastname);
        registerPage.selectMaritalStatus(status);
        registerPage.selectHobby(firstHobby);
        registerPage.selectHobby(secondHobby);
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
    @Step
    public void validateEmptyFields(){
        registerPage.checkRequiredMessage();
    }

    @Step
    public void validateEmailFormat(){
        registerPage.checkEmailFormat();
    }
}
