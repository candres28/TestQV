package com.co.testing.test.stepdefinitions;

import com.co.testing.test.models.Data;
import com.co.testing.test.questions.Message;
import com.co.testing.test.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.Cast;
import net.serenitybdd.screenplay.actors.OnStage;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static com.co.testing.test.userinterfaces.WelcomePage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.*;
import static org.hamcrest.Matchers.*;

import java.util.List;

public class SignUpStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;

    @Before
    public void setUp() {
        OnStage.setTheStage(Cast.ofStandardActors());
        OnStage.theActorCalled("The user");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^that the user is on the main page$")
    public void thatTheUserIsOnTheMainPage() {
        OnStage.theActorInTheSpotlight().wasAbleTo(OpenBrowser.to());
    }

    @When("^enter the data for registration$")
    public void enterTheDataForRegistration(List<Data> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(SignUpJoin.is(),
                Step1Personal.toAccess(data.get(0))
                , Step2Address.isFor(data.get(0))
                , Step3Devices.isRegistry(data.get(0))
                , Step4Password.isFinal(data.get(0)));
    }

    @Then("^he should see a successful log message (.*)$")
    public void heShouldSeeASuccessfulLogMessage(String message) {
        OnStage.theActorInTheSpotlight().should(seeThat(Message.isTo(MESSAGE), is(equalTo(message))));
    }
}
