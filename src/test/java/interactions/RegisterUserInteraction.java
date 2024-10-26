package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserInteraction implements Interaction {

    private final String username;
    private final String password;

    public RegisterUserInteraction(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static RegisterUserInteraction withCredentials(String username, String password) {
        return instrumented(RegisterUserInteraction.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on("SIGN_UP_BTN"),
                Enter.theValue(username).into("USERNAME_TXT"),
                Enter.theValue(password).into("PASSWORD_TXT"),
                Click.on("SIGN_UP_POP_UP_BTN")
        );
    }
}

