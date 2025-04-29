package org.ridwan.stepdef;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        glue = ("org.ridwan"),
        features = ("src/test/resources/Login.feature"),
        plugin = {"pretty"}
)
public class CucumberTest {


}
