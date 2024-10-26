package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("Seleccionar categoría")
public class SelectCategory implements Task {

    private final String category;

    public SelectCategory(String category) {
        this.category = category;
    }

    public static SelectCategory withName(String category) {
        return new SelectCategory(category);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on("//a[text()='" + category + "']"));
    }
}

