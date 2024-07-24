package TestPackage;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import pagePackage.HomePage;

import java.util.concurrent.TimeUnit;

@RunWith(SerenityRunner.class)
public class LoginApplicationWithPageObject {
    @Managed
    WebDriver driver;

    @Steps
    HomePage home;

    @Test
    public void loginAsAdmin() throws InterruptedException {
        driver.get("https://www.saucedemo.com/v1/");
        home.verifyTitle();
        home.credentials();
        home.verifyDashboard();

    }
}
