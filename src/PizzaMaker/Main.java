package PizzaMaker;

public class Main {

    public static void main(String[]args) {
        Pizza smallTripleToppingPizza =
                new PizzaBuilder().setPizzaChainName("Pizza Hut").setPizzaSize("small")
                        .setPizzaToppings("Pepperoni").setPizzaToppings("Olives").setPizzaToppings("Mushrooms").createPizza();

        smallTripleToppingPizza.eat();

        Pizza meduimSixToppingPizza = new PizzaBuilder().setPizzaChainName("Pizza Hut").setPizzaSize("Medium")
                .setPizzaToppings("Chicken").setPizzaToppings("Spicy Pork").setPizzaToppings("Tomato and Basil")
                .setPizzaToppings("Peppers").setPizzaToppings("Ham and Pineapple").setPizzaToppings("Ham").createPizza();

        meduimSixToppingPizza.eat();

        Pizza largeNineToppingPizza = new PizzaBuilder().setPizzaChainName("Pizza Hut").setPizzaSize("Large")
                .setPizzaToppings("Extra Cheese").setPizzaToppings("Onions").setPizzaToppings("Sausage")
                .setPizzaToppings("Beef").setPizzaToppings("Spinach").setPizzaToppings("Pesto")
                .setPizzaToppings("Bacon").setPizzaToppings("Pepperoni").setPizzaToppings("Olives").createPizza();

        largeNineToppingPizza.eat();


        Pizza pizzaHutLargePizza = new PizzaBuilder().setPizzaChainName("Pizza Hut").setPizzaSize("Large")
                .setPizzaToppings("Pepperoni").setPizzaToppings("Sausage").setPizzaToppings("Bacon").createPizza();

        Pizza pizzaHutSmallPizza = new PizzaBuilder().setPizzaChainName("Pizza Hut").setPizzaSize("Small")
                .setPizzaToppings("Extra Cheese").setPizzaToppings("Tomato and Basil").createPizza();

        Pizza littleCaesarsMediumPizza = new PizzaBuilder().setPizzaChainName("Little Caesars").setPizzaSize("Medium")
                .setPizzaToppings("Chicken").setPizzaToppings("Spicy Pork").setPizzaToppings("Tomato and Basil")
                .setPizzaToppings("Peppers").setPizzaToppings("Spinach").setPizzaToppings("Pesto")
                .setPizzaToppings("Bacon").setPizzaToppings("Pepperoni").createPizza();

        Pizza littleCaesarsSmallPizza = new PizzaBuilder().setPizzaChainName("Little Caesars").setPizzaSize("Small")
                .setPizzaToppings("Spicy Pork").setPizzaToppings("Peppers").setPizzaToppings("Ham and Pineapple")
                .setPizzaToppings("Ham").setPizzaToppings("Spinach").setPizzaToppings("Pesto").createPizza();

        Pizza dominosSmallPizza = new PizzaBuilder().setPizzaChainName("Dominos").setPizzaSize("Small")
                .setPizzaToppings("Olives").createPizza();

        Pizza dominosLargePizza = new PizzaBuilder().setPizzaChainName("Dominos").setPizzaSize("Large")
                .setPizzaToppings("Onions").setPizzaToppings("Ham").setPizzaToppings("Pesto").createPizza();

        pizzaHutLargePizza.eat();
        pizzaHutSmallPizza.eat();
        littleCaesarsMediumPizza.eat();
        littleCaesarsSmallPizza.eat();
        dominosSmallPizza.eat();
        dominosLargePizza.eat();

    }
}
