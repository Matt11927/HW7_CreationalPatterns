package PizzaMaker;

import java.util.ArrayList;

public class PizzaBuilder {
    private String pizzaChainName;
    private String pizzaSize;
    private ArrayList<String> pizzaToppings = new ArrayList<>();
    public PizzaBuilder(){};

    public PizzaBuilder setPizzaChainName(String pizzaChainName){
        this.pizzaChainName = pizzaChainName;
        return this;
    }

    public PizzaBuilder setPizzaSize(String pizzaSize){
            this.pizzaSize = checkForPizzaSizeIsValid(pizzaSize);
            return this;
    }

    private String checkForPizzaSizeIsValid(String pizzaSize) {
        if(!pizzaSize.equalsIgnoreCase("Small") &&
                !pizzaSize.equalsIgnoreCase("Medium") &&
                !pizzaSize.equalsIgnoreCase("Large")){

            throw new IllegalArgumentException("Pizza Must be Small, Medium, or Large");
        }
        return pizzaSize;
    }

    public PizzaBuilder setPizzaToppings(String pizzaToppings){
        this.pizzaToppings.add(pizzaToppings);
        return this;
    }

    public Pizza createPizza(){
        if(PizzaSizeRequire()) {
            return new Pizza(pizzaChainName,pizzaSize,pizzaToppings);
        }
        return null;
    }

    private boolean PizzaSizeRequire() {
        if(pizzaSize == null){
            throw new IllegalArgumentException("Pizza Size is Required");
        }else{
            return true;
        }
    }


}
