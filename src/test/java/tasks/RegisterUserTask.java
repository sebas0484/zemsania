package tasks;

import interactions.RegisterUserInteraction;
import models.User;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class RegisterUserTask implements Task {

    private final User user;

    public RegisterUserTask(User user) {
        this.user = user;
    }

    public static RegisterUserTask withDetails(String username, String password) {
        return instrumented(RegisterUserTask.class, new User(username, password));
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                RegisterUserInteraction.withCredentials(user.getUsername(), user.getPassword())
        );
    }
}

