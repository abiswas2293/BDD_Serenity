package TestPackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

@RunWith(SerenityRunner.class)
public class loginTest extends PageObject {

    @Managed
    WebDriver driver;

    @Test
    public void login() throws InterruptedException {


        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        driver.findElement(By.name("q")).sendKeys("Hello Serenity");
    }
}
