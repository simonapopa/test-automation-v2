package way2automation.steps;

import com.sun.xml.internal.bind.v2.runtime.reflect.opt.Const;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import way2automation.Constants;
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
