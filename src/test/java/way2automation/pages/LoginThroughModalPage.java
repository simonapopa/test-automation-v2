package way2automation.pages;

import com.pages.AbstractPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

@DefaultUrl("http://way2automation.com/way2auto_jquery/index.php")
public class LoginThroughModalPage extends AbstractPage {
    @FindBy(css = ".fancybox-inner h3")
    WebElementFacade titleText;

    public void findFormTitle() {
        String registerText = "registration form";
        String loginText = "login";
        String s = titleText.getText();
//        System.out.println("searchTitle = " + searchTitle.getText() + "\n" + "title = " + title);
        if (s.equals(registerText)) {
            Assert.assertTrue("This is not the registration form!", titleText.containsText(registerText.toUpperCase()));
        }else if (s.equals(loginText)){
            Assert.assertTrue("This is not the login form!",titleText.containsText(loginText.toUpperCase()));
        }
    }
}
