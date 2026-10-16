package MaccronutruentMeal;

import java.util.ArrayList;
import java.util.Random;

public class CarbsFactory {

    private static CarbsFactory instance;
    private CarbsFactory(){}

    public static CarbsFactory getInstance(){
        if(instance == null){
            instance = new CarbsFactory();
        }

        return instance;
    }

    public String createCarbPlan(String foodAccommodation){

        ArrayList<String> carbsOptions = new ArrayList<>();

        switch(foodAccommodation) {
            case "No Restriction":
                carbsOptions.add("Cheese");
                carbsOptions.add("Bread");
                carbsOptions.add("Lentils");
                carbsOptions.add("Pistachio");
                break;
            case "Paleo":
                carbsOptions.add("Pistachio");
                break;
            case "Vegan":
                carbsOptions.add("Bread");
                carbsOptions.add("Lentils");
                carbsOptions.add("Pistachio");
                break;
            case "Nut Allergy":
                carbsOptions.add("Cheese");
                carbsOptions.add("Bread");
                carbsOptions.add("Lentils");
                break;
            default:
                throw new IllegalArgumentException("Invalid diet plan");
        }

        Random randomCarbOption = new Random();

        return carbsOptions.get(randomCarbOption.nextInt(carbsOptions.size()));
    }

}
