package stepDefinitions;

import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.IsUserRegistered;
import tasks.RegisterUserTask;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RegisterSteps {

    @Given("que estoy en la página de Product Store")
    public void openProductStore() {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(Open.url("https://www.demoblaze.com/#"));
    }

    @When("registro un nuevo usuario con nombre {string} y contraseña {string}")
    public void registerUser(String username, String password) {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.attemptsTo(RegisterUserTask.withDetails(username, password));
    }

    @Then("debería ver un mensaje de registro exitoso")
    public void verifyRegistrationSuccess() {
        Actor actor = OnStage.theActorInTheSpotlight();
        actor.should(seeThat(IsUserRegistered.successful()));
    }
}


