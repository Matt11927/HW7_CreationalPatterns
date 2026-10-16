package MaccronutruentMeal;

import java.util.ArrayList;
import java.util.Random;

public class ProteinFactory {

    private static ProteinFactory instance;
    private ProteinFactory(){}

    public static ProteinFactory getInstance(){
        if(instance == null){
            instance = new ProteinFactory();
        }
        return instance;
    }

    public String createProteinPlan(String foodAccommodation){

        ArrayList<String> proteinOptions = new ArrayList<>();

        switch(foodAccommodation){

            case "No Restriction":
                proteinOptions.add("Fish");
                proteinOptions.add("Chicken");
                proteinOptions.add("Beef");
                proteinOptions.add("Tofu");
                break;
            case "Paleo":
                proteinOptions.add("Fish");
                proteinOptions.add("Chicken");
                proteinOptions.add("Beef");
                break;
            case "Vegan":
                proteinOptions.add("Tofu");
                break;
            case "Nut Allergy":
                proteinOptions.add("Fish");
                proteinOptions.add("Chicken");
                proteinOptions.add("Beef");
                proteinOptions.add("Tofu");
                break;
            default:
                throw new IllegalArgumentException("Invalid diet plan");

        }
        Random randomProteinOption = new Random();

        return proteinOptions.get(randomProteinOption.nextInt(proteinOptions.size()));
    }

}
