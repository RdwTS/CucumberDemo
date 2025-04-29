package org.ridwan;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class LoginStepWithGherkin {

    WebDriver driver = WebDriverManager.chromedriver().create();
    LoginPage loginPage = new LoginPage(driver);

    @Given("user is on login page")
    public void userIsOnLoginPage(){
        driver.get("https://www.saucedemo.com/");
    }

    @When("user click login button")
    public void userClickLogInButton(){
        loginPage.clickLoginButton();
    }

    @And("user input username with {string}")
    public void userInputUsernameWith(String username) {
        loginPage.inputUsername(username);
    }

    @And("user input password with {string}")
    public void userInputPasswordWith(String password) {
        loginPage.inputPassword(password);
    }

    @Then("user will be on homepage")
    public void userWillBeOnHomepage() {

    }
}
