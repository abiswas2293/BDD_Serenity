package pagePackage;

import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;

public class SwaglabsHomePage extends PageObject {
    public void verifyTitle() {
        String title = getDriver().getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/v1/", title);
    }

    public void enterUsernamePassword() throws InterruptedException {

        $(By.name("user-name")).type("standard_user");
        $(By.name("password")).typeAndEnter("secret_sauce");

    }

    public void verifyLogin() throws InterruptedException {
        String currentUrl = getDriver().getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/v1/inventory.html", currentUrl);
        $(By.xpath("//div[text()='Sauce Labs Backpack']")).click();
        String bagURL = getDriver().getCurrentUrl();
        Assert.assertEquals("https://www.saucedemo.com/v1/inventory-item.html?id=4", bagURL);

    }
}
