package PizzaMaker;

import java.util.ArrayList;

public class Pizza {

    private String pizzaChainName;
    private String pizzaSize;
    private ArrayList<String> pizzaToppings = new ArrayList<>();

    public Pizza(String pizzaChainName, String pizzaSize, ArrayList<String> pizzaToppings){
        this.pizzaChainName = pizzaChainName;
        this.pizzaSize = pizzaSize;
        this.pizzaToppings = pizzaToppings;
    }

    void eat(){
        System.out.println("Pizza Chain : " + pizzaChainName);
        System.out.println("Pizza Size : " + pizzaSize);

        System.out.println("\nYour Selected Toppings for your pizza. ");
        for(String pizzaToppings : pizzaToppings){
            System.out.println(pizzaToppings);
        }
        System.out.println();
    }

}
