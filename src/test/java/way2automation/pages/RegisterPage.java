package way2automation.pages;

import com.pages.AbstractPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

@DefaultUrl("http://way2automation.com/way2auto_jquery/index.php")
public class RegisterPage extends AbstractPage {
    @FindBy(css = ".heading")
    WebElementFacade findTitle;

    public void checkTitleInPage() {
        String text = "Registration";

        if (text == findTitle.getText()) {
            Assert.assertTrue("Title is 'Submit button clicked'", findTitle.containsText(text));
        } else {
            Assert.assertTrue("Different values.", findTitle.containsText(text));
        }
    }
}
