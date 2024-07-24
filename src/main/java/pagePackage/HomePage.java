package pagePackage;

import net.thucydides.core.annotations.Step;

public class HomePage {

    SwaglabsHomePage home;

    @Step("This step will verify the title")
    public void verifyTitle() {
        home.verifyTitle();


    }

    @Step("This step will allow us to login to application")
    public void credentials() throws InterruptedException {
        home.enterUsernamePassword();
    }

    @Step("This step will verify the dashboard")
    public void verifyDashboard() throws InterruptedException {
        home.verifyLogin();
    }


}
