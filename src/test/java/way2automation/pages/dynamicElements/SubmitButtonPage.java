package way2automation.pages.dynamicElements;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.junit.Assert;

@DefaultUrl("http://way2automation.com/way2auto_jquery/index.php")
public class SubmitButtonPage {

    @FindBy(css = "#wrapper div > h1")
    WebElementFacade findTitle;

    @FindBy(css = ".responsive-tabs li[class=\"active\"]")
    WebElementFacade activeTab;

    @FindBy(css = ".responsive-tabs li a[href*=\"#example-1-tab-1\"]")
    WebElementFacade startsWithTab;

    @FindBy(css = ".responsive-tabs li a[href*=\"#example-1-tab-2\"]")
    WebElementFacade endsWithTab;

    @FindBy(css = ".responsive-tabs li a[href*=\"#example-1-tab-3\"]")
    WebElementFacade completeIdDynamicTab;

    public void clickOnStartsWithTab() {
        startsWithTab.click();
    }

    public void clickOnEndsWithTab() {
        endsWithTab.click();
    }

    public void clickOnCompleteIdDynamic() {
        completeIdDynamicTab.click();
    }

    public void checkTitleInPage() {
        String text = "Submit button clicked";
        System.out.println("find title =" + findTitle.getValue());

        if (text == findTitle.getValue()) {
            System.out.println("1");
            Assert.assertTrue("Title is 'Submit button clicked'", findTitle.containsText(text));
        } else {
            Assert.assertTrue("Different values.", findTitle.containsText(text));
        }
    }


}
