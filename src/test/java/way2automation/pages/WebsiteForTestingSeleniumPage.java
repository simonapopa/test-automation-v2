package way2automation.pages;

import com.pages.AbstractPage;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@DefaultUrl("http://way2automation.com/way2auto_jquery/index.php")
public class WebsiteForTestingSeleniumPage extends AbstractPage {

    // identify all headers in page
    @FindBy(css = ".linkbox.margin-bottom-20 h1:nth-child(1)")
    WebElementFacade headerInteraction;

    @FindBy(css = ".row div:nth-child(2) h1")
    WebElementFacade headerWidget;

    @FindBy(css = ".row div:nth-child(3) h1")
    WebElementFacade headerFramesAndWindows;

    @FindBy(css = ".row div:nth-child(4) h1")
    WebElementFacade headerDynamicElements;

    @FindBy(css = ".row div:nth-child(5) h1")
    WebElementFacade headerRegistration;

    @FindBy(css = ".row div:nth-child(6) h1")
    WebElementFacade headerAlert;

    // identify boxes per header
    @FindBy(css = ".row div:nth-child(1) ul li")
    WebElementFacade boxesInteraction;

    @FindBy(css = ".row div:nth-child(2) .boxed_style li")
    WebElementFacade boxesWidget;

    @FindBy(css = ".row div:nth-child(3) .boxed_style li")
    WebElementFacade boxesFramesAndWindows;

    @FindBy(css = ".row div:nth-child(4) .boxed_style li")
    WebElementFacade boxesDynamicElements;

    @FindBy(css = ".row div:nth-child(5) .boxed_style li")
    WebElementFacade boxesRegistration;

    @FindBy(css = ".row div:nth-child(6) .boxed_style li")
    WebElementFacade boxesAlert;

    public int returnCountedBoxesForInteraction() {
        int count = 0;
        count = getDriver().findElements(By.cssSelector(".row div:nth-child(1) ul li")).size();
        return count;
    }

    public int returnCountedBoxesForWidget() {
        int count = 0;
        count = getDriver().findElements(By.cssSelector(".row div:nth-child(2) .boxed_style li")).size();
        return count;
    }

    public int returnCountedBoxesForFramesAndWindows() {
        int count = 0;
        count = getDriver().findElements(By.cssSelector(".row div:nth-child(3) .boxed_style li")).size();
        return count;
    }

    public int returnCountedBoxesForDynamicElements() {
        int count = 0;
        count = getDriver().findElements(By.cssSelector(".row div:nth-child(4) .boxed_style li")).size();
        return count;
    }

    public int returnCountedBoxedForRegistration() {
        int count = 0;
        count = getDriver().findElements(By.cssSelector(".row div:nth-child(5) .boxed_style li")).size();
        return count;
    }

    public int returnCountedBoxesForAlert() {
        int count = 0;
        count = getDriver().findElements(By.cssSelector(".row div:nth-child(6) .boxed_style li")).size();
        return count;
    }

    public void countAllBoxesPerHeader() {
        System.out.println("Count boxes for Interaction header: " + returnCountedBoxesForInteraction());
        System.out.println("Count boxes for Widget header: " + returnCountedBoxesForWidget());
        System.out.println("Count boxes for Frames and Windows header: " + returnCountedBoxesForFramesAndWindows());
        System.out.println("Count boxes for Dynamic Elements header: " + returnCountedBoxesForDynamicElements());
        System.out.println("Count boxes for Registration header: " + returnCountedBoxedForRegistration());
        System.out.println("Count boxes for Alert header: " + returnCountedBoxesForAlert());
    }

    public void countAllBoxesNonHeaderDependent() {
        int sum = returnCountedBoxesForInteraction() + returnCountedBoxesForWidget() + returnCountedBoxesForFramesAndWindows() + returnCountedBoxedForRegistration()
                + returnCountedBoxesForAlert() + returnCountedBoxesForDynamicElements();
        System.out.println("Total number of boxes non dependent of headers is " + sum);
    }

    public void countAllBoxesBelowWidget() {
        int sum = returnCountedBoxesForWidget() + returnCountedBoxesForFramesAndWindows() + returnCountedBoxedForRegistration()
                + returnCountedBoxesForAlert() + returnCountedBoxesForDynamicElements();
        System.out.println("Total number of boxes below header Widget is " + sum);
    }

    public void clickOnBoxDropdown() {
        getDriver().findElement(By.cssSelector(".row div:nth-child(4) .boxed_style li a[href*=\"dropdown\"]")).click();
    }

    public void clickOnBoxSubmitButton() {
        getDriver().findElement(By.cssSelector(".row div:nth-child(4) ul li a[href*=\"submit_button_clicked.php\"]")).click();
    }

    public void clickOnRegistration(){
        getDriver().findElement(By.cssSelector(".container.main-nav ul li a[href^=\"registration\"]"));
    }
}
