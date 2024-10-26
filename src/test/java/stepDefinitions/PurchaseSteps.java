package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import questions.IsProductInCart;
import tasks.AddToCart;
import tasks.ChooseProduct;
import tasks.SelectCategory;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PurchaseSteps {

    @Given("que estoy en la página de Product Store")
    public void openProductStore() {
        OnStage.theActorInTheSpotlight().attemptsTo(Open.url("https://www.demoblaze.com/#"));
    }

    @When("selecciono la categoría {string}")
    public void selectCategory(String category) {
        OnStage.theActorInTheSpotlight().attemptsTo(SelectCategory.withName(category));
    }

    @When("elijo el producto {string}")
    public void chooseProduct(String product) {
        OnStage.theActorInTheSpotlight().attemptsTo(ChooseProduct.withName(product));
    }

    @When("lo añado al carrito")
    public void addToCart() {
        OnStage.theActorInTheSpotlight().attemptsTo(AddToCart.action());
    }

    @Then("debería ver el producto {string} en el carrito")
    public void verifyProductInCart(String product) {
        OnStage.theActorInTheSpotlight().should(seeThat(IsProductInCart.displayed(product)));
    }
}

