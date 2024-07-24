package TestPackage;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


@RunWith(SerenityRunner.class)
public class loginTestScenario extends PageObject {
    @Managed
    WebDriver driver;


    @Test
    public void myGoogleSearch() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElementFacade username = $(By.name("username"));
        username.shouldBeVisible();
        username.type("Admin");


        $(By.name("password")).typeAndEnter("admin123");
        Thread.sleep(5000);


    }

}
