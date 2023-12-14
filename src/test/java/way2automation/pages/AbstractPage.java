package way2automation.pages;

import net.serenitybdd.core.pages.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import way2automation.Constants;

import java.io.File;

public abstract class AbstractPage extends PageObject {

    // Create an instance of ChromeOptions
    ChromeOptions options = new ChromeOptions();


    public void windowMaximize() {
        // Set the options as desired
        //options.addArguments("--remote-allow-origins=*");
        //options.addExtensions(new File("C:/Users/simonabucur/IdeaProjects/test-automation-v2/src/chromedriver/chromedriver.exe"));

        //System.setProperty("webdriver.chrome.driver", "C:/Users/simonabucur/IdeaProjects/test-automation-v2/src/chromedriver/chromedriver.exe");
        //WebDriver driver = new ChromeDriver(options);

        // Create an instance of ChromeDriver with the options
        //ChromeDriver driver = new ChromeDriver(options);

        //driver.get(Constants.URL);
        getDriver().manage().window().minimize();
    }
}