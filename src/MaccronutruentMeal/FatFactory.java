package MaccronutruentMeal;

import java.util.ArrayList;
import java.util.Random;

public class FatFactory {

    private static FatFactory instance;
    private FatFactory(){}

    public static FatFactory getInstance(){
        if(instance == null){
            instance = new FatFactory();
        }
        return instance;
    }

    public String createFatPlan(String foodAccommodation){

        ArrayList<String> fatOptions = new ArrayList<>();

        switch (foodAccommodation){
            case "No Restriction":
                fatOptions.add("Avocado");
                fatOptions.add("Sour Cream");
                fatOptions.add("Tuna");
                fatOptions.add("Peanuts");
                break;
            case "Paleo":
                fatOptions.add("Avocado");
                fatOptions.add("Tuna");
                fatOptions.add("Peanuts");
                break;
            case "Vegan":
                fatOptions.add("Avocado");
                fatOptions.add("Peanuts");
                break;
            case "Nut Allergy":
                fatOptions.add("Avocado");
                fatOptions.add("Sour Cream");
                fatOptions.add("Tuna");
                break;
            default:
                throw new IllegalArgumentException("Invalid diet plan");

        }

        Random randomFatOption = new Random();

        return fatOptions.get(randomFatOption.nextInt(fatOptions.size()));
    }


}
