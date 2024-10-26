package questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class IsProductInCart {

    public static Question<Boolean> displayed(String product) {
        return actor -> {
            String cartContent = Text.of("//div[@id='cart']//h4").viewedBy(actor).asString();
            return cartContent.contains(product);
        };
    }
}
