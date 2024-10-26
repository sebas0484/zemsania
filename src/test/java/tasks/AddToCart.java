package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.annotations.Subject;

@Subject("Añadir al carrito")
public class AddToCart implements Task {

    public static AddToCart action() {
        return new AddToCart();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on("//a[contains(text(), 'Add to cart')]"));

    }
}

