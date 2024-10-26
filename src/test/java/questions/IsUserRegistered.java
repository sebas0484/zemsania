package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IsUserRegistered {

    private static final String SUCCESS_MESSAGE_SELECTOR = "nava";

    public static Question<Boolean> successful() {
        return actor -> {
            Target successMessage = Target.the("mensaje de registro exitoso")
                    .located(By.id(SUCCESS_MESSAGE_SELECTOR));

            return successMessage.resolveFor(actor).isVisible();
        };
    }
}

