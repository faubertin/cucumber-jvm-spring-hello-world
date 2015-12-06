package org.faubertin;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = { "classpath:features/HelloWorld.feature" },
    glue = { "classpath:org.faubertin.stepdefs" },
    plugin = { "pretty", "html:target/cucumber" }
)
public class HelloWorldTest {

}
