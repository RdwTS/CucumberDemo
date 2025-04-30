package org.ridwan.stepdef;

import org.ridwan.BaseTest;
import org.ridwan.page.HomePage;
import io.cucumber.java.en.Then;
public class HomeStep extends BaseTest {

    HomePage homePage;

    @Then("user will be on homepage")
    public void userIsOnHomepage() {
        homePage = new HomePage(driver);
        homePage.validateOnHomePage();
    }

}
