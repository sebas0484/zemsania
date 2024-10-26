Feature: Comprar productos en Product Store

  Scenario Outline: Registro de un nuevo usuario
    Given que estoy en la página de Product Store
    When registro un nuevo usuario con nombre "<username>" y contraseña "<password>"
    Then debería ver un mensaje de registro exitoso

    Examples:
      | username | password |
      | semuron  | 1234     |

  Scenario Outline: Compra de un producto
    Given que estoy en la página de Product Store
    When selecciono la categoría "<category>"
    And elijo el producto "<product>"
    And lo añado al carrito
    Then debería ver el producto "<product>" en el carrito

    Examples:
      | category | product     |
      | Phones   | Samsung S10 |
      | Laptops  | Sony Vaio   |