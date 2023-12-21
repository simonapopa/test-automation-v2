package way2automation.pages.dynamicElements;

import way2automation.pages.AbstractPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;
import way2automation.Constants;

@DefaultUrl(Constants.SUBMIT_BUTTON_URL)
public class SubmitButtonPage extends AbstractPage {

    //title
    @FindBy(css = ".container.margin-top-20 > h1:nth-child(1)")
    WebElementFacade findTitle;

    //starts with tab elements
    @FindBy(css = "#example-1-tab-1 .demo-frame")
    WebElementFacade startsWithFrame;

    //elements common to all tabs
    @FindBy(css = "body > form > input[type=text]")
    WebElementFacade inputField;

    @FindBy(css = "body > form > input[type=button]")
    WebElementFacade submitButton;

    //ends with tab elements
    @FindBy(css = ".responsive-tabs li a[href*=\"#example-1-tab-2\"]")
    WebElementFacade endsWithTab;

    @FindBy(css = "#example-1-tab-2 .demo-frame")
    WebElementFacade endsWithFrame;

    //complete id dynamic tab elements
    @FindBy(css = ".responsive-tabs li a[href*=\"#example-1-tab-3\"]")
    WebElementFacade completeIdDynamicTab;

    @FindBy(css = "#example-1-tab-3 .demo-frame")
    WebElementFacade completeIdDynamicFrame;

    //common actions
    public void clickSubmit() {
        submitButton.click();
    }

    public void fillInputField(String s) {
        inputField.type(s);
    }

    //ends with tab: actions
    public void clickEndsWithTab() {
        endsWithTab.click();
    }

    //complete id dynamic tab: actions
    public void clickCompleteIdDynamicTab() {
        completeIdDynamicTab.click();
    }

    //check current page is Submit button clicked
    public void checkTitleInPage() {
        String text = "Submit Button Clicked";

        if (text.equals(findTitle.getText())) {
            Assert.assertTrue("Title is 'Submit button clicked'", findTitle.containsText(text));
        } else {
            Assert.assertTrue("Different values.", findTitle.containsText(text));
        }
    }

    //fill starts with tab
    public void completeStartsWithTab(String s) {
        getDriver().switchTo().frame(startsWithFrame);
        fillInputField(s);
        clickSubmit();
    }

    //fill ends with tab
    public void completeEndsWithTab(String s) {
        clickEndsWithTab();
        getDriver().switchTo().frame(endsWithFrame);
        fillInputField(s);
        clickSubmit();
    }

    //fill complete id dynamic
    public void completeIdDynamicTab(String s) {
        clickCompleteIdDynamicTab();
        getDriver().switchTo().frame(completeIdDynamicFrame);
        fillInputField(s);
        clickSubmit();
    }
}
