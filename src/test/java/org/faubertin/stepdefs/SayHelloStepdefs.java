package org.faubertin.stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.faubertin.HelloService;
import org.faubertin.SpringConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

@ContextConfiguration(classes = { SpringConfig.class })
public class SayHelloStepdefs {

    @Autowired
    private HelloService helloService;

    @Given("^I arrive in a room$")
    public void i_arrive_in_a_room() throws Throwable {
        helloService.enterRoom();
    }

    @When("^there is (.+)$")
    public void there_is_someone(String name) throws Throwable {
        boolean present = helloService.checkPresent(name);
        assertThat(present, is(true));
    }

    @Then("^I say hello (.+)$")
    public void i_say_hello(String name) throws Throwable {
        helloService.sayHello(name);
    }

}
