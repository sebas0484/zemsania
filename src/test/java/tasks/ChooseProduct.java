package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("Elegir producto")
public class ChooseProduct implements Task {

    private final String product;

    public ChooseProduct(String product) {
        this.product = product;
    }

    public static ChooseProduct withName(String product) {
        return new ChooseProduct(product);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on("//h4[contains(text(), '" + product + "')]/.."));
    }
}

