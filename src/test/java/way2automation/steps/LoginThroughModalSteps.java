package way2automation.steps;

import net.thucydides.core.annotations.Step;
import way2automation.pages.LoginThroughModalPage;

public class LoginThroughModalSteps {
    LoginThroughModalPage loginPage;

    @Step
    public void openLogin() {
        loginPage.windowMaximize();
        loginPage.open();
    }

    @Step
    public void submitLoginForm(String user, String password) {
        loginPage.switchToLoginModal();
        loginPage.enterUsername(user);
        loginPage.enterPassword(password);
        loginPage.clickSubmitButton();
        loginPage.navigationHomeLinkVisible();
    }
}
