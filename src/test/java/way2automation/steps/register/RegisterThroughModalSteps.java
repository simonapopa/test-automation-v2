package way2automation.steps.register;

import net.thucydides.core.annotations.Step;
import way2automation.pages.register.RegisterThroughModalPage;

public class RegisterThroughModalSteps {
    RegisterThroughModalPage registerPage;

    @Step
    public void openRegistration() {
        registerPage.windowMaximize();
        registerPage.open();
    }

    @Step
    public void submitRegistrationForm() {
        registerPage.findFormTitle();
        registerPage.clickSubmitButton();
    }

    @Step
    public void submitRegistrationForm(String name, String phone, String email, String country, String city, String username, String password) {
        registerPage.findFormTitle();
        registerPage.enterName(name);
        registerPage.enterPhone(phone);
        registerPage.enterEmail(email);
        registerPage.enterCountry(country);
        registerPage.enterCity(city);
        registerPage.enterUsername(username);
        registerPage.enterPassword(password);
        registerPage.clickSubmitButton();
        registerPage.verifyWarningMessage();
    }

}
