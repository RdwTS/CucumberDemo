package org.ridwan.stepdef;

import org.ridwan.BaseTest;
import io.cucumber.java.After;
import io.cucumber.java.Before;
public class CucumberHooks extends BaseTest {

    @Before
    public void beforeTest() {
        System.out.println("Before");
        getDriver();
    }

    @After
    public void afterTest() {
        System.out.println("After");
        driver.close();
    }
}
